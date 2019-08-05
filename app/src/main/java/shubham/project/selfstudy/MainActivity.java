package shubham.project.selfstudy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


/**
 * CREATED BY SHUBHAM KISHORE
 * ON 05/08/2019
 *
 * ALL THE DATA IS SET IN XML FILES
 * AS THERE IS NO SOURCE FROM WHICH
 * WE ARE FETCHING DATA
 *
 *
 *
 **/


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navView;


    //Bottom navigation bar
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

            switch (item.getItemId()) {
                case R.id.navigation_home:

                    fragmentTransaction.replace(R.id.fragment, new Contentdata());
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    fragmentTransaction.replace(R.id.fragment, new Messagetab());
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_analysis:
                    fragmentTransaction.replace(R.id.fragment, new Messagetab());
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_doubts:
                    fragmentTransaction.replace(R.id.fragment, new Messagetab());
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_profile:
                    fragmentTransaction.replace(R.id.fragment, new Messagetab());
                    fragmentTransaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment, new Contentdata());
        fragmentTransaction.commit();

        navView = (BottomNavigationView) findViewById(R.id.bottom_nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    //navigation view options
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Toast.makeText(MainActivity.this, "you cliked me ", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_slideshow) {
            Toast.makeText(MainActivity.this, "you cliked me ", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_tools) {
            Toast.makeText(MainActivity.this, "you cliked me ", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {
            Toast.makeText(MainActivity.this, "you cliked me ", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {
            Toast.makeText(MainActivity.this, "you cliked me ", Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
