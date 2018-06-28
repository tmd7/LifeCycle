package com.tmarat.architecture_components.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class MyServer implements LifecycleObserver{

  private static final String TAG = MyServer.class.getSimpleName();

  @OnLifecycleEvent(Lifecycle.Event.ON_START)
  public void connect() {
    Log.d(TAG, "connect");
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
  public void disconnect() {
    Log.d(TAG, "disconnect");
  }

}
