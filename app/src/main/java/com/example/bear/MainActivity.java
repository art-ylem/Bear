package com.example.bear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button brown;
    private Button white;
    String picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brown = findViewById(R.id.bear);
        white = findViewById(R.id.whiteBear);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.bear:
                        picture = "brown_bear";
                        Picture.launchActivity(MainActivity.this, picture);
                        break;
                    case R.id.whiteBear:
                        picture = "white_bear";
                        Picture.launchActivity(MainActivity.this, picture);
                        break;
                }
            }
        };

        brown.setOnClickListener(onClickListener);
        white.setOnClickListener(onClickListener);



    }
}
