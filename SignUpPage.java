package com.example.card2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.annotation.NonNullApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpPage extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button loginbtn;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        username=findViewById(R.id.username);
        password =findViewById(R.id.password);
        loginbtn=findViewById(R.id.loginbtn);

        auth= FirebaseAuth.getInstance();

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtuser = username.getText().toString();
                String txtpass = password.getText().toString();

                if (TextUtils.isEmpty(txtuser))
                {
                    Toast.makeText(SignUpPage.this, "please enter username and password", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(txtpass))
                {
                    Toast.makeText(SignUpPage.this, "please enter username and password", Toast.LENGTH_SHORT).show();
                }

                else {
                    loginuser(txtuser, txtpass);
                    Intent intent =new Intent(SignUpPage.this,LoginPage.class);
                    startActivity(intent);
                }
            }

        });



    }

    private void loginuser(String txtuser, String txtpass) {

        auth.createUserWithEmailAndPassword(txtuser,txtpass).addOnCompleteListener(SignUpPage.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete( Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(SignUpPage.this,"Successfully",Toast.LENGTH_SHORT);
                    Intent intent =new Intent(SignUpPage.this,LoginPage.class);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(SignUpPage.this,"sigup not successfully",Toast.LENGTH_SHORT);
                }

            }
        });
    }
}