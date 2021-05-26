package com.example.mybroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class MyStaticReceiver extends BroadcastReceiver {
    private static final String mTag="com.duduyun.action.RADAR_STATUS";
    private static final String Action="com.duduyun.action.RADAR_STATUS_RESPONE";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(mTag, "onReceive: 自定义广播接收者");
        if(mTag.equals(intent.getAction()))
        {
            Log.d(mTag,intent.getAction());

        }

    }



}
