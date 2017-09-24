package com.example.chengyonghui.middlebutton.seekbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.example.chengyonghui.middlebutton.R;

/**
 * Created by chengyonghui on 2017/9/24.
 */
public class SeekBarActivity extends AppCompatActivity {
    private SeekBar seekBar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar_main);
        seekBar = (SeekBar) findViewById(R.id.seebarId);
        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(new SeekBarListener());
    }

    //定义一个监听器，该监听器负责监听进度条状态的改变
    private class SeekBarListener implements SeekBar.OnSeekBarChangeListener {

        //当进度条的进度发生变化时，会调用该方法
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            System.out.println(progress);
        }

        //当用户开始滑动滑块时，调用该方法
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            System.out.println("start------>" + seekBar.getProgress());
        }

        //当用户结束对滑块的滑动时，调用该方法
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            System.out.println("Stop----------->" + seekBar.getProgress());
        }
    }
}
