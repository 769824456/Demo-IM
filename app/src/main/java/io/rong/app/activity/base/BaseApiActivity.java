package io.rong.app.activity.base;

import com.sea_monster.exception.BaseException;
import com.sea_monster.network.AbstractHttpRequest;
import com.sea_monster.network.ApiCallback;

import io.rong.app.activity.base.BaseActionBarActivity;

/*
 * PROJECT_NAME :Demo-IM
 * VERSION :[V 1.0.0]
 * AUTHOR :  yulongsun 
 * CREATE AT : 8/4/2015 2:31 PM
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 * 1.ApiCallback在IMKit类工程里面
 * 2.
 */
public abstract class BaseApiActivity extends BaseActionBarActivity implements ApiCallback {
    //父类定义抽象方法，具体怎么做子类去实现
    /**成功回调
     * @param request
     * @param obj
     */
    public abstract void onCallApiSuccess(AbstractHttpRequest request, Object obj);

    /**失败回调
     * @param request
     * @param e
     */
    public abstract void onCallApiFailure(AbstractHttpRequest request, BaseException e);


    @Override
    public void onComplete(final AbstractHttpRequest abstractHttpRequest, final Object o) {
        //在主方法中
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                onCallApiSuccess(abstractHttpRequest,o);
            }
        });
    }

    @Override
    public void onFailure(final AbstractHttpRequest abstractHttpRequest, final BaseException e) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                onCallApiFailure(abstractHttpRequest, e);
            }
        });
    }
}
