package app.codeframeit.goal.User;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import app.codeframeit.goal.databinding.ActivityStatusBinding;

public class StatusActivity extends AppCompatActivity {

    private ActivityStatusBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStatusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}