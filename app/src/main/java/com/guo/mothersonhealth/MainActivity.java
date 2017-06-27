package com.guo.mothersonhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.guo.mothersonhealth.activity.YunQianActivity;
import com.guo.mothersonhealth.base.BaseActivity;


public class MainActivity extends BaseActivity {
    private TextView yunQianTV, yunChanTV, erTongTV, jieZhongTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        initData();
    }

    @Override
    public void initWidget() {
        yunQianTV = (TextView) findViewById(R.id.tv_activity_main_yunQian);
        yunChanTV = (TextView) findViewById(R.id.tv_activity_main_yunChan);
        erTongTV = (TextView) findViewById(R.id.tv_activity_main_erTong);
        jieZhongTV = (TextView) findViewById(R.id.tv_activity_main_jieZhong);
        yunQianTV.setOnClickListener(this);
        yunChanTV.setOnClickListener(this);
        erTongTV.setOnClickListener(this);
        jieZhongTV.setOnClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()) {
            case R.id.tv_activity_main_yunQian:
                Intent intent=new Intent(MainActivity.this,YunQianActivity.class);
                startActivity(intent);
//                finish();
//                startActivity(new Intent(this, YunQianActivity.class));
                break;
            case R.id.tv_activity_main_yunChan:
//                startActivity(new Intent(this, YunChanActivity.class));
                break;
            case R.id.tv_activity_main_erTong:
//                startActivity(new Intent(this, ErTongActivity.class));
                break;
            case R.id.tv_activity_main_jieZhong:
//                startActivity(new Intent(this, JieZhongActivity.class));
                break;
        }

    }
}
