package app.codeframeit.goal.User;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import app.codeframeit.goal.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("Sign Up");
    }
}