package com.example.ontapkethucmon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TableDetail2 extends AppCompatActivity {
    TextView tongBill;
    String tien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_detail2);

        tongBill = findViewById(R.id.tongTien);
        tien = (String) getIntent().getSerializableExtra("tongtien");
        if(tien != null){
            tongBill.setText(tien);
        }
    }
}