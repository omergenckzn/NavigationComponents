package com.omer.navigationcomponents

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.omer.navigationcomponents.databinding.FragmentGameScreenBinding
import com.omer.navigationcomponents.databinding.FragmentHomepageBinding


class HomepageFragment : Fragment(R.layout.fragment_homepage) {

    private lateinit var startButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val layout =  inflater.inflate(R.layout.fragment_homepage, container, false)

        startButton = layout.findViewById(R.id.buttonStart)

        startButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toTheGame)
        }



        return layout
    }


}