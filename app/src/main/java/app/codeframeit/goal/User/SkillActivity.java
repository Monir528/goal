package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivitySkillBinding;

public class SkillActivity extends AppCompatActivity {


    private ActivitySkillBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySkillBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}