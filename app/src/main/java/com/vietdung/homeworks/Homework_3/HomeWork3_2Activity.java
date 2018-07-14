package com.vietdung.homeworks.Homework_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vietdung.homeworks.R;

public class HomeWork3_2Activity extends AppCompatActivity implements View.OnClickListener{
    Button btn_Color1, btn_Color2, btn_Color3, btn_Clear;
    TextView tv_Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_3_2);

        addControls();

    }

    private void addControls() {
        btn_Color1 = findViewById(R.id.btnColor1);
        btn_Color2 = findViewById(R.id.btnColor2);
        btn_Color3 =findViewById(R.id.btnColor3);
        tv_Text =findViewById(R.id.tvText);
        btn_Clear = findViewById(R.id.btnClear);

        btn_Color1.setOnClickListener(this);
        btn_Color2.setOnClickListener(this);
        btn_Color3.setOnClickListener(this);
        btn_Clear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnColor1:
                tv_Text.setBackgroundResource(R.color.colorRed);
                break;
            case R.id.btnColor2:
                tv_Text.setBackgroundResource(R.color.colorYellow);
                break;
            case R.id.btnColor3:
                tv_Text.setBackgroundResource(R.color.colorBlue);
                break;
            case R.id.btnClear:
                tv_Text.setBackgroundResource(R.color.colorWhite);
                break;
        }
    }
}
