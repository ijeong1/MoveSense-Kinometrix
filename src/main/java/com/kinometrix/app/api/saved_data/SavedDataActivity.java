package com.kinometrix.app.api.saved_data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kinometrix.app.R;

public class SavedDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_data);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Saved Data");
        }
    }
}