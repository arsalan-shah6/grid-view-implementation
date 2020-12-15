package com.app.gridviewimplememtation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
   List<String>name;
   List<Integer>image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerView=findViewById( R.id.rc );
        name=new ArrayList<>();
        image=new ArrayList<>();
        name.add( "Apple" );
        name.add( "play" );
        name.add( "Apple" );
        name.add( "play" );
        name.add( "Apple" );
        name.add( "play" );
        name.add( "Apple" );
        name.add( "play" );
        name.add( "Apple" );
        name.add( "play" );
        name.add( "Apple" );
        name.add( "play" );
        image.add( R.drawable.f );
        image.add( R.drawable.c );
        image.add( R.drawable.d );
        image.add( R.drawable.e );
        image.add( R.drawable.c );
        image.add( R.drawable.d );
        image.add( R.drawable.c );
        image.add( R.drawable.d );
        image.add( R.drawable.c );
        image.add( R.drawable.d );
        image.add( R.drawable.c );
        image.add( R.drawable.d );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        Adapter adapter=new Adapter(name,image,this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager( this,3,GridLayoutManager.VERTICAL,false );
        recyclerView.setLayoutManager( gridLayoutManager );
        recyclerView.setAdapter( adapter );






    }

}