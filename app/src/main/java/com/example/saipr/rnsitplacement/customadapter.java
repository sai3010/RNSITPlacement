package com.example.saipr.rnsitplacement;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customadapter extends ArrayAdapter<String> {
    private final String[] itemname;
    private final Integer[] imgid;
    private final Activity context;
        public customadapter(Activity context, String[]itemname, Integer[]imgid){
            super(context, R.layout.mylist, itemname);
            // TODO Auto-generated constructor stub
            this.context = context;
            this.itemname = itemname;
            this.imgid = imgid;
        }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Description "+itemname[position]);
        return rowView;

    }
}
