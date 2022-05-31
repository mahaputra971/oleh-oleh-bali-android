package com.ananda.oleholehbali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class DashboardActivity extends AppCompatActivity {

    LinearLayout icAccount;
    LinearLayout icHome;
    LinearLayout icKeranjang;
    LinearLayout detailProduct;
    LinearLayout listProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_dashboard);

        final TextView nameDashboard = findViewById(R.id.textUsername);
        String user = "User";
        Intent intent = getIntent();
        if (intent.hasExtra("Username")) {
            nameDashboard.setText(getIntent().getStringExtra("Username"));
        } else {
            nameDashboard.setText(user);
        }

        icAccount = findViewById(R.id.icAccount);
        icAccount.setOnClickListener(view ->  {
            Intent intents = new Intent(DashboardActivity.this, AkunActivity.class);
            startActivity(intents);
        });

        icHome = findViewById(R.id.icHome);
        icHome.setOnClickListener(view ->  {
            Intent intents = new Intent(DashboardActivity.this, DashboardActivity.class);
            startActivity(intents);
        });

        icKeranjang = findViewById(R.id.icKeranjang);
        icKeranjang.setOnClickListener(view ->  {
            Intent intents = new Intent(DashboardActivity.this, KeranjangActivity.class);
            startActivity(intents);
        });

    }
}