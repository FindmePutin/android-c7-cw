package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView foodname = findViewById(R.id.textFood);
        ImageView foodshape = findViewById(R.id.imagefood);
        TextView foodprice = findViewById(R.id.textPrice);

        Bundle bundle = getIntent().getExtras();
        Items food =  (Items) bundle.getSerializable("items");

        foodname.setText(food.getTextFood());
        foodshape.setImageResource(food.getImagefood());
        foodprice.setText(String.valueOf(food.getTextPrice()));



    }
}