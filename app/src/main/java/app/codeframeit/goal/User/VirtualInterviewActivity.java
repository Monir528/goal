package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivityVirtualInterviewBinding;

public class VirtualInterviewActivity extends AppCompatActivity {

    private ActivityVirtualInterviewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVirtualInterviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}