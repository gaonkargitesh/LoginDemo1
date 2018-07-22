package com.example.sith8.logindemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mfullName;

    private EditText memail;

    private EditText muserName;

    private EditText mpassword;

    private EditText mconfrimPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context;
        context = this;

        Button signup = findViewById(R.id.signUP_Button);
        mfullName = findViewById(R.id.fullname_EditText);
        memail = findViewById(R.id.email_EditText);
        muserName = findViewById(R.id.username_EditText);
        mpassword = findViewById(R.id.password_EditText);
        mconfrimPassword=findViewById(R.id.confirmPassword_EditText);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String fullname= mfullName.getText().toString();
                if(!fullname.isEmpty()) {
                    Intent intent = new Intent(context, ProductActivity.class);
                    intent.putExtra(Constants.FULL_NAME, fullname);
                    startActivity(intent);
                }
                //intent.putExtra(Constants.EMAIL,memail.getText());
                //intent.putExtra(Constants.USERNAME,muserName.getText());
                //intent.putExtra(Constants.PASSWORD,mpassword.getText());
                //intent.putExtra(Constants.)


                /*if(mpassword.getText().equals()mconfrimPassword.getText()) {
                    DatabaseHelper databaseHelper = new DatabaseHelper(context);
                    UserModel model = new UserModel();
                    model.setFull_name(mfullName.getText().toString());
                    model.setEmail(memail.getText().toString());
                    model.setUser_name(muserName.getText().toString());
                    model.setPassword(mpassword.getText().toString());
                    databaseHelper.insert_User(model);
                }*/
            }

        });

        /*signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ProductActivity.class);
                startActivity(intent);
            }
        });*/

    }
}
