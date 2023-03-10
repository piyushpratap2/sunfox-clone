package com.example.custom_design7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.custom_design7.databinding.Fragment1Binding
import com.google.android.material.tabs.TabLayoutMediator
import com.saurabhbadola.statesman.BaseFragment


class Fragment1 : BaseFragment<MyViewModel>() {
    private lateinit var binding:Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Binding.inflate(layoutInflater,container,false)
        binding.myviewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.executePendingBindings()
//        val fm = childFragmentManager
//        val fragmentTransaction = fm.beginTransaction()
//        fragmentTransaction.add(R.id.child_fragment_container,Fragment1_Inside())
//        fragmentTransaction.commit()

        binding.pager
        binding.tabLayout

        val pagerAdapter = PagerAdapter(requireActivity())
        binding.pager.adapter = pagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
            val tabNames = listOf("Primary User","Secondary User")
            tab.text = tabNames[position]
        }.attach()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    fun inside(){
        val fm = childFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.add(R.id.child_fragment_container,Fragment1_Inside())
        fragmentTransaction.commit()
    }

}