package com.example.bear;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

public class Picture extends AppCompatActivity {
    private static final String TAG = "";
    public ImageView imageView;

    public static void launchActivity(Context context, int idBear){
        Intent intent = new Intent(context, Picture.class);
        intent.putExtra("imageResourse", idBear);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        int i = getIntent().getIntExtra("imageResourse", 0);
        imageView = findViewById(R.id.imgview);
        Log.e(TAG, "This is result: " + i);
//        imageView.setImageResource(i);
//        как вставить imageView из класса


    }
}
