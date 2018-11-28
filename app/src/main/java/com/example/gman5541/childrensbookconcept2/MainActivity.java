package com.example.gman5541.childrensbookconcept2;

import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.gman5541.childrensbookconcept2.SlideAdapter.lst_audio_eng;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter myadapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myadapter = new SlideAdapter(this);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        /*viewPager.addOnPageChangeListener(player);*/

        viewPager.setAdapter(myadapter);
        viewPager.setCurrentItem(0);
    }
}