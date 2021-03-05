package com.example.myemployeebiodataapplication.DataModel;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

public interface UserRecyclers {
    @NonNull
    UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType);

    void onBindViewHolder(@NonNull UserViewHolder holder, int i);

    int getItemCount();
}
