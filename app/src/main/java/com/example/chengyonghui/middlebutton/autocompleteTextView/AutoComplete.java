package com.example.chengyonghui.middlebutton.autocompleteTextView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.chengyonghui.middlebutton.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengyonghui on 2017/9/22.
 */
public class AutoComplete extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView = null;
    static final String[] COUNTERS = new String[] {
            "Afhhnisanta", "Anguila", "Antigua and Barbuda"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocomplete_layout);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteView);
        List<String> list = new ArrayList<String>();
        list.add("测试测试");
        list.add("测试test");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item,COUNTERS);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}
