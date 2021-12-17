package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivityForgetBinding;

public class ForgetActivity extends AppCompatActivity {

    private ActivityForgetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}