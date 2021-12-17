package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivityProfileInfoBinding;

public class ProfileInfoActivity extends AppCompatActivity {

    private ActivityProfileInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}