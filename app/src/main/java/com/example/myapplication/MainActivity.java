package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import com.google.android.material.button.MaterialButton;

public class MainActivity<view> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView user= findViewById(R.id.accelerate);
        TextView contra= findViewById(R.id.password_toggle);

        MaterialButton loginnbtn =(MaterialButton) findViewById(R.id.loginnbtn);

        loginnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals("Ale14")&& contra.getText().toString().equals("Ale14")){

                }else{
                    Toast.makeText(MainActivity.this,"FALLO",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void activity(view vista){
        Intent miI = new Intent(this,MainActivity2.class);
        startActivity(miI);
    }

}