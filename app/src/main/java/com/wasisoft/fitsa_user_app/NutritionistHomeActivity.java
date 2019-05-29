package com.wasisoft.fitsa_user_app;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.wasisoft.fitsa_user_app.Helpers.FieldHelper;

public class NutritionistHomeActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritionist_home);

        // Remove it whenever you wish
       /*Button gotoNutProfile = findViewById(R.id.goto_nut_profile);

        gotoNutProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FieldHelper.moveTo(NutritionistHomeActivity.this,NutritionistProfile.class);
            }
        });*/


        initViews();
        setUpToolbar();
        initRef();
        navItemClick();

        final ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.menu_navbtn);
    }

    private void navItemClick() {

       navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

               switch(menuItem.getItemId())
               {
                   case R.id.action_home:
                       menuItem.setChecked(true);
                       FieldHelper.displayToast(NutritionistHomeActivity.this,"Home");
                       mDrawerLayout.closeDrawers();
                       return true;

                   case R.id.action_profile:
                       menuItem.setChecked(true);
                       FieldHelper.displayToast(NutritionistHomeActivity.this,"Profile");
                       openProfile();
                       mDrawerLayout.closeDrawers();
                       return true;

                   case R.id.action_logout:
                       menuItem.setChecked(true);
                       FieldHelper.displayToast(NutritionistHomeActivity.this,"Logout");
                       mDrawerLayout.closeDrawers();
                       return true;
               }
               return false;
           }
       });
    }

    private void openProfile() {

        FieldHelper.moveTo(NutritionistHomeActivity.this,NutritionistProfile.class);

    }

    private void initViews() {
        mDrawerLayout = findViewById(R.id.nut_drawerlayout);
        mToolbar = findViewById(R.id.mytoolbar);
        navigationView = findViewById(R.id.naview);
    }

    private void setUpToolbar() {
        setSupportActionBar(mToolbar);

        if(getSupportActionBar() != null){
            getSupportActionBar().setElevation(4.0f);
            getSupportActionBar().setHomeButtonEnabled(true);
            //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initRef() {
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open_drawer,R.string.close_drawer);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){

            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        checkDrawer();
    }

    private void checkDrawer() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        checkDrawer();
    }
}
