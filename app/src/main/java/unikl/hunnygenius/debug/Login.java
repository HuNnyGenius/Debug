package unikl.hunnygenius.debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private Button loginBtn, regBtn;
    private EditText userText, pwdText;
    private TextView forgotTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button)findViewById(R.id.loginBtn);
        regBtn = (Button)findViewById(R.id.regBtn);
        userText = (EditText)findViewById(R.id.userET);
        pwdText = (EditText)findViewById(R.id.pwdET);
        forgotTV = (TextView)findViewById(R.id.forgotTV);
    };

    public void forgotBtn (View v){
        startActivity(new Intent(Login.this, ForgotPwd.class));
        }


    }

