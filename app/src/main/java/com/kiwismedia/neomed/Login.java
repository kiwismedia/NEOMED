package com.kiwismedia.neomed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;
import com.kiwismedia.neomed.ui.home.HomeFragment;

public class Login extends AppCompatActivity {

    MaterialCardView materialCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        materialCardView = findViewById(R.id.login_Btn);
        materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLogin = new Intent(Login.this, MainActivity.class);
                startActivity(iLogin);
                finish();
            }
        });

    }

    public void createAccount(View view) {
        Intent iSignUp = new Intent(Login.this, SignUp.class);
        startActivity(iSignUp);
        finish();
    }
}
