package pu.fmi.travelium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LocationActivity extends AppCompatActivity {


    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(v ->{
            Intent signUpIntent = new Intent(LocationActivity.this, MainActivity.class);
            startActivity(signUpIntent);
        });
    }
}