package com.example.android.businessapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void phone(View v) {

        dialPhoneNumber(String.valueOf(R.string.phone));
    }
    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void location(View v) {

        showMap("geo:22.54,88.36");
    }
    public void showMap(String geoLocation) {
        Uri geoLoc = Uri.parse(geoLocation);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLoc);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
