package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainProfile extends AppCompatActivity {
    TextView mNameTxt, mAgeTxt, mEmailTxt, mPasswordTxt, mPhoneTxt;
    String mName, mAge, mEmail, mPassword, mPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_main);
        findViews();
        getIntentValues();
        setTxt();
    }

    private void getIntentValues() {
        mName = getIntent().getStringExtra("name");
        mAge = getIntent().getStringExtra("age");
        mEmail = getIntent().getStringExtra("email");
        mPassword = getIntent().getStringExtra("password");
        mPhone = getIntent().getStringExtra("phone");
    }

    private void setTxt() {
        mNameTxt.setText(mName);
        mAgeTxt.setText(mAge);
        mPasswordTxt.setText(mPassword);
        mEmailTxt.setText(mEmail);
        mPhoneTxt.setText(mPhone);

    }

    private void findViews() {
        mNameTxt = findViewById(R.id.name_hint);
        mAgeTxt = findViewById(R.id.age_hint);
        mEmailTxt = findViewById(R.id.email_hint);
        mPasswordTxt = findViewById(R.id.password_hint);
        mPhoneTxt = findViewById(R.id.phone_hint);
    }

}