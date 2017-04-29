package com.example.asus.ketquasoxo.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.asus.ketquasoxo.R;
import com.example.asus.ketquasoxo.VolleyGetSoXo;
import com.wang.avi.AVLoadingIndicatorView;

public class LoadingActivity extends AppCompatActivity {
    AVLoadingIndicatorView avi;
    TextView tvLayKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loading);
        addControls();
    }



    private void addControls() {
        findId();
        new VolleyGetSoXo(LoadingActivity.this).getSoXo();
        avi.smoothToShow();
        tvLayKetQua.setVisibility(View.VISIBLE);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                avi.hide();
                Intent intent = new Intent(LoadingActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }

    private void findId() {
        avi =(AVLoadingIndicatorView)findViewById(R.id.aviXoSo);
        tvLayKetQua  =(TextView)findViewById(R.id.tvLayKetQua);
        avi.hide();
        tvLayKetQua.setVisibility(View.GONE);
    }
}
