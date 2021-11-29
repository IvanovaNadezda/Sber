package com.example.sber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        tv4 = findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            double result = bundle.getDouble("ccc");
            tv4.setText(String.valueOf(result));
        }
    }
}