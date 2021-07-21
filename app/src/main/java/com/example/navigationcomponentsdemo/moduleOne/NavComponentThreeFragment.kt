package com.example.navigationcomponentsdemo.moduleOne

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentsdemo.R
import kotlinx.android.synthetic.main.fragment_nav_component_three.*

class NavComponentThreeFragment : Fragment(R.layout.fragment_nav_component_three) {

    val args: NavComponentThreeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val incomingText = args.textFromPreviousFragment

        textViewId.text = incomingText

    }
}
