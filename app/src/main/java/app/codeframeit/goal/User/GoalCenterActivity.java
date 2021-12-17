package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivityGoalCenterBinding;
import app.codeframeit.goal.databinding.ActivityProfileInfoBinding;

public class GoalCenterActivity extends AppCompatActivity {

    private ActivityGoalCenterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGoalCenterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}