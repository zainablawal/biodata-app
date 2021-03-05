package com.example.myemployeebiodataapplication.DataModel;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Users")
public class User {
    @PrimaryKey(autoGenerate = true)
    int uid;
    @ColumnInfo(name = "FirstName")
    String FirstName;
    @ColumnInfo(name = "LastName")
    String LastName;
    @ColumnInfo(name = "Phone_Number")
    int PhoneNumber;
    @ColumnInfo(name = "Email_Address")
    String EmailAddress;
    @ColumnInfo(name = "Job_Role")
    String JobRole;
//    @ColumnInfo(name = "Dob")
//    Date Dob;
    @ColumnInfo(name = "House_Address")
    String HouseAddress;
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    byte [] Image;

    public int getUid() {
        return uid;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public String getJobRole() {
        return JobRole;
    }

//  public Date getDob() {
//       return Dob;
//     }

    public String getHouseAddress() {
        return HouseAddress;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public void setJobRole(String jobRole) {
        JobRole = jobRole;
    }

//   public void setDob(Date dob) {
//      Dob = dob;
//  }

    public void setHouseAddress(String houseAddress) {
        HouseAddress = houseAddress;
    }

    public void setImage(byte[] image) {
        Image = image;
    }


}
