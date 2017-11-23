package com.test.myview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.ufreedom.floatingview.Floating;
import com.ufreedom.floatingview.FloatingBuilder;
import com.ufreedom.floatingview.FloatingElement;

public class MainActivity extends AppCompatActivity {

    private TextView mTvHint;
    private ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvHint = findViewById(R.id.tv_hint);
        mImg = findViewById(R.id.img);
        TextView dd = new TextView(this);
        dd.setText("你好");

        FloatingElement builder = new FloatingBuilder()
                .anchorView(mImg)
                .targetView(dd)
                .offsetX(50)
                .offsetY(50)
                .build();

        Floating floating = new Floating(this);
        floating.startFloating(builder);
    }
}
