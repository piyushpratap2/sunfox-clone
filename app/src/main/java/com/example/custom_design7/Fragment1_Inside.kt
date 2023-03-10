package com.example.custom_design7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.custom_design7.databinding.FragmentFragment1InsideBinding
import com.saurabhbadola.statesman.BaseFragment

class Fragment1_Inside : BaseFragment<MyViewModel>() {
    private lateinit var binding: FragmentFragment1InsideBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFragment1InsideBinding.inflate(layoutInflater,container,false)
        binding.myviewmodel = viewModel
        binding.lifecycleOwner = this
        binding.executePendingBindings()
        return binding.root
    }

}