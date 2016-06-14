package com.example.zhy_custom_viewgroup;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/6/14.
 */
public class TestActivity extends Activity {

    private static final String TAG = "TestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Log.e(TAG, "onCreate: 1");
        Log.e(TAG, "onCreate: 2");
        Log.e(TAG, "onCreate: 3");

    }
}
