package com.example.bear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button brown;
    private Button white;
    int picture;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brown = findViewById(R.id.bear);
        white = findViewById(R.id.whiteBear);

        View.OnClickListener onClickListener  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.bear:
                        picture = R.drawable.brown;
                        Picture.launchActivity(MainActivity.this, picture);
                        break;
                    case R.id.whiteBear:
                        picture = R.drawable.white;
                        Picture.launchActivity(MainActivity.this, picture);
                        break;
                };
            }
        };


        brown.setOnClickListener(onClickListener);
        white.setOnClickListener(onClickListener);



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                textView = findViewById(R.id.result_text);
                textView.setText(data.getStringExtra("result"));
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }    }
}
