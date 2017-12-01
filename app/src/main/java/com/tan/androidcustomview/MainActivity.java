package com.tan.androidcustomview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tan.androidcustomview.widget.CustomTitleView;
import com.tan.androidcustomview.widget.RoundProgressBar;

public class MainActivity extends AppCompatActivity {
    private CustomTitleView mTitleView;
    private RoundProgressBar roundProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTitleView = (CustomTitleView) findViewById(R.id.title_view);
        roundProgressBar = (RoundProgressBar)findViewById(R.id.roundProgressBar);
        roundProgressBar.setProgress(75);
        mTitleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DeleteListItemActivity.class);
                startActivity(intent);
            }
        });
    }
}
