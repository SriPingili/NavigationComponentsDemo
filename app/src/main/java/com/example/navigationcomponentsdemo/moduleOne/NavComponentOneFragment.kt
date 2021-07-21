package com.example.navigationcomponentsdemo.moduleOne

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentsdemo.R
import kotlinx.android.synthetic.main.fragment_nav_component_one.*

class NavComponentOneFragment : Fragment(R.layout.fragment_nav_component_one) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonId.setOnClickListener {

            val bundle = Bundle().apply {
                putString("textFromPreviousFragment", textViewId.text.toString())
            }

            findNavController().navigate(
                R.id.action_navComponentOneFragment_to_navComponentThreeFragment,
                bundle
            )


        }


    }
}
