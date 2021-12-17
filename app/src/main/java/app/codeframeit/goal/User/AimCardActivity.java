package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivityAimCardBinding;

public class AimCardActivity extends AppCompatActivity {

    private ActivityAimCardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAimCardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}