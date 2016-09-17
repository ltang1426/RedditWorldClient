package com.example.angelachang.redditworld.WorldStuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.angelachang.redditworld.R;

public class WorldActivity extends AppCompatActivity {

    private static DataProvider dataProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);
        Thread d = new ServerComThread();
        d.start();
    }

    public static DataProvider getDataProvider(){
        return dataProvider;
    }


}


