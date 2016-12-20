package com.example.rain.test01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;
    private Button button07;
    private Button button08;
    private Button button09;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        button01 = (Button) findViewById(R.id.button01);
        button02 = (Button) findViewById(R.id.button02);
        button03 = (Button) findViewById(R.id.button03);
        button04 = (Button) findViewById(R.id.button04);
        button05 = (Button) findViewById(R.id.button05);
        button06 = (Button) findViewById(R.id.button06);
        button07 = (Button) findViewById(R.id.button07);
        button08 = (Button) findViewById(R.id.button08);
        button09 = (Button) findViewById(R.id.button09);

        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
        button03.setOnClickListener(this);
        button04.setOnClickListener(this);
        button05.setOnClickListener(this);

        button06.setOnClickListener(this);
        button07.setOnClickListener(this);
        button08.setOnClickListener(this);
        button09.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button01:
                Toast.makeText(this, "Rain111", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,HomeActivity.class));
                
                break;

            case R.id.button02:
                Toast.makeText(this, "Rain222", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button03:
                Toast.makeText(this, "Rain333", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button04:
                Toast.makeText(this, "Rain444", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button05:
                Toast.makeText(this, "Rain555", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button06:
                Toast.makeText(this, "Rain666", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button07:
                Toast.makeText(this, "Rain777", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button08:
                Toast.makeText(this, "Rain888", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button09:
                Toast.makeText(this, "Rain999", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
