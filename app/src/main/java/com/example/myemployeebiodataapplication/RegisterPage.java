package com.example.myemployeebiodataapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myemployeebiodataapplication.DataModel.DataConverter;
import com.example.myemployeebiodataapplication.DataModel.User;
import com.example.myemployeebiodataapplication.DataModel.UserDAO;
import com.example.myemployeebiodataapplication.DataModel.UserDatabase;

public class RegisterPage extends AppCompatActivity {
    Button Capture;
    Button Submit;
    ImageView imageView;
    Bitmap bitmapimageview;
    View cardView;
    EditText FirstName, LastName, phone_Number, Email_Address, Job_Role, Dob, House_Address;
    UserDAO userDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        imageView = findViewById(R.id.imageView);
        cardView = findViewById(R.id.cardView);
        bitmapimageview = null;

        FirstName = findViewById(R.id.editTextFirstName);
        LastName = findViewById(R.id.editTextLastName);
        phone_Number = findViewById(R.id.editTextPhoneNumber);
        Email_Address = findViewById(R.id.editTextEmailAddress);
        Job_Role = findViewById(R.id.editTextRole);
        Dob = findViewById(R.id.editTextDoB);
        House_Address = findViewById(R.id.editTextHomeAddress);

        userDAO = UserDatabase.getDatabaseInstance(this).userDAO();

    }

    final int CAMERA_INTENT = 51;

    public void Capture(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, CAMERA_INTENT);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case CAMERA_INTENT:
                //   if (requestCode == Activity.RESULT_OK){
                bitmapimageview = (Bitmap) data.getExtras().get("data");
                if (bitmapimageview != null) {
                    imageView.setImageBitmap(bitmapimageview);
                } else {
                    Toast.makeText(
                            this,
                            "Bitmap is NULL",
                            Toast.LENGTH_SHORT
                    ).show();
                }

//             }else {
//                   Toast.makeText(
//                          this,
//                         "Result not OK",
//                          Toast.LENGTH_SHORT
//                   ).show();
//               }
                break;
        }

    }

    public void Submit(View view) {
        if (FirstName.getText().toString().isEmpty() || LastName.getText().toString().isEmpty() || phone_Number.getText().toString().isEmpty()
                || Email_Address.getText().toString().isEmpty() || Job_Role.getText().toString().isEmpty() || Dob.getText().toString().isEmpty()
                || House_Address.getText().toString().isEmpty() || bitmapimageview == null) {
            Toast.makeText(
                    this,
                    "User Data is Missing",
                    Toast.LENGTH_SHORT

            ).show();
        } else {
            User user = new User();
            user.setFirstName(FirstName.getText().toString());
            user.setLastName(LastName.getText().toString());
            user.setEmailAddress(Email_Address.getText().toString());
            user.setJobRole(Job_Role.getText().toString());
            user.setHouseAddress(House_Address.getText().toString());
            user.setImage(DataConverter.convertImage2ByteArray(bitmapimageview));
//            try {
//                user.setDob((Date) new SimpleDateFormat("dd/MM/yyyy").parse(Dob.getText().toString()));
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
            userDAO.insertUser(user);
            Toast.makeText(
                    this,
                    "Submission Successful",
                    Toast.LENGTH_SHORT
            ).show();

        }

    }

}



