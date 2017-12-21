package com.yyq.designmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.yyq.designmode.Bridge.ConcreteImplementor.Yellow;
import com.yyq.designmode.Bridge.RefineAbstraction.XXLClothes;
import com.yyq.designmode.Composite.Composite.Folder;
import com.yyq.designmode.Composite.Leaf.JavaFile;
import com.yyq.designmode.Decorator.Component.Gift;
import com.yyq.designmode.Decorator.ConcreteComponent.BirthdayGift;
import com.yyq.designmode.Decorator.ConcreteDecorator.SimplePackaging;
import com.yyq.designmode.Facade.Facade.Restaurant;

public class MainActivity extends AppCompatActivity {

    private Button mComposite;
    private Button mDecorator;
    private Button mFacade;
    private Button mBridge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mComposite = findViewById(R.id.composite);
        mDecorator = findViewById(R.id.decorator);
        mFacade = findViewById(R.id.facade);
        mBridge=findViewById(R.id.bridge);
        initL();
    }

    private void initL() {
        mComposite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                composite();
            }
        });
        mDecorator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decorator();
            }
        });
        mFacade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Restaurant restaurant = new Restaurant();
                restaurant.eat();
            }
        });
        mBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bridge();
            }
        });
    }

    private void bridge() {
        Yellow yellow = new Yellow();
        XXLClothes xxlClothes = new XXLClothes();
        xxlClothes.setColor(yellow);
        xxlClothes.getColor();
    }

    private void decorator() {
        Gift gift1 = new BirthdayGift();
        Gift giftPackaging = new SimplePackaging(gift1);
        giftPackaging.packaging();
    }

    private void composite() {
        JavaFile mjavaFile1 = new JavaFile("java1");
        Folder mFolder = new Folder("folder1");
        mFolder.addFile(mjavaFile1);
        mFolder.getFileSuffix();
    }
}
