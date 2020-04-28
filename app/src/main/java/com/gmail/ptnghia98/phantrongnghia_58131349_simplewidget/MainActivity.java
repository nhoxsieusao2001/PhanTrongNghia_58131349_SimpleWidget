package com.gmail.ptnghia98.phantrongnghia_58131349_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;
    EditText edt1,edt2,edt3;
    RadioGroup rdg1,rdg2;
    RadioButton rdb1,rdb2;
    CheckBox cb1,cb2,cb3,cb4,cb5;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        addViews();
        addEvents();
    }
    private void addViews()
    {
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        rdg1 =findViewById(R.id.rdg1);
        rdb1 = findViewById(R.id.rdb1);
        rdb2 = findViewById(R.id.rdb2);
        rdg2 =findViewById(R.id.rdg2);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        edt3 =findViewById(R.id.edt3);
        button =findViewById(R.id.button);
    }
    private void addEvents()
    {
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                xacnhan();
            }
        });
    }
    public void xacnhan()
    {
        String ten = edt1.getText().toString().trim();
        String ngaysinh = edt2.getText().toString().trim();
        String sothichkhac = edt3.getText().toString().trim();
        String hienthi = null;
        if (ten.length()>0)
            hienthi = "Tên : "+ten+"\n";
        if(ngaysinh.length()>0)
            ngaysinh += "Ngày sinh"+ngaysinh+"\n";
        switch (rdg1.getCheckedRadioButtonId()){
            case R.id.rdb1:
                hienthi += "Giới tính : Nam \n Sở thích : ";
                break;
            case R.id.rdb2:
                hienthi += "Giới tính : Nữ \n Sở thích : ";
                break;
        }
        if(cb1.isChecked())
            hienthi +=cb1.getText()+", ";
        if(cb2.isChecked())
            hienthi +=cb2.getText()+", ";
        if(cb3.isChecked())
            hienthi +=cb3.getText()+", ";
        if(cb4.isChecked())
            hienthi +=cb4.getText()+", ";
        if(cb5.isChecked())
            hienthi +=cb5.getText()+", ";
        if(sothichkhac.length()>0)
            hienthi += sothichkhac;

        Toast.makeText(context,hienthi,Toast.LENGTH_SHORT).show();
    }
}

