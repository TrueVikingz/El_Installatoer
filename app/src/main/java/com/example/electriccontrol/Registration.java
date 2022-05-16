package com.example.electriccontrol;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    TextView Error;
    EditText Username;
    EditText Firstname;
    EditText Lastname;
    EditText Password;
    EditText Repeat_Password;
    EditText E_mail;
    Button SignUp;
    TextView SignIn;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Username = (EditText) findViewById(R.id.editUserName);
        Password = (EditText) findViewById(R.id.editPassword);
        Firstname = (EditText) findViewById(R.id.editFirstName);
        Lastname = (EditText) findViewById(R.id.editLastName);
        Password = (EditText) findViewById(R.id.editPassword);
        Repeat_Password = (EditText) findViewById(R.id.editPasswordVerification);
        E_mail = (EditText) findViewById(R.id.editEmail);
        SignUp = (Button) findViewById(R.id.Loginbtn);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= Username.getText().toString().trim();
                String password= Password.getText().toString().trim();
                String repeat_password= Repeat_Password.getText().toString().trim();

                if (password.equals(repeat_password)){
                    long vaLue =db.addUser(username, password);

                    if (vaLue >1){
                        Intent moveToLogin = new Intent(Registration.this, MainActivity.class);
                        startActivity(moveToLogin);
                    }
                }
                else {
                    Error = (TextView) findViewById(R.id.error);
                    Error.setText("Password is not matching");
                }
            }
        });

        SignIn =(TextView) findViewById(R.id.SignIn);
        SignIn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });

    }

    private void openLoginActivity() {
        Intent login = new Intent(Registration.this, MainActivity.class);
        startActivity(login);
    }

}
