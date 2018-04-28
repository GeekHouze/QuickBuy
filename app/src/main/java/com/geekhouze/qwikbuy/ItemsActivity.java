package com.geekhouze.qwikbuy;

import android.graphics.Outline;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

    ImageButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        fab = (ImageButton) findViewById(R.id.fab);

        //Outline
        //int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
        //Outline outline = new Outline();
        //outline.setOval(0, 0, size, size);
        //findViewById(R.id.fab).setOutline(outline);

        ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                // Or read size directly from the view's width/height
                int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
                outline.setOval(0, 0, size, size);
            }
        };

        fab.setOutlineProvider(viewOutlineProvider);



        mDataset = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            mDataset.add("New Title # " + i);
        }

        mRecyclerView2 = (RecyclerView) findViewById(R.id.items_recyclerview);
        mRecyclerView2.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView2.setLayoutManager(mLayoutManager);
        mAdapter2 = new ItemsAdapter(mDataset);
        mRecyclerView2.setAdapter(mAdapter2);

    }
}
