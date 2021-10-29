package com.kennelteam.factoria_client

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kennelteam.factoria_client.databinding.MultiPlayerFinishedFragmentBinding

class MultiPlayerFinishedFragment : Fragment() {

    private lateinit var binding: MultiPlayerFinishedFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.multi_player_finished_fragment,
            container,
            false
        )

        binding.okButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_multiPlayerFinishedFragment_to_mainScreenFragment)
        }

        return binding.root
    }

}
