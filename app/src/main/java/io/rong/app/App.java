package io.rong.app;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.*;

/*
 * PROJECT_NAME :IM_DEMO
 * VERSION :[V 1.0.0]
 * AUTHOR :  yulongsun 
 * CREATE AT : 7/29/2015 4:25 PM
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 */
public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

    }

    /**
     * 获得当前进程号
     *
     * @param context
     * @return
     */
    public static String getCurrentProcessName(Context context) {
        int mPid = android.os.Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);

        for (ActivityManager.RunningAppProcessInfo appProcessInfo : activityManager.getRunningAppProcesses()) {
            if (appProcessInfo.pid == mPid) {
                return appProcessInfo.processName;
            }
        }
        return null;
    }

}
