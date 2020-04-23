package com.example.dniscammer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.viewpager.widget.ViewPager;

public class ActivityDNI extends Activity {

    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dni);

        final Button buttonHome = findViewById(R.id.dniNext);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityDNIDetail.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomPagerAdapter(this));
    }
}