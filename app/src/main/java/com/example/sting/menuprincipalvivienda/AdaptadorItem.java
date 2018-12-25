package com.example.sting.menuprincipalvivienda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorItem extends BaseAdapter {
    private Context context;
    private ArrayList<ModeloAdaptadorItem> arrayitem;

    public AdaptadorItem(Context context, ArrayList<ModeloAdaptadorItem> arrayitem) {
        this.context = context;
        this.arrayitem = arrayitem;
    }

    @Override
    public int getCount() {
        return arrayitem.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayitem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ModeloAdaptadorItem Item = (ModeloAdaptadorItem) getItem(position);


        convertView =LayoutInflater.from(context).inflate(R.layout.item_campo,null);
        ImageView IconoItem =(ImageView) convertView.findViewById(R.id.imagen_item);
        TextView TextoItem = (TextView)  convertView.findViewById(R.id.texto_item);

        IconoItem.setImageResource(Item.getIconoitem());
        TextoItem.setText(Item.getNombreitem());

        return convertView;
    }
}
