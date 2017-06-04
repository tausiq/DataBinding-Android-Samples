package com.genericslab.databinding_android_samples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.genericslab.databinding_android_samples.data.DataSource;

public class MainActivity extends AppCompatActivity {

    TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout
        setContentView(R.layout.activity_main);

        // Find layout element by Id
        txtHello = (TextView) findViewById(R.id.txtHello);

        // Get data
        DataSource dataSource = DataSource.get("World");

        // Assign the value in view
        txtHello.setText(dataSource.getMessage());
    }
}
