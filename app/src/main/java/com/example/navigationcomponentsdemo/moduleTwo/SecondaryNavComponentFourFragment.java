package com.example.navigationcomponentsdemo.moduleTwo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navigationcomponentsdemo.R;

import org.jetbrains.annotations.NotNull;

public class SecondaryNavComponentFourFragment extends Fragment {

    TextView textView;

    public SecondaryNavComponentFourFragment() {
        super(R.layout.fragment_secondary_nav_component_four);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.textViewId);

        String incomingText = SecondaryNavComponentFourFragmentArgs.fromBundle(getArguments()).getTextFromPreviousSecondaryFragment();
        textView.setText(incomingText);


    }
}
