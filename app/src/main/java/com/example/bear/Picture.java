package com.example.bear;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Picture extends AppCompatActivity {
    ImageView imageView;

    public static void launchActivity(Context context, int idBear){
        Intent intent = new Intent(context, Picture.class);
        intent.putExtra("idBear", idBear);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        int i = getIntent().getIntExtra("idBear");

        imageView.setImageResource(i);
    }
}
