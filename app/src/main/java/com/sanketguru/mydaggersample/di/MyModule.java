package com.sanketguru.mydaggersample.di;

import com.sanketguru.mydaggersample.Add;
import com.sanketguru.mydaggersample.Calculate;
import com.sanketguru.mydaggersample.Subtract;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sanket Gurav on 1/10/2018.
 */
@Module
public class MyModule {
    @Provides
    @Named("Subtract")
    Calculate provideCalculator() {
        Calculate cal = new Add();

        return cal;
    }

    @Provides
    @Named("Add")
    Calculate provideAddCalculator() {
        Calculate cal = new Subtract();
        return cal;
    }
}
