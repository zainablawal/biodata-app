package com.example.myemployeebiodataapplication.DataModel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myemployeebiodataapplication.R;

public class RecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
    }


    public class Adapter<T> {

    }

    public class ViewHolder {
    }
}