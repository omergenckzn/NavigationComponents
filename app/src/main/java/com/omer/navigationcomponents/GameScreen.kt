package com.omer.navigationcomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.omer.navigationcomponents.databinding.FragmentGameScreenBinding



class GameScreen : Fragment(R.layout.fragment_game_screen) {

    private lateinit var resultButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout =  inflater.inflate(R.layout.fragment_game_screen, container, false)


        resultButton = layout.findViewById(R.id.buttonFinish)

        resultButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gameScreen_to_resultPage)

        }


        return layout

    }


}