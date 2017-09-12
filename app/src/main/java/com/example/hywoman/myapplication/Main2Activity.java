package com.example.hywoman.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void PB( View view ){
        EditText aa = (EditText) findViewById(R.id.editText);

        TextView bb = (TextView) findViewById(R.id.textView);
        bb.setText(aa.getText());
    }
}
