package com.example.mybroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class MyStaticReceiver extends BroadcastReceiver {
    private static final String mTag="com.duduyun.action.RADAR_STATUS";
    private static final String Action="com.duduyun.action.RADAR_STATUS_RESPONE";
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
        Log.d(mTag, "onReceive: 自定义广播接收者");
        if(mTag.equals(intent.getAction()))
        {
            Log.d(mTag,intent.getAction());//接收广播行为
//            Intent intt = new Intent();
//            sendBroadcast(intt);

        }

    }



}
