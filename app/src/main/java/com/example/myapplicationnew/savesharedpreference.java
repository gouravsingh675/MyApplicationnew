package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class savesharedpreference extends AppCompatActivity {
    EditText ed;
    SharedPreferences sf;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savesharedpreference);
        ed=findViewById(R.id.edtextView);
        sf=getSharedPreferences("sfname",MODE_PRIVATE);
        editor=sf.edit();
    }

    public void savesf(View view) {
        editor.putString("grv",ed.getText().toString());
        editor.commit();
    }

    public void gonext(View view) {
        startActivity(new Intent(savesharedpreference.this,showsf.class));
    }
}