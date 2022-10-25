package com.example.app3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.ImageWriter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void send4(View view) {
        ImageView iv;
        iv=findViewById(R.id.imageView2);
        iv.setImageResource(R.mipmap.mickey_1);
    }

    public void send5(View view) {
        ImageView iv;
        iv=findViewById(R.id.imageView2);
        iv.setImageResource(R.mipmap.mickey_2);
    }

    public void send6(View view) {
        ImageView iv;
        iv=findViewById(R.id.imageView2);
        iv.setImageResource(R.mipmap.mickey_3);
    }

    public void send7(View view) {
        ImageView iv;
        iv=findViewById(R.id.imageView2);
        iv.setImageResource(R.mipmap.mickey_4);
    }

    public void Site(View view) {
        String uri="https://www.google.pt";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }
}