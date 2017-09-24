package com.example.chengyonghui.middlebutton.ratingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

import com.example.chengyonghui.middlebutton.R;

/**
 * Created by chengyonghui on 2017/9/24.
 */
public class RatingBarActivity extends AppCompatActivity {
    private RatingBar ratingBar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingbar_main);
        ratingBar = (RatingBar) findViewById(R.id.ratingbarId);
        ratingBar.setOnRatingBarChangeListener(new RatingBarListener());
    }

    private class RatingBarListener implements RatingBar.OnRatingBarChangeListener {


        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            System.out.println("rating---->" + rating);
        }
    }
}
