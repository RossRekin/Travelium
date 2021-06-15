package pu.fmi.travelium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpButton = findViewById(R.id.getStartedButton);

        signUpButton.setOnClickListener(v ->{
            Intent signUpIntent = new Intent(SignUpActivity.this, LoginActivity.class);
            startActivity(signUpIntent);
        });
    }
}