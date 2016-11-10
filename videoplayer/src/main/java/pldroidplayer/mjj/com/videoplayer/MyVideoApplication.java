package pldroidplayer.mjj.com.videoplayer;

import android.app.Application;

/**
 * Created by xinghongfei on 16/8/12.
 */
public class MyVideoApplication extends Application {

    public static MyVideoApplication myVideoApplication;

    public static Application getContext() {
        return myVideoApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myVideoApplication = this;
    }

}
