package pu.fmi.travelium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {


    Button signUpButton,loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        signUpButton = findViewById(R.id.signUpButton);
        loginButton = findViewById(R.id.loginButton);

        signUpButton.setOnClickListener(v ->{
            Intent signUpIntent = new Intent(StartActivity.this, SignUpActivity.class);
            startActivity(signUpIntent);
        });

        loginButton.setOnClickListener(v ->{
            Intent loginIntent = new Intent(StartActivity.this, LoginActivity.class);
            startActivity(loginIntent);
        });
    }
}