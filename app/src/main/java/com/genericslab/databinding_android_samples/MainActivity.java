package com.genericslab.databinding_android_samples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.genericslab.databinding_android_samples.data.DataSource;
import com.genericslab.databinding_android_samples.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Get data
        DataSource dataSource = DataSource.get("World");

        dataBinding.setDataSource(dataSource);
    }
}
