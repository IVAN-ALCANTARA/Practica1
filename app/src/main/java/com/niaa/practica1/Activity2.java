package com.niaa.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    EditText num2;
    Button btn2;
    TextView txt;
    String d1= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        num2 = (EditText) findViewById(R.id.num2);
        btn2 = (Button) findViewById(R.id.btn2);
        txt = (TextView)findViewById(R.id.txtmost);

        Bundle extras = getIntent().getExtras();
        d1 = extras.getString("dato1");
        txt.setText(d1);
    }

    public void terceraPantalla(View view){
        Intent intent = new Intent(this, Activity3.class);
        intent.putExtra("dato1", d1);
        intent.putExtra("dato2", num2.getText().toString());
        startActivity(intent);
        finish();
    }
}
