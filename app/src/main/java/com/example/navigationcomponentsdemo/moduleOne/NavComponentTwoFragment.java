package com.example.navigationcomponentsdemo.moduleOne;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.navigationcomponentsdemo.R;

import org.jetbrains.annotations.NotNull;

public class NavComponentTwoFragment extends Fragment {

    public NavComponentTwoFragment() {
        super(R.layout.fragment_nav_component_two);
    }

    private Button button;
    private EditText editText;


    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button = view.findViewById(R.id.buttonId);
        editText = view.findViewById(R.id.editTextId);

        button.setOnClickListener(v -> {

            Bundle bundle = new Bundle();
            bundle.putString("textFromPreviousFragment", editText.getText().toString());

            Navigation.findNavController(v).navigate(R.id.action_navComponentTwoFragment_to_navComponentFourFragment, bundle);

        });

//        buttonId.setOnClickListener {
//
//            val bundle = Bundle().apply {
//                putString("textFromPreviousFragment", textViewId.text.toString())
//            }
//
//            findNavController().navigate(
//                    R.id.action_navComponentOneFragment_to_navComponentThreeFragment,
//                    bundle
//            )
//
//
//        }
    }
}
