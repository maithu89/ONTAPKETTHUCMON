package com.example.ontapkethucmon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomerOrder extends AppCompatActivity {
    TextView tenBan;
    String mtenBan;
    ImageView xemBill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_order);
        tenBan = findViewById(R.id.tenBan);
        xemBill = findViewById(R.id.btnXemBill);

        mtenBan = (String) getIntent().getSerializableExtra("object_song");
        if(mtenBan != null){
            tenBan.setText(mtenBan);
        }

        xemBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerOrder.this, TableDetail1.class);

                startActivity(intent);
            }
        });
    }
}