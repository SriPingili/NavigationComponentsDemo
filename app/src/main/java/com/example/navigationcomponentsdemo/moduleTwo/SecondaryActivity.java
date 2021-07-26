package com.example.navigationcomponentsdemo.moduleTwo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.navigationcomponentsdemo.R;
import com.example.navigationcomponentsdemo.moduleOne.NavComponentFourFragmentArgs;

public class SecondaryActivity extends AppCompatActivity {

    Button secondaryFragmentOneId;
    Button secondaryFragmentTwoId;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //https://developer.android.com/guide/navigation/navigation-migrate#java
        String incomingText = SecondaryActivityArgs.fromBundle(getIntent().getExtras()).getSampleText();

        Toast.makeText(this, incomingText, Toast.LENGTH_LONG).show();

        Navigation.findNavController(this, R.id.secondaryNavHostFragmentId).setGraph(R.navigation.secondary_nav_graph, getIntent().getExtras());


        NavController navController = Navigation.findNavController(this, R.id.secondaryNavHostFragmentId);
        secondaryFragmentOneId = findViewById(R.id.secondaryFragmentOneId);
        secondaryFragmentTwoId = findViewById(R.id.secondaryFragmentTwoId);

        secondaryFragmentOneId.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString("sample_text", "sample text");
            navController.navigateUp();
            navController.navigate(R.id.secondaryNavComponentOneFragment, bundle);
        });

        secondaryFragmentTwoId.setOnClickListener(v -> {
            navController.navigateUp();
            navController.navigate(R.id.secondaryNavComponentTwoFragment);
        });
    }
}
