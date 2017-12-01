package com.tan.androidcustomview.adapter;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tan.androidcustomview.R;

import java.util.List;

/**
 * Created by tan on 2017/11/15.
 */

public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter( Context context, int textViewResourceId, List<String> objects) {
        super(context, textViewResourceId, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if(convertView==null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.my_list_view_item,null);
        }else{
            view = convertView;
        }
        TextView textView = (TextView)view.findViewById(R.id.text_view);
        textView.setText(getItem(position));
        return view;
    }
}
