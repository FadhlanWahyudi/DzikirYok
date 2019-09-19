package com.fadhlan.dzikirapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


class CostumListAdapter extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] menuItem;
    private final String[] menuLagi;

    public CostumListAdapter(Activity context, String[] menuItem, String[] menuLagi) {
        super(context, R.layout.activity_list, menuItem);
        this.context = context;
        this.menuItem = menuItem;
        this.menuLagi = menuLagi;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"}) View rowView = inflater.inflate(R.layout.activity_list, null, true);

        TextView textMenu = (TextView)rowView.findViewById(R.id.menuItem);
        TextView textLagi = (TextView)rowView.findViewById(R.id.menuLagi);

        textMenu.setText(menuItem[position]);
        textLagi.setText(menuLagi[position]);

        return rowView;
    }
}
