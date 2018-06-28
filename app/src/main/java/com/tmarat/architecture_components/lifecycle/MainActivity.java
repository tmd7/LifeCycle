package com.tmarat.architecture_components.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getSimpleName();
  MyServer myServer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    myServer = new MyServer();

    getLifecycle().addObserver(myServer);
  }

  @Override protected void onStart() {
    super.onStart();
    Log.d(TAG, "onStart");
  }

  @Override protected void onStop() {
    super.onStop();
    Log.d(TAG, "onStop");
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    getLifecycle().removeObserver(myServer);
  }
}
