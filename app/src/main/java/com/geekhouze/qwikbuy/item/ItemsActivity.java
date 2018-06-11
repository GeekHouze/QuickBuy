package com.geekhouze.qwikbuy.item;

import android.graphics.Outline;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageButton;

import com.geekhouze.qwikbuy.ItemsAdapter;
import com.geekhouze.qwikbuy.R;
import com.geekhouze.qwikbuy.cardview.Album;
import com.geekhouze.qwikbuy.item.Fragment.FragmentItemDescription;
import com.geekhouze.qwikbuy.item.Fragment.FragmentItemInfo;
import com.geekhouze.qwikbuy.item.Fragment.FragmentItemReviews;
import com.geekhouze.qwikbuy.item.ItemViewPagerAdapter;
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

    private TabLayout itemTabLayout;
    private ViewPager itemViewPager;




}
