package com.example.mybroadcast;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String staticAction="com.duduyun.action.RADAR_STATUS";
    private static final String mTag="com.duduyun.action.RADAR_STATUS";
//    public MyService() {
//    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyService", "onDestroy executed");
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService", "onStartCommand executed");
        Intent intentToQT = new Intent();
        intentToQT.setAction(staticAction);
        sendBroadcast(intentToQT);
        Log.d(mTag, "btn_click: 模拟发送");
        return super.onStartCommand(intent, flags, startId);
    }

}