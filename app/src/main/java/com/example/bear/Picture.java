package com.example.bear;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Picture extends AppCompatActivity {
    private static final String TAG = "";
    private ImageView imageView;
    private Button returnButton;
    private String bearResource;

    // Можно сделать ведь отдельный класс с методом launchActivity,  и вызывать его где надо? А не писать этот метод в каждом классе
    public static void launchActivity(Context context, int idBear){
        Intent intent = new Intent(context, Picture.class);
        intent.putExtra("imageResourse", idBear);
        context.startActivity(intent);
    }

    public void finishActivityWithResult(String result){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", result);
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        int i = getIntent().getIntExtra("imageResourse", 0);
        imageView = findViewById(R.id.imgview);
        returnButton = findViewById(R.id.return_btn);
        Log.e(TAG, "This is result: " + i);
        imageView.setImageResource(i);
//        как вставить imageView из класса

        if(imageView.getResources().equals(R.drawable.brown)){
            bearResource = "Brown";
        } else if (imageView.getResources().equals(R.drawable.white)){
            bearResource = "White";
        } else {
            bearResource = "do not know";
        }
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishActivityWithResult(bearResource);
            }
        });


    }
}
