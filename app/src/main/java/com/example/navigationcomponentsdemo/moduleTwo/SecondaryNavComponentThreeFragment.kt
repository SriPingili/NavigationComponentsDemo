package com.example.navigationcomponentsdemo.moduleTwo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentsdemo.R
import kotlinx.android.synthetic.main.fragment_secondary_nav_component_three.*

class SecondaryNavComponentThreeFragment :
    Fragment(R.layout.fragment_secondary_nav_component_three) {

    val args: SecondaryNavComponentThreeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val incomingText = args.textFromPreviousSecondaryFragment

        textViewId.text = incomingText

    }
}
