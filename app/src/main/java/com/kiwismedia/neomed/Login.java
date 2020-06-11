package com.kiwismedia.neomed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void createAccount(View view) {
        Intent iSignUp = new Intent(Login.this, SignUp.class);
        startActivity(iSignUp);
        finish();
    }
}
