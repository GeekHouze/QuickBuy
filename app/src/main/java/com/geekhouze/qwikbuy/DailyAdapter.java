package com.geekhouze.qwikbuy;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.geekhouze.qwikbuy.cardview.Album;

import java.util.ArrayList;
import java.util.List;

class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.ViewHolder>{

    private List<Album> mDataset;

    public DailyAdapter(List<Album> mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public DailyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_pager, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(DailyAdapter.ViewHolder holder, int position) {

        holder.price.setText("R"+Integer.toString(mDataset.get(position).getThumbnail()));
        holder.oldPrice.setText("R"+Integer.toString(mDataset.get(position).getNumOfSongs()) );
        holder.date.setText(mDataset.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }




}
