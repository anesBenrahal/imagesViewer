package com.example.imagesviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int index = 0;
    int [] array = new int[] {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




    public void next(View view) {
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageResource(array[index]);
        index++;
        if (index > array.length) {
            index = 0;
        }


    }
}
