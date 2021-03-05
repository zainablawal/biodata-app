package com.example.myemployeebiodataapplication.DataModel;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.myemployeebiodataapplication.R;

public class UserViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView Firstname,Lastname,PhoneNumber,EmailAddress,Role;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        Firstname = itemView.findViewById(R.id.editTextFirstName);
        Lastname = itemView.findViewById(R.id.editTextLastName);
        PhoneNumber = itemView.findViewById(R.id.editTextPhoneNumber);
        EmailAddress = itemView.findViewById(R.id.editTextEmailAddress);
        Role = itemView.findViewById(R.id.editTextRole);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
