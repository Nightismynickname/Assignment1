package com.example.JoshuaBSEU.register;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class listadapter extends BaseAdapter {

    ArrayList<String> listData1 = new ArrayList<>();
    ArrayList<String> listData2 = new ArrayList<>();

    LayoutInflater mInflater;

    public listadapter(ArrayList<String> list1, ArrayList<String> list2, Context c){
        mInflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listData1 = list1;
        listData2 = list2;

    }
    @Override
    public int getCount() {
        return listData1.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.activity_listadapter,null);
        TextView myname = v.findViewById(R.id.myemail);
        TextView myscore = v.findViewById(R.id.myscore);


        myname.setText(listData1.get(i));
        myscore.setText(listData2.get(i));


        return v;
    }
}

