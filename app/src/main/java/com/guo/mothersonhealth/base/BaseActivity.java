package com.guo.mothersonhealth.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.guo.mothersonhealth.R;


public class BaseActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    public void initWidget(){

    }
    public void initData(){

    }

    @Override
    public void onClick(View v) {

    }
}
