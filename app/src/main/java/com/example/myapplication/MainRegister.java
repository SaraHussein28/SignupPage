package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainRegister extends AppCompatActivity {
    EditText mNameEditTxt, mAgeEditTxt, mEmailEditTxt, mPasswordEditTxt, mPhoneEditTxt;
    MaterialButton mRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_main);
        findViews();
        setAction();

    }


    private void findViews() {
        mNameEditTxt = findViewById(R.id.name_hint);
        mAgeEditTxt = findViewById(R.id.age_hint);
        mEmailEditTxt = findViewById(R.id.email_hint);
        mPasswordEditTxt = findViewById(R.id.password_hint);
        mPhoneEditTxt = findViewById(R.id.phone_hint);
        mRegisterBtn = findViewById(R.id.register_btn);
    }

    private void setAction() {
        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String name =   mNameEditTxt.getText().toString();
              String age = mAgeEditTxt.getText().toString();
              String email = mEmailEditTxt.getText().toString();
              String password = mPasswordEditTxt.getText().toString();
              String phone = mPhoneEditTxt.getText().toString();

              if (name.isEmpty() || age.isEmpty() || email.isEmpty() || password.isEmpty() || phone.isEmpty()){

               Toast toast = Toast.makeText(MainRegister.this, "Please fill out all the fields", Toast.LENGTH_SHORT);
               toast.show();

              }

              else {
                  Intent intent = new Intent(MainRegister.this, MainProfile.class);
                  intent.putExtra("name", name);
                  intent.putExtra("age", age);
                  intent.putExtra("email", email);
                  intent.putExtra("password", password);
                  intent.putExtra("phone", phone);
                  startActivity(intent);
              }

            }
        });
    }

}