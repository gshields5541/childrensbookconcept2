package com.example.gman5541.childrensbookconcept2;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;


    // List of Images

    public int[] lst_storyboard = {
            R.drawable.imgmob02, R.drawable.imgmob03, R.drawable.imgmob04,
            R.drawable.imgmob05, R.drawable.imgmob06, R.drawable.imgmob07,
            R.drawable.imgmob08, R.drawable.imgmob09, R.drawable.imgmob010,
            R.drawable.imgmob011,R.drawable.imgmob012,R.drawable.imgmob013
    };

    // List of mp3 raw audio

    public static int[] lst_audio_eng = {
            R.raw.audio_eng_01, R.raw.audio_eng_02, R.raw.audio_eng_03,
            R.raw.audio_eng_04, R.raw.audio_eng_05, R.raw.audio_eng_06,
            R.raw.audio_eng_07, R.raw.audio_eng_08, R.raw.audio_eng_09,
            R.raw.audio_eng_010, R.raw.audio_eng_011, R.raw.audio_eng_012
    };


    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_storyboard.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_slide_adapter,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);


        imgslide.setImageResource(lst_storyboard[position]);


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

}
