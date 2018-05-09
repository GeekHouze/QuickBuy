package com.geekhouze.qwikbuy;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    private ArrayList<String> mDataset;

    public ItemsAdapter(ArrayList<String> mDataset) {
        this.mDataset = mDataset;

    }

    @Override
    public ItemsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }




    @Override
    public void onBindViewHolder(ItemsAdapter.ViewHolder holder, int position) {
        //holder.mTitle.setText(mDataset.get(position));

    }




}
