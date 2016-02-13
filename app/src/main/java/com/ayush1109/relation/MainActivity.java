package com.ayush1109.family;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {
    ListView list;
    String[] name = {
            "Me",
            "Mom",
            "Papa",
            "Siso1",
            "Siso2",
            "Bro1",
            "Pet"
    } ;
    String[] relation = {
            "None",
            "Mother",
            "Father",
            "Sister1",
            "Sister2",
            "Brother",
            "PetDog"
    } ;
    Integer[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomList adapter = new CustomList(MainActivity.this, name, relation, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }

}
