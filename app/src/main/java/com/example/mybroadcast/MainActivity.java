package com.example.mybroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String staticAction="com.duduyun.action.RADAR_STATUS";
    private static final String mTag="com.duduyun.action.RADAR_STATUS";
    private MyStaticReceiver staticReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStaticReceiver();
        send();
    }

    private void initStaticReceiver(){
        staticReceiver =new MyStaticReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(staticAction);
        registerReceiver(staticReceiver,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(staticReceiver);
    }

//    public void btn_click(View view){
//        Intent intent = new Intent();
//        intent.setAction(staticAction);
//        sendBroadcast(intent);
//        Log.d(mTag, "btn_click: 模拟发送");
//    }

    public void send(){
        Intent intent = new Intent();
        intent.setAction(staticAction);
        sendBroadcast(intent);
        Log.d(mTag, "btn_click: 模拟发送");
    }

}
