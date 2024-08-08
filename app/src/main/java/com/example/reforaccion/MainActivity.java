package com.example.reforaccion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String url;
    private ImageButton googlebot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLog = findViewById(R.id.buttonLog);
        TextView createAcc = findViewById(R.id.createAcclink);
        TextView recPassword = findViewById(R.id.recPassw);
        EditText passwordEditText = findViewById(R.id.editTextTextPassword3);
        ImageButton togglePasswordVisibilityButton = findViewById(R.id.imageButton);


        googlebot = findViewById(R.id.googlebot);
        url = "https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?access_type=offline&approval_prompt=force&client_id=372941403685-ea9uim0oiuk805ogakvcg62f3s7a4u9d.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fapi.moqups.com%2Fgoogle%2FauthCallback&response_type=code&scope=profile%20email&state=%7B%22securityToken%22%3A%22vet95p5m3vhj8o8oaaj361pioi%22%2C%22redirect%22%3A%22%22%2C%22action%22%3A%22login%22%2C%22redirectError%22%3A%22%22%7D&service=lso&o2v=1&ddm=0&flowName=GeneralOAuthFlow";
        googlebot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoriesBtn.class);
                startActivity(intent);
            }
        });

        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateAccount.class);
                startActivity(intent);
            }
        });

        recPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RecoverPassw.class);
                startActivity(intent);
            }
        });

        togglePasswordVisibilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passwordEditText.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                    passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    togglePasswordVisibilityButton.setImageResource(R.drawable.baseline_visibility_off_24);
                } else {
                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    togglePasswordVisibilityButton.setImageResource(R.drawable.baseline_visibility_24);
                }
                // Mueve el cursor al final del texto
                passwordEditText.setSelection(passwordEditText.getText().length());
            }
        });

    }
}