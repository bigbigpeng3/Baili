package com.example.administrator.myrxjavatest;

import android.support.annotation.MainThread;

import rx.Observable;
import rx.functions.Action1;

/**
 * Description :Test Hello World with Rxjava
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-1-26
 */
public class MyHelloWorldWithRx {

    public static void main(String[] args){

        hello("Rxjava","what?");

    }
    public static void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {

            @Override
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }
        });
    }
}
