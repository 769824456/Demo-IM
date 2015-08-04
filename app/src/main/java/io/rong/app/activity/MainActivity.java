package io.rong.app.activity;

import android.os.Bundle;

import io.rong.app.R;
import io.rong.app.activity.base.BaseActionBarActivity;


/*
 * PROJECT_NAME :IM_DEMO
 * VERSION :[V 1.0.0]
 * AUTHOR :  yulongsun 
 * CREATE AT : 7/29/2015 4:17 PM
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 */
public class MainActivity extends BaseActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
