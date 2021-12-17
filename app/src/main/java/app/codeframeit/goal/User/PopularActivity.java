package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivityPopularBinding;

public class PopularActivity extends AppCompatActivity {

    private ActivityPopularBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPopularBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}