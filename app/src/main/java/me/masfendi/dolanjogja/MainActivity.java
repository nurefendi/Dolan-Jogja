package me.masfendi.dolanjogja;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.password;

public class MainActivity extends AppCompatActivity {

    private EditText txtInputUser, txtInputPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        txtInputPassword = (EditText) findViewById(R.id.txtPasword);
        txtInputUser = (EditText) findViewById(R.id.txtUser);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtInputUser.getText().toString().equals("admin") && txtInputPassword.getText().toString().equals("admin")) {
                    Intent i = new Intent(MainActivity.this, SplashScreen.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(),"Username Atau Password Salah!",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
