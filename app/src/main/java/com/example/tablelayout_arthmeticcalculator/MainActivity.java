package com.example.tablelayout_arthmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText t1,t2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.add);
        b2=findViewById(R.id.sub);
        b3=findViewById(R.id.mult);
        b4=findViewById(R.id.div);
        t1=findViewById(R.id.num1);
        t2=findViewById(R.id.num2);
        tv1=findViewById(R.id.tv1);
        b1.setOnClickListener(v->{
            int n1=Integer.parseInt(t1.getText().toString());
            int n2=Integer.parseInt(t2.getText().toString());
            tv1.setText(String.valueOf(n1+n2));
        });
        b2.setOnClickListener(v->{
            int n1=Integer.parseInt(t1.getText().toString());
            int n2=Integer.parseInt(t2.getText().toString());
            tv1.setText(String.valueOf(n1-n2));
        });
        b3.setOnClickListener(v->{
            int n1=Integer.parseInt(t1.getText().toString());
            int n2=Integer.parseInt(t2.getText().toString());
            tv1.setText(String.valueOf(n1*n2));
        });
        b4.setOnClickListener(v->{
            int n1=Integer.parseInt(t1.getText().toString());
            int n2=Integer.parseInt(t2.getText().toString());
            tv1.setText(String.valueOf(n1/n2));
        });

    }
}