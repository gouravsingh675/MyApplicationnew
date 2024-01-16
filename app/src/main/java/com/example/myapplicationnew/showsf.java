package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class showsf extends AppCompatActivity {
    SharedPreferences sf;
    TextView tv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showsf);
        sf=getSharedPreferences("sfname",MODE_PRIVATE);
        tv=findViewById(R.id.textView3);
    }

    public void sfread(View view) {
        tv.setText(sf.getString("grv","default value"));

    }
}