package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView first,second,three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.firstlocation);
        second=findViewById(R.id.secondlocation);
        three=findViewById(R.id.threeoption);
        first.setOnClickListener(this);
        second.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent=null;
        switch (v.getId())
        {
            case R.id.firstlocation:
                intent=new Intent(MainActivity.this,firstlocation.class);
                startActivity(intent);
                finish();
                break;
            case R.id.secondlocation:
                intent=new Intent(MainActivity.this,secondoption.class);
                startActivity(intent);
                finish();
                break;
            case R.id.threeoption:
                intent=new Intent(MainActivity.this,thirdoption.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
