package com.example.JoshuaBSEU.register;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ScoreList extends AppCompatActivity {

    ListView LV;
    int x = 0;
    DatabaseHelper mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_list);

        LV = (ListView)findViewById(R.id.mylistview);
        mDB = new DatabaseHelper(this);
        showdata();
    }

    public void showdata(){
        Cursor c = mDB.getData(); //return the cursor


        ArrayList<String> listData1 = new ArrayList<>();
        ArrayList<String> listData2 = new ArrayList<>();



        while(c.moveToNext()){

            listData1.add(c.getString(0));
            listData2.add(c.getString(2));

        }
        listadapter adapter = new listadapter(listData1,listData2,this);

        // ListAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, listData);
        LV.setAdapter(adapter);
    }
}