package com.example.zhy_custom_viewgroup;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by Administrator on 2016/6/14.
 */
public class TestActivity extends Activity implements OnClickListener {

    private static final String TAG = "TestActivity";
    private static final String KEY_SHE = "SHE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Log.e(TAG, "onCreate: 1");

        Log.w(TAG, "onCreate: 1");

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case 1:

                break;
            case 2:

                break;
            default:
                break;
        }

    }
}
