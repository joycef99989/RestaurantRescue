package com.example.joyce.restaurantrescue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PickRestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_restaurant);
    }

    public void MIT(View view) {
        Intent intent = new Intent(this, MIT.class);
        startActivity(intent);
    }

    public void Chilis(View view) {
        Intent intent = new Intent(this, Chilis.class);
        startActivity(intent);
    }
}
