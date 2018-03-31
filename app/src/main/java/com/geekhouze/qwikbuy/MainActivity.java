package com.geekhouze.qwikbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        NavigationView navigationViewDrawer = (NavigationView) findViewById(R.id.navigationViewDrawer) ;
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupDrawerContent(navigationViewDrawer);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void selectItemDrawer(MenuItem menuItem){
        Fragment mFragment = null;
        Class mFragmentClass;
        switch (menuItem.getItemId()){
            case R.id.dashboard:
                mFragmentClass = Home.class;
                break;
            case R.id.mostSelling:
                mFragmentClass = MostSelling.class;
                break;
            case R.id.dailyDeals:
                mFragmentClass = DailyDeals.class;
                break;
            case R.id.sale:
                mFragmentClass = Sale.class;
                break;
            case R.id.Orders:
                mFragmentClass = Orders.class;
                break;
            case R.id.wishList:
                mFragmentClass = WishList.class;
                break;
            case R.id.settings:
                mFragmentClass = Settings.class;
                break;
            case R.id.logout:
                mFragmentClass = Home.class;
                break;
            default:
                mFragmentClass = Home.class;
                break;
        }

        try {
            mFragment = (Fragment) mFragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flcontent, mFragment).commit();
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        mDrawerLayout.closeDrawers();

    }

    private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectItemDrawer(item);
                return true ;
            }
        });
    }
}
