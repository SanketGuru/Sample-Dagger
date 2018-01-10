package com.sanketguru.mydaggersample.di;

/**
 * Created by Sanket Gurav on 1/10/2018.
 */

import android.support.v7.app.AppCompatActivity;

import com.sanketguru.mydaggersample.MyActivity;

import dagger.Component;

@Component(modules = {MyModule.class})
public interface CalculationComponent {
    void inject(MyActivity ac);

}
