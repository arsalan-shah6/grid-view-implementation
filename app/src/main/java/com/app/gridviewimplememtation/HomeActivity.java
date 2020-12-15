package com.app.gridviewimplememtation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );

        textView=findViewById( R.id.tv );
        imageView=findViewById( R.id.image );


        Intent intent=getIntent();
        String name=intent.getStringExtra( "key" );
        textView.setText( name );
        int images=intent.getIntExtra( "image",0 );
        imageView.setImageResource( images );
    }
}