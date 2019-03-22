package com.example.bear;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Picture extends AppCompatActivity {

    public static void launchActivity(Context context, String idBear){
        Intent intent = new Intent(context, Picture.class);
        intent.putExtra("idBear", idBear);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
    }
}
