package com.example.miye.helloworldapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class HelloWorldMainActivity extends AppCompatActivity {

    private static final String    TAG                 = "HelloWorld::Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world_main);
        Log.d(TAG, "HelloWorldMainActivity Log Test");
    }
}
