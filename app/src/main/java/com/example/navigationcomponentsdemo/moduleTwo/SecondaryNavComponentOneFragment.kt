package com.example.navigationcomponentsdemo.moduleTwo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentsdemo.R
import kotlinx.android.synthetic.main.fragment_secondary_nav_component_one.*

class SecondaryNavComponentOneFragment : Fragment(R.layout.fragment_secondary_nav_component_one) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonId.setOnClickListener {

            val bundle = Bundle().apply {
                putString("textFromPreviousSecondaryFragment", textViewId.text.toString())
            }

            findNavController().navigate(
                R.id.action_secondaryNavComponentOneFragment_to_secondaryNavComponentThreeFragment,
                bundle
            )
        }


    }
}
