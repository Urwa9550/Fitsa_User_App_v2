package com.wasisoft.fitsa_user_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class User_login extends AppCompatActivity {
private Button login_btn;
private TextView page_title,signup;
/*create new account = signup */
private EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        initViews();
        onClick();
    }

    private void onClick() {

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(User_login.this,Signup.class);
                startActivity(intent);
            }
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(User_login.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void initViews() {
        login_btn=findViewById(R.id.login_btn);
        signup=findViewById(R.id.signup_tv);
        email=findViewById(R.id.email);
        password= findViewById(R.id.n_password);

    }
}
