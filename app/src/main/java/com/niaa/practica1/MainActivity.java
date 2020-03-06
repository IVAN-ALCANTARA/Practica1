package com.niaa.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.num1);
        btn1=(Button)findViewById(R.id.btn1);
    }

    public void segundaPantalla(View view){
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("dato1", num1.getText().toString());
        startActivity(intent);
        finish();
    }
}
