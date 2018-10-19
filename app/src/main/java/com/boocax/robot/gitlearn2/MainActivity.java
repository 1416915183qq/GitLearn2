package com.boocax.robot.gitlearn2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //liuly0312 本地master提交 该段代码 至 remote master 001

        //融合了功能1 2 3
        Fun1 f1 = new Fun1();
        Fun2 f2 = new Fun2();
        Fun3 f3 = new Fun3();
        f1.doSth();
        f2.doSth();
        f3.doSth();
    }
}
