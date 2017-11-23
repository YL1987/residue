package com.test.flyweightdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.test.flyweightdemo.Flyweight.AbstractBox;
import com.test.flyweightdemo.FlyweightFactory.BoxFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AbstractBox i1 = BoxFactory.getInstance().getBox("I");
        i1.display();
    }
}
