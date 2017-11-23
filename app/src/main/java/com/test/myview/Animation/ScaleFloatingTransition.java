package com.test.myview.Animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

import com.ufreedom.floatingview.spring.SimpleReboundListener;
import com.ufreedom.floatingview.spring.SpringHelper;
import com.ufreedom.floatingview.transition.YumFloating;

/**
 * 作者：yangyouqiao on 2017/11/23 14:46
 * 功能：
 */

public class ScaleFloatingTransition implements FloatingTransition {

    private int duration;
    @Override
    public void applyFloating(final YumFloating yumFloating) {
        duration=1000;
        ValueAnimator alphaAnimator = ObjectAnimator.ofFloat(1.0f, 0.0f);
        alphaAnimator.setDuration(duration);
        alphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                yumFloating.setAlpha((Float) valueAnimator.getAnimatedValue());
            }
        });
        alphaAnimator.start();
        SpringHelper.createWithBouncinessAndSpeed(0.0f, 1.0f, 10, 10)
                .reboundListener(new SimpleReboundListener() {
                    @Override
                    public void onReboundUpdate(double currentValue) {
                        yumFloating.setScaleX((float) currentValue);
                        yumFloating.setScaleY((float) currentValue);
                    }
                }).start(yumFloating);
    }
}
