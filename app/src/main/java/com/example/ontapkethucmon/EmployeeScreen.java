package com.example.ontapkethucmon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EmployeeScreen extends AppCompatActivity {
    ImageView ban1, ban2, ban3, ban4, ban5, ban6;
    String tenBan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_screen);

        ban1 = findViewById(R.id.ban1);
        ban2 = findViewById(R.id.ban2);
        ban3 = findViewById(R.id.ban3);
        ban4 = findViewById(R.id.ban4);
        ban5 = findViewById(R.id.ban5);
        ban6 = findViewById(R.id.ban6);

        ban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeScreen.this, TableDetail1.class);
                Bundle bundle = new Bundle();

                tenBan = "Bàn 01";
                bundle.putSerializable("object_song",tenBan);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
        ban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeScreen.this, TableDetail1.class);
                Bundle bundle = new Bundle();

                tenBan = "Bàn 02";
                bundle.putSerializable("object_song",tenBan);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
        ban3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeScreen.this, TableDetail1.class);
                Bundle bundle = new Bundle();

                tenBan = "Bàn 03";
                bundle.putSerializable("object_song",tenBan);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
        ban4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeScreen.this, TableDetail1.class);
                Bundle bundle = new Bundle();

                tenBan = "Bàn 04";
                bundle.putSerializable("object_song",tenBan);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
        ban5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeScreen.this, TableDetail1.class);
                Bundle bundle = new Bundle();

                tenBan = "Bàn 05";
                bundle.putSerializable("object_song",tenBan);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
        ban6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeScreen.this, TableDetail1.class);
                Bundle bundle = new Bundle();

                tenBan = "Bàn 06";
                bundle.putSerializable("object_song",tenBan);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });


    }


}