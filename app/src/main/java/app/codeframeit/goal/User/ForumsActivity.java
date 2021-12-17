package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivityForgetBinding;
import app.codeframeit.goal.databinding.ActivityForumsBinding;

public class ForumsActivity extends AppCompatActivity {

    private ActivityForumsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForumsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}