package com.example.reforaccion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VerifyEmail extends AppCompatActivity {

    private String url;
    private ImageButton emailBtn;
    private ImageButton hotmailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_email);

        Button buttonCode = findViewById(R.id.enterCode);

        hotmailBtn = findViewById(R.id.hotmailBtn);
        url = "https://support.microsoft.com/en-us/office/how-to-sign-in-to-hotmail-c378938b-c0eb-40c1-b99e-338dd9e776a8";
        hotmailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        emailBtn = findViewById(R.id.emailBtn);
        url = "https://mail.google.com/mail/u/0/#inbox";
        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        buttonCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}