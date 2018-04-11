package com.example.yy.test1module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * crate by yy on 2018-4-9
 * describle:模块化测试
 */
@Route(path = "/test1/Test1Activity")
public class Test1Activity extends AppCompatActivity {

    @Autowired
    String name;

    TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        ARouter.getInstance().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        nameText = findViewById(R.id.name);
//        nameText.append(name);
    }
}
