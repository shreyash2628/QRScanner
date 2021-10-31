package com.example.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  static TextView scanText;
    public  static Button scanBtn;
    public static ImageButton visitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scanText = findViewById(R.id.textView);
        scanBtn = findViewById(R.id.button);
        visitBtn = findViewById(R.id.visitLinkBTN);

        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ScannerActivity.class);
                startActivity(intent);
            }
        });





        visitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = scanText.getText().toString();




                Intent intent = new Intent(MainActivity.this,WebViewActivity.class);

                intent.putExtra("key", ans);
                startActivity(intent);
            }
        });

    }
}