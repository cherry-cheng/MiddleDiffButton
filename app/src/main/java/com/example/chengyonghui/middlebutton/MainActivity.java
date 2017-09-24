package com.example.chengyonghui.middlebutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);

        //通过createFromResource方法创建一个ArrayAdapter对象
        //第一个参数是指上下文对象
        //第二个参数引用了在strings.xml文件当中定义的String数组
        //第三个参数是用来指定Spinner的样式，是一个布局文件ID，该布局文件由Android系统提供，也可以替换为自己定义的布局文件
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(
                this, R.array.planets_array,
                android.R.layout.simple_spinner_item);
        //设置Spinner当中每个条目的样式，同样是引用一个Android系统提供的布局文件
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setPrompt("测试");
        spinner.setOnItemSelectedListener(new SpinnerOnSelectedListener());
    }

    class SpinnerOnSelectedListener implements AdapterView.OnItemSelectedListener {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String selected = parent.getItemAtPosition(position).toString();
            System.out.println(selected);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            System.out.println("nothingSelected");
        }
    }
}
