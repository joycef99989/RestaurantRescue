package com.example.joyce.restaurantrescue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MIT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mit);
    }

    public void Menu1(View view) {
        Intent intent = new Intent(this, Menu1.class);
        startActivity(intent);
    }

    public void Reserve1(View view) {
        Intent intent = new Intent(this, Reserve1.class);
        startActivity(intent);
    }
}
