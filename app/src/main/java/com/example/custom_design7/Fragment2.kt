package com.example.custom_design7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.custom_design7.databinding.Fragment1Binding
import com.example.custom_design7.databinding.Fragment2Binding
import com.saurabhbadola.statesman.BaseFragment


class Fragment2 : BaseFragment<MyViewModel>() {
    private lateinit var binding:Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment2Binding.inflate(layoutInflater,container,false)
        binding.myviewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.executePendingBindings()
        return binding.root
    }


}