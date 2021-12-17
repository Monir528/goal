package app.codeframeit.goal.User;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import app.codeframeit.goal.databinding.ActivityRoadmapBinding;

public class RoadmapActivity extends AppCompatActivity {

    private ActivityRoadmapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRoadmapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}