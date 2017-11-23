package com.test.facadedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.test.facadedemo.Facade.AbstractFacade;
import com.test.facadedemo.Facade.NoodlesRestaurant;
import com.test.facadedemo.Facade.Restaurant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Restaurant restaurant = new Restaurant();
        restaurant.eat();
        AbstractFacade abstractFacade = new NoodlesRestaurant();
        abstractFacade.eat();
    }
}
