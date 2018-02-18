package com.example.joyce.restaurantrescue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chilis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chilis);
    }

    public void Menu2(View view) {
        Intent intent = new Intent(this, Menu2.class);
        startActivity(intent);
    }

    public void Reserve2(View view) {
        Intent intent = new Intent(this, Reserve2.class);
        startActivity(intent);
    }
}
