package io.rong.app.activity.base;

import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/*
 * PROJECT_NAME :IM_DEMO
 * VERSION :[V 1.0.0]
 * AUTHOR :  yulongsun 
 * CREATE AT : 7/29/2015 4:36 PM
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 */
public class BaseActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //使音量键控制媒体声音
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }
}
