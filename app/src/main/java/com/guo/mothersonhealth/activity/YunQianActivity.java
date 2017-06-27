package com.guo.mothersonhealth.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.guo.mothersonhealth.R;
import com.guo.mothersonhealth.base.BaseActivity;

/**
 * Created by GN on 2017/5/23.
 */

public class YunQianActivity extends BaseActivity {
    private LinearLayout linearLayout_jihua,linearLayout_zhengce,linearLayout_xiguan,
            linearLayout_yaowu,linearLayout_jiankang,linearLayout_zhuyi,
            linearLayout_xinxi,linearLayout_jilu,linearLayout_jiancha,
            linearLayout_tiwen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yunqing);
        initWidget();
        initData();

    }

    @Override
    public void initWidget() {
        super.initWidget();
        linearLayout_jihua = (LinearLayout) findViewById(R.id.linear_jihua);
        linearLayout_zhengce = (LinearLayout) findViewById(R.id.linear_huimin);
        linearLayout_xiguan = (LinearLayout) findViewById(R.id.linear_zhishidian);
        linearLayout_yaowu = (LinearLayout) findViewById(R.id.linear_yaowu);
        linearLayout_jiankang = (LinearLayout) findViewById(R.id.linear_jiankang);
        linearLayout_zhuyi = (LinearLayout) findViewById(R.id.linear_zhuyi);
        linearLayout_xinxi = (LinearLayout) findViewById(R.id.linear_xinxi);
        linearLayout_jilu = (LinearLayout) findViewById(R.id.linear_jilu);
        linearLayout_jiancha = (LinearLayout) findViewById(R.id.linear_jiancha);
        linearLayout_tiwen = (LinearLayout) findViewById(R.id.linear_tiwen);
        linearLayout_jihua.setOnClickListener(this);
        linearLayout_zhengce.setOnClickListener(this);
        linearLayout_xiguan.setOnClickListener(this);
        linearLayout_yaowu.setOnClickListener(this);
        linearLayout_jiankang.setOnClickListener(this);
        linearLayout_zhuyi.setOnClickListener(this);
        linearLayout_xinxi.setOnClickListener(this);
        linearLayout_jilu.setOnClickListener(this);
        linearLayout_jiancha.setOnClickListener(this);
        linearLayout_tiwen.setOnClickListener(this);
    }

    @Override
    public void initData() {
        super.initData();
    }


    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.linear_jihua:
                Intent intent=new Intent(YunQianActivity.this,JiHuaActivity.class);
                startActivity(intent);
                break;
            case R.id.linear_huimin:
                Intent intent2=new Intent(YunQianActivity.this,HuiMinActivity.class);
                startActivity(intent2);
                break;
            case R.id.linear_zhishidian:
                Intent intent3=new Intent(YunQianActivity.this,XiGuanActivity.class);
                startActivity(intent3);
                break;
            case R.id.linear_yaowu:
                Intent intent4=new Intent(YunQianActivity.this,YaoWuActivity.class);
                startActivity(intent4);
                break;
            case R.id.linear_jiankang:
                Intent intent5=new Intent(YunQianActivity.this,JianKangActivity.class);
                startActivity(intent5);
                break;
            case R.id.linear_zhuyi:
                Intent intent6=new Intent(YunQianActivity.this,ZhuYiActivity.class);
                startActivity(intent6);

                break;
            case R.id.linear_xinxi:
                Intent intent7=new Intent(YunQianActivity.this,XinXiActivity.class);
                startActivity(intent7);
                break;
            case R.id.linear_jilu:
                Intent intent8=new Intent(YunQianActivity.this,JiLuActivity.class);
                startActivity(intent8);
                break;
            case R.id.linear_jiancha:
                Intent intent9=new Intent(YunQianActivity.this,YunJianActivity.class);
                startActivity(intent9);
                break;
            case R.id.linear_tiwen:
                break;


        }
    }
}
