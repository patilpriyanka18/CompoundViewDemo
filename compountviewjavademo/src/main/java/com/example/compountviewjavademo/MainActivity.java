package com.example.compountviewjavademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnAdd).setOnClickListener(this::onClick);

        final LayoutInflater inflate2=getLayoutInflater();
        inflate2.inflate(R.layout.compound_view,(LinearLayout)findViewById(R.id.layoutCompound),true);

    }

    private void onClick(View view) {
        //The LayoutInflater you can declared in three ways....

        //First way...
        // final LayoutInflater inflater=(getLayoutInflater()getSystemService(LAYOUT_INFLATER_SERVICE));

        //Second way to creat Inflater below..
        //final LayoutInflater inflater1=LayoutInflater.from(this);

        //Third way using Activity class gives you something called as getLayoutInflater..
        final LayoutInflater inflate2=getLayoutInflater();
        inflate2.inflate(R.layout.compound_view,(LinearLayout)findViewById(R.id.layoutCompound),true);

    }
}
