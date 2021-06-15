package pu.fmi.travelium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView cardIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardIV = findViewById(R.id.cardViewIV);

        cardIV.setOnClickListener(v -> {
            Intent signUpIntent = new Intent(MainActivity.this, LocationActivity.class);
            startActivity(signUpIntent);
        });
    }
}