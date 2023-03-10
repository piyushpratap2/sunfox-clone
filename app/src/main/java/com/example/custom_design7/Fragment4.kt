package com.example.custom_design7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.custom_design7.databinding.Fragment4Binding
import com.saurabhbadola.statesman.BaseFragment


class Fragment4 : BaseFragment<MyViewModel>() {
    private lateinit var binding: Fragment4Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment4Binding.inflate(layoutInflater,container,false)
        binding.lifecycleOwner = this
        binding.executePendingBindings()
        return binding.root
    }

}