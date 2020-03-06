package com.niaa.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    EditText num3;
    TextView txt2;
    String d1 = null, d2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        num3 = (EditText)findViewById(R.id.num3);
        txt2 = (TextView)findViewById(R.id.txtR);

        Bundle extras = getIntent().getExtras();
        d1 = extras.getString("dato1");
        d2 = extras.getString("dato2");
        txt2.setText(d1 + " " + d2);
    }
    public void ultimaPantalla(View view){
        Intent intent = new Intent(this, Activity4.class);
        intent.putExtra("dato1", d1);
        intent.putExtra("dato2", d2);
        intent.putExtra("dato3", num3.getText().toString());
        startActivity(intent);
        finish();
    }
}
