package com.qiniu.pili.droid.shortvideo.demo;

import android.app.Application;

import com.tencent.wstt.gt.controller.GTRController;

/**
 * Created by panlin on 2019/7/24.
 */

public class QNShortVideoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //GT
        GTRController.init(this);
    }
}
