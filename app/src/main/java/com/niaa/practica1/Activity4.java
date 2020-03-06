package com.niaa.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    TextView tv1, tv2, tv3;
    TextView txtsuma, txtmult;
    String d1 = null, d2 = null, d3 = null;
    int num1, num2, num3, suma, mult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        tv1 = (TextView)findViewById(R.id.txtn1);
        tv2 = (TextView)findViewById(R.id.txtn2);
        tv3 = (TextView)findViewById(R.id.txtn3);
        txtsuma = (TextView)findViewById(R.id.txtsuma);
        txtmult = (TextView)findViewById(R.id.txtmult);

        Bundle extras = getIntent().getExtras();
        d1 = extras.getString("dato1");
        d2 = extras.getString("dato2");
        d3 = extras.getString("dato3");
        tv1.setText(d1);
        tv2.setText(d2);
        tv3.setText(d3);

        num1 = Integer.parseInt(d1);
        num2 = Integer.parseInt(d2);
        num3 = Integer.parseInt(d3);
        suma = (num1+num2+num3);
        mult = num1*num2*num3;

        txtsuma.setText(String.valueOf(suma));
        txtmult.setText(String.valueOf(mult));
    }

    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
