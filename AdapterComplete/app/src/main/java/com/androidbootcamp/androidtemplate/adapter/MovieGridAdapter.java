package com.androidbootcamp.androidtemplate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidbootcamp.androidtemplate.R;
import com.androidbootcamp.androidtemplate.model.MovieEntity;

import java.util.List;

/**
 * @author Eduardo Medina
 */
public class MovieGridAdapter extends BaseAdapter {

    private final Context context;
    private List<MovieEntity> data;

    public MovieGridAdapter(Context context, List<MovieEntity> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(this.context).
                    inflate(R.layout.row_movie,parent,false);
        } else {
            view = convertView;
        }

        //elementos de la ui
        TextView tviTitle=(TextView)view.findViewById(R.id.tviName);
        ImageView iviCartelera= (ImageView)view.findViewById(R.id.iviCartelera);

        //entidad
        final MovieEntity movieEntity= data.get(position);

        //setear valores de la entidad en la celda
        tviTitle.setText(movieEntity.getTitle());

        boolean cartelera=movieEntity.isCartelera();
        if(cartelera){
            iviCartelera.setVisibility(View.VISIBLE);
        }else{
            iviCartelera.setVisibility(View.GONE);
        }

        return view;
    }
}
