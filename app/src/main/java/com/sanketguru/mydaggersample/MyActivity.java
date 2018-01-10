package com.sanketguru.mydaggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.sanketguru.mydaggersample.di.*;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Sanket Gurav on 1/10/2018.
 */

public class MyActivity extends AppCompatActivity {
    @Inject  @Named("Subtract")
    Calculate calc;
    @Inject  @Named("Add")
    Calculate calcA;
    @Override
 public void   onCreate( Bundle save){
        super.onCreate(save);
        setContentView(R.layout.activity_main);
        com.sanketguru.mydaggersample.di.DaggerCalculationComponent.builder().build().inject(this);
        View  v=findViewById(R.id.fab);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("Say",calc.getData(5,1)+calcA.getData(33,2));
            }
        });
    }
}
