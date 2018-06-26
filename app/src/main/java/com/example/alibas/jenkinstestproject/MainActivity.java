package com.example.alibas.jenkinstestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test
        //test
        //test
        //test
        //test
        //test
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"message",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    //Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
//Test comment
    @Override
    protected void onStop() {
        super.onStop();
    }
//Test comment
//Test comment
//Test comment
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
