package com.example.navigationcomponentsdemo.moduleTwo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.navigationcomponentsdemo.R;

public class SecondaryActivity extends AppCompatActivity {

    Button secondaryFragmentOneId;
    Button secondaryFragmentTwoId;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        NavController navController = Navigation.findNavController(this, R.id.secondaryNavHostFragmentId);
        secondaryFragmentOneId = findViewById(R.id.secondaryFragmentOneId);
        secondaryFragmentTwoId = findViewById(R.id.secondaryFragmentTwoId);

        secondaryFragmentOneId.setOnClickListener(v -> {
            navController.navigateUp();
            navController.navigate(R.id.secondaryNavComponentOneFragment);
        });

        secondaryFragmentTwoId.setOnClickListener(v -> {
            navController.navigateUp();
            navController.navigate(R.id.secondaryNavComponentTwoFragment);
        });
    }
}
