package unikl.hunnygenius.debug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPwd extends AppCompatActivity {

    private EditText nPwdET, cfPwdET;
    private Button DoneBtn;
    private ImageView keyIV;
    private TextView resetTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pwd);

        nPwdET = (EditText)findViewById(R.id.nPwdET);
        cfPwdET = (EditText)findViewById(R.id.cfPwdET);
        DoneBtn = (Button)findViewById(R.id.DoneBtn);
        keyIV = (ImageView)findViewById(R.id.keyIV);
        resetTV = (TextView)findViewById(R.id.resetTV);
    }
}
