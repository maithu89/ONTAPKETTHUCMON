package com.example.ontapkethucmon;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private MyBinder myBinder = new MyBinder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }
    public class MyBinder extends Binder {
        MyService getService(){
            return MyService.this;
        }
    }
    public double TinhTien(double a, double b, double c, double d){
        return a+ b + c +d;
    }

//    public double TinhTien(double t1, double t2, double t3, double t4){
//        return t1+ t2 + t3 + t4;
//    }

}
