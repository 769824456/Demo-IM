package io.rong.app.db;

import android.content.Context;

/*
 * PROJECT_NAME :Demo-IM
 * VERSION :[V 1.0.0]
 * AUTHOR :  yulongsun 
 * CREATE AT : 8/4/2015 4:15 PM
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 */
public class DBManager {
    private static DBManager instance;
    private DaoSession daoSession = null;
    private DaoMaster daoMaster = null;

    /**
     * 单例模式
     *
     * @param context
     * @return
     */
    public static DBManager getInstance(Context context) {
        if (instance == null) {
            synchronized (DBManager.class) {
                return new DBManager(context);
            }
        }
        return instance;
    }

    /**
     * 构造方法私有化
     *
     * @param context
     */
    private DBManager(Context context) {
        if (daoMaster == null) {
            if (daoSession == null) {
                //1.获得数据库帮助对象
                DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, context.getPackageName(), null);
                //2.
                daoMaster=new DaoMaster(helper.getWritableDatabase());
            }
            daoSession = daoMaster.newSession();
        }
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    public void setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    public DaoMaster getDaoMaster() {
        return daoMaster;
    }

    public void setDaoMaster(DaoMaster daoMaster) {
        this.daoMaster = daoMaster;
    }
}
