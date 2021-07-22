package com.example.navigationcomponentsdemo.moduleTwo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentsdemo.R
import kotlinx.android.synthetic.main.fragment_secondary_nav_component_one.*

class SecondaryNavComponentOneFragment : Fragment(R.layout.fragment_secondary_nav_component_one) {

//    https://developer.android.com/guide/navigation/navigation-migrate#java
    val args: SecondaryNavComponentOneFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView3.text = args.sampleText


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
