package com.sanketguru.mydaggersample;

/**
 * Created by Sanket Gurav on 1/10/2018.
 */

public class Add implements Calculate {

    @Override
    public String getData(int a, int b) {
        return "Adding : "+(a+b);
    }
}
