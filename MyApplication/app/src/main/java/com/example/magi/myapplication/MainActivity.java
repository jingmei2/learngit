package com.example.magi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test
        tv_title = (TextView) findViewById(R.id.tv_title);

        setViews();
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
    }

    public void setViews() {
        List<ItemBean> itemBeanList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ItemBean itemBean = new ItemBean(R.mipmap.ic_launcher, "我是标题" + i, "我是内容" + i);
            itemBeanList.add(itemBean);
            System.out.print("abc");
        }
        Log.d(TAG, "setViews() called");
        sayHello("hello world!");


        ListView listView = (ListView) findViewById(R.id.lv_main);
        listView.setAdapter(new MyAdapter(this, itemBeanList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "点击了第"+position+"条；id="+id, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private void sayHello(String s) {
        System.out.print(s);
    }


}
