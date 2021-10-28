package com.kennelteam.factoria_client

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kennelteam.factoria_client.databinding.CreateGameFragmentBinding

class CreateGameFragment : Fragment() {

    private lateinit var binding: CreateGameFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.create_game_fragment,
            container,
            false
        )

        binding.startButton.setOnClickListener {
            // start game
            this.findNavController().navigate(R.id.action_createGameFragment_to_multiPlayerFragment)
        }

        return binding.root
    }

}
