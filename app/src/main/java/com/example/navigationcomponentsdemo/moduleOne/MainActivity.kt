package com.example.navigationcomponentsdemo.moduleOne

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.navigationcomponentsdemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController = findNavController(R.id.navHostFragmentId)

        fragmentOneId.setOnClickListener {
            navController.navigateUp()
            navController.navigate(R.id.navComponentOneFragment)
        }

        fragmentTwoId.setOnClickListener {
            navController.navigateUp()
            navController.navigate(R.id.navComponentTwoFragment)
        }

        button.setOnClickListener {
//            startActivity(Intent(this, SecondaryActivity::class.java))

            val bundle = Bundle()
            bundle.putString("sample_text", "this text is being passed from MainActivity.kt")

            navController.navigate(R.id.secondaryActivity, bundle)
        }
    }


}
