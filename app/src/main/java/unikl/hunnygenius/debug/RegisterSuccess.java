package unikl.hunnygenius.debug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterSuccess extends AppCompatActivity {

    private TextView sucTV;
    private ImageView hotIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_success);

        sucTV = (TextView)findViewById(R.id.sucTV);
        hotIV = (ImageView)findViewById(R.id.hotIV);
    }
}
