package com.sanketguru.mydaggersample

/**
 * Created by Raju on 27-02-2018.
 */
import android.util.Log

/**
 * Created by Sanket Gurav on 26-02-2018.
 */
interface Calculate {
    fun getData(a: Int, b: Int): String
}

class Add constructor(val data:String): Calculate {
    override fun getData(a: Int, b: Int): String = "Adding : $data" + (a + b)
    init {
        Log.v("Data","its old")
    }
}

class Subtract : Calculate {

    override fun getData(a: Int, b: Int): String = "Subtracting  : " + (a - b)
}

class Xyz (val cal:Calculate ){

}

