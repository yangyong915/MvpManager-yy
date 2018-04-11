package com.example.yy.test2module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * crate by yy on 2018-4-9
 * describle:
 */
@Route(path = "/test2/Test2Activity")
public class Test2Activity extends AppCompatActivity {

    @Autowired
    int age;
    TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        ageText = findViewById(R.id.age);
        ageText.append("" + age);
    }
}
