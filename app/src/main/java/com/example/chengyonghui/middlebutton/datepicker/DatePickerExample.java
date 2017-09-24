package com.example.chengyonghui.middlebutton.datepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.chengyonghui.middlebutton.R;

/**
 * Created by chengyonghui on 2017/9/22.
 */
public class DatePickerExample extends AppCompatActivity {
    private Button showDatePickerButton = null;
    private static final int DATE_PICKER_ID = 1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker_layout);
        showDatePickerButton = (Button) findViewById(R.id.showDatePicker);
        showDatePickerButton.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            //此方法用于显示DatePickerDialog
            showDialog(DATE_PICKER_ID);
        }
    }

    //监听器，用户监听用户点下DatePickerDialog的set按钮时，所设置的年月日
    DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            System.out.println(year + "-" + monthOfYear + "-" + dayOfMonth);
        }
    };

    //showDialog方法执行之后立即会执行此方法生成DatePickerDialog
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_PICKER_ID:
                return new DatePickerDialog(this, onDateSetListener, 2017, 11, 10);
        }
        return null;
    }
}
