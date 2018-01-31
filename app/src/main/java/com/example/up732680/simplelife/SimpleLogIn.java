package com.example.up732680.simplelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;


public class SimpleLogIn extends AppCompatActivity {

    private Button signbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        initializeControls();
        loginWithFB();
        setContentView(R.layout.activity_simple_log_in);


        signbutton = (Button) findViewById(R.id.signinbutton);
        signbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthis();
            }


        });
    }

    public void openthis() {
        Intent intentsign = new Intent(SimpleLogIn.this, SimpleHome.class);
        startActivity(intentsign);
    }

    public void registerb(View v) {
        Intent opennew2 = new Intent(SimpleLogIn.this, SimpleRegister.class);
        startActivity(opennew2);

    }

    TextView txtStatus;
    LoginButton login_button;
    CallbackManager callbackManager;

    private void initializeControls() {
        callbackManager = CallbackManager.Factory.create();
        txtStatus = (TextView) findViewById(R.id.txtstatus);
        login_button = (LoginButton) findViewById(R.id.login_button);
    }

    private void loginWithFB() {
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                txtStatus.setText("Login Success\n"+loginResult.getAccessToken());
            }

            @Override
            public void onCancel() {
                txtStatus.setText("Login Failed");
            }

            @Override
            public void onError(FacebookException error) {
                txtStatus.setText("Login Error: "+error.getMessage());
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
}


