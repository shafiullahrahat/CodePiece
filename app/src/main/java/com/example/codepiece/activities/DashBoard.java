package com.example.codepiece.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.codepiece.R;
import com.example.codepiece.adapters.imageSliderAdapter;
import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.Objects;

public class DashBoard extends AppCompatActivity {


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }
        this.finishAffinity();;
    }

    SliderView sliderView, sliderView1, sliderView2, sliderView3, sliderView4, sliderView5;
    int[] ifElse = {R.drawable.ifelse1, R.drawable.ifelse2, R.drawable.ifelse3, R.drawable.ifelse4};
    int[] array = {R.drawable.array1, R.drawable.array2, R.drawable.array3, R.drawable.array4};
    int[] function = {R.drawable.function1, R.drawable.function2, R.drawable.function3, R.drawable.function4};
    int[] pointer = {R.drawable.pointer1, R.drawable.pointer2, R.drawable.pointer3, R.drawable.pointer4};
    int[] loop = {R.drawable.loop1, R.drawable.loop2, R.drawable.loop3, R.drawable.loop4};
    int[] pattern = {R.drawable.pattern1, R.drawable.pattern2, R.drawable.pattern3, R.drawable.pattern4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(DashBoard.this,drawerLayout,R.string.open, R.string.close);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.moreAppMenu:
                        final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:" + appPackageName)));
                        } catch (android.content.ActivityNotFoundException anfe) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=pub:" + appPackageName)));
                        }
                        break;

                    case R.id.rateUsMenu:
                        Toast toast=Toast.makeText(getApplicationContext(),"This feature will be available soon..",Toast.LENGTH_SHORT);
                        toast.show();
                        break;

                    case R.id.privacyPolicyMenu:
                        startActivity(new Intent(DashBoard.this, PrivacyPolicy.class));
                        break;

                    case R.id.shareMenu:
                        Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Download CodePiece App");
                        String app_url = " https://play.google.com/store/apps/details?id="+getPackageName();
                        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                        startActivity(Intent.createChooser(shareIntent, "Share via"));
                        break;
                }
                return true;
            }
        });

        sliderView = findViewById(R.id.imageSlider);
        sliderView1 = findViewById(R.id.imageSlider1);
        sliderView2 = findViewById(R.id.imageSlider2);
        sliderView3 = findViewById(R.id.imageSlider3);
        sliderView4 = findViewById(R.id.imageSlider4);
        sliderView5 = findViewById(R.id.imageSlider5);

        imageSliderAdapter sliderAdapter = new imageSliderAdapter(ifElse);
        imageSliderAdapter sliderAdapter1 = new imageSliderAdapter(array);
        imageSliderAdapter sliderAdapter2 = new imageSliderAdapter(function);
        imageSliderAdapter sliderAdapter3 = new imageSliderAdapter(pointer);
        imageSliderAdapter sliderAdapter4 = new imageSliderAdapter(loop);
        imageSliderAdapter sliderAdapter5 = new imageSliderAdapter(pattern);

        imageSliderSet(sliderView, sliderAdapter);
        imageSliderSet(sliderView1, sliderAdapter1);
        imageSliderSet(sliderView2, sliderAdapter2);
        imageSliderSet(sliderView3, sliderAdapter3);
        imageSliderSet(sliderView4, sliderAdapter4);
        imageSliderSet(sliderView5, sliderAdapter5);
    }

    public void imageSliderSet(SliderView sliderView ,imageSliderAdapter sliderAdapter){
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setScrollTimeInSec(4);
        sliderView.startAutoCycle();
    }

    public void ViewAll(View view) {

        Intent intent = new Intent(DashBoard.this, MainActivity.class);

        switch(view.getId()){
            case R.id.buttonIfElse:
                intent.putExtra("condition", 1);
                break;
            case R.id.buttonArray:
                intent.putExtra("condition", 2);
                break;
            case R.id.buttonFunction:
                intent.putExtra("condition", 3);
                break;
            case R.id.buttonPointer:
                intent.putExtra("condition", 4);
                break;
            case R.id.buttonLoop:
                intent.putExtra("condition", 5);
                break;
            case R.id.buttonPattern:
                intent.putExtra("condition", 6);
                break;
        }
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}