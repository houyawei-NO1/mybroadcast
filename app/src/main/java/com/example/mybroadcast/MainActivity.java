package com.example.mybroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private static final String staticAction="com.duduyun.action.RADAR_STATUS";
    private static final String mTag="com.duduyun.action.RADAR_STATUS";
//    private MyStaticReceiver staticReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        initStaticReceiver();
        Intent startIntent = new Intent(this, MyService.class);
        startService(startIntent);
    }

//    private void initStaticReceiver(){
//        staticReceiver =new MyStaticReceiver();
//        IntentFilter intentFilter = new IntentFilter();
//        intentFilter.addAction(staticAction);
//        registerReceiver(staticReceiver,intentFilter);
//    }
//
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

//    public void send(){
//        Intent intent = new Intent();
//        intent.setAction(staticAction);
//        sendBroadcast(intent);
//        Log.d(mTag, "btn_click: 模拟发送");
//    }


}
