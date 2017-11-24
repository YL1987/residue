package com.yyq.designmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.yyq.designmode.Composite.Composite.Folder;
import com.yyq.designmode.Composite.Leaf.JavaFile;
import com.yyq.designmode.Decorator.Component.Gift;
import com.yyq.designmode.Decorator.ConcreteComponent.BirthdayGift;
import com.yyq.designmode.Decorator.ConcreteDecorator.SimplePackaging;

public class MainActivity extends AppCompatActivity {

    private Button mComposite;
    private Button mDecorator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mComposite = findViewById(R.id.composite);
        mDecorator = findViewById(R.id.decorator);
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
    }

    private void decorator() {
//        Gift gift = new Gift() {
//            @Override
//            public void packaging() {
//                Log.d("Gift", "wobumingbai");
//            }
//        };
        Gift gift1=new BirthdayGift();
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
