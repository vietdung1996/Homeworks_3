package com.vietdung.homeworks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vietdung.homeworks.Homework_3.HomeWork3Activity;
import com.vietdung.homeworks.Homework_3.HomeWork3_2Activity;
import com.vietdung.homeworks.Homework_3.HomeWork3_4Activity;


public class MainActivity extends AppCompatActivity {
    ListView lv_Homeworks;
    Intent intent;
    String[] homeWorks= {"Homework_3_1","Homework_3_2","Homework_3_4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        addEvents();
    }

    private void addEvents() {
        lv_Homeworks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent = new Intent(MainActivity.this, HomeWork3Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, HomeWork3_2Activity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, HomeWork3_4Activity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    private void initView() {
        lv_Homeworks = findViewById(R.id.lvHomeworks);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,homeWorks);
        lv_Homeworks.setAdapter(arrayAdapter);
    }
}
