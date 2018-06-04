package com.geekhouze.qwikbuy;

import android.graphics.Outline;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageButton;

import com.geekhouze.qwikbuy.cardview.Album;
import com.synnapps.carouselview.CarouselView;

import java.util.ArrayList;
import java.util.List;

public class ItemsActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView mRecyclerView2;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.Adapter mAdapter3;
    private ArrayList<String> mDataset;
    private CarouselView carouselView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

      getSupportActionBar().setDisplayShowHomeEnabled(true);
     getSupportActionBar().setDisplayHomeAsUpEnabled(true);





    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id =item.getItemId();

        if(id == android.R.id.home){
            //
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
