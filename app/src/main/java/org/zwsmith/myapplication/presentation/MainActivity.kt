package org.zwsmith.myapplication.presentation

import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import org.zwsmith.myapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        fragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_fl, MainFragment.newInstance())
                .commit()
    }
}
