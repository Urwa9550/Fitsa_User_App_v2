package com.wasisoft.fitsa_user_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
private Button submit;
private EditText n_email,n_password,n_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        initViews();
        onClick();
    }

    private void onClick() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Signup.this,User_login.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        submit=findViewById(R.id.submit);
        n_email=findViewById(R.id.n_email);
        n_password=findViewById(R.id.n_password);
        n_name=findViewById(R.id.n_name);

    }



}
