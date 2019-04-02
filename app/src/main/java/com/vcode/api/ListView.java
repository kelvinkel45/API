package com.vcode.api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListView extends ArrayAdapter<DataItem> {

    private List<DataItem> ItemList;

    private Context context;

    public ListView(List<DataItem> playerItemList, Context context) {
        super(context, R.layout.list_view, playerItemList);
        this.ItemList = playerItemList;
        this.context = context;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View listViewItem = inflater.inflate(R.layout.list_view, null, true);

        TextView textViewKey = listViewItem.findViewById(R.id.textViewKey);
        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        TextView textViewCode = listViewItem.findViewById(R.id.textViewCode);

        DataItem musik = ItemList.get(position);

        textViewKey.setText(musik.getKey());
        textViewName.setText(musik.getName());
        textViewCode.setText(musik.getCode());


        return listViewItem;
    }
}