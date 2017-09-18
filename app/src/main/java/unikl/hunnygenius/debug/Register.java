package unikl.hunnygenius.debug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    private ImageView iconIV;
    private EditText uRegET, pwdEt, emailET;
    private Button regBtn2;
    private TextView backTv, registerTV, profileTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        iconIV = (ImageView)findViewById(R.id.iconIV);
        uRegET = (EditText)findViewById(R.id.uRegET);
        pwdEt = (EditText)findViewById(R.id.pwdET);
        emailET = (EditText)findViewById(R.id.emailET);
        regBtn2 = (Button)findViewById(R.id.regBtn2);
        backTv = (TextView)findViewById(R.id.backTV);
        registerTV = (TextView)findViewById(R.id.registerTV);
        profileTV = (TextView)findViewById(R.id.profileTV);
    }
}
