package com.wzq.arouterdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/test/main")
public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toast.makeText(this, "首页app", Toast.LENGTH_SHORT).show();

  }

  public void goHome(View view) {
    ARouter.getInstance().build("/home/main")
        .withString("key_name", "wzq")
        .withInt("key_age", 30).navigation();
  }

  public void goChat(View view) {
    ARouter.getInstance().build("/chat/main")
        .withChar("key_char", 'c').navigation();
  }
}
