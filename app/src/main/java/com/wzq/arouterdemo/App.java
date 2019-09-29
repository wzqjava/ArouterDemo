package com.wzq.arouterdemo;


import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * <p>作者：wzq<p>
 * <p>创建时间：2019-09-29<p>
 * <p>文件描述：<p>
 */
public class App extends Application {

  private boolean isDebug = true;

  @Override
  public void onCreate() {
    super.onCreate();
    initARouter();
  }

  private void initARouter() {
    if (isDebug()) {           // These two lines must be written before init, otherwise these configurations will be invalid in the init process
      ARouter.openLog();     // Print log
      ARouter.openDebug();   // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
    }
    ARouter.init(this); // As early as possible, it is recommended to initialize in the Application

  }

  public boolean isDebug() {
    return isDebug;
  }
}
