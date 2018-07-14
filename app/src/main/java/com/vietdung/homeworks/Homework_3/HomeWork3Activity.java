package com.vietdung.homeworks.Homework_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.vietdung.homeworks.R;

public class HomeWork3Activity extends AppCompatActivity {
    Button btn_SetColor,btn_Clear;
    TextView tv_Text;
    RadioButton rbtn_Red, rbtn_Green, rbtn_Blue;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_3);

        addControls();
        addEvents();
    }



    private void addEvents() {
        btn_SetColor.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                setColor();
            }
        });
        btn_Clear.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                tv_Text.setBackgroundResource(R.color.colorBlack);
            }
        });
    }


    private void setColor() {
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id){
            case R.id.rbtnRed:
                tv_Text.setBackgroundResource(R.color.colorRed);
                break;
            case R.id.rbtnGreen:
                tv_Text.setBackgroundResource(R.color.colorGreen);
                break;
            case R.id.rbtnBlue:
                tv_Text.setBackgroundResource(R.color.colorBlue);
                break;
        }

    }

    private void addControls() {
        btn_SetColor = findViewById(R.id.btnSetcolor);
        btn_Clear = findViewById(R.id.btnClear);
        tv_Text = findViewById(R.id.tvText);
        radioGroup = findViewById(R.id.radioGroup);
        rbtn_Red = findViewById(R.id.rbtnRed);
        rbtn_Green = findViewById(R.id.rbtnGreen);
        rbtn_Blue = findViewById(R.id.rbtnBlue);
    }
}



