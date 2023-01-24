package com.safeinvest.safetrax;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class dashboard extends AppCompatActivity {
    TextView textView;
    BottomNavigationView bottomNavigationView;
    ImageView noti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        DrawerLayout drawerLayout= findViewById(R.id.drawerlayout);
        bottomNavigationView=findViewById(R.id.bottomnav);
        noti=(ImageView) findViewById(R.id.noti);
        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView navigationView= findViewById(R.id.navigationview);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_task:
                        loadfrag(new taskFrag());
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.menu_cef:
                        loadfrag(new cefFrag());
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.menu_cpm:
                        loadfrag(new crmFrag());
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.menu_leave:
                        loadfrag(new leaveFrag());
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.menu_logout:
                        loadfrag(new logoutFrag());
                        drawerLayout.closeDrawers();
                        return true;

                }

                return false;
            }
        });
      //  bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.profile:
                          loadfrag(new profilefrag());
                        return true;
                    case R.id.home:
                         loadfrag(new homefrag());
                        return true;
                    case R.id.settings:
                        loadfrag(new settingsfrag());
                }
                return false;
            }
        });

        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfrag(new notifrag());
            }
        });
    }

    private void loadfrag(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentContainerView3,fragment);
        ft.commit();

    }
}