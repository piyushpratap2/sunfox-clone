package com.example.custom_design7

import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.custom_design7.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.saurabhbadola.statesman.BaseActivity
import com.saurabhbadola.statesman.BaseViewModel
import com.saurabhbadola.statesman.NavigationRoute

class MainActivity : BaseActivity<MainState>() {
    private lateinit var binding: ActivityMainBinding
    lateinit var navHostFragment: NavHostFragment
    lateinit var navController: NavController
    lateinit var myViewModel: MyViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        navController = navHostFragment.navController

         val navView = binding.bottomNavView
        navView.setupWithNavController(navController)

        val topSheetLayout = findViewById<RelativeLayout>(R.id.top_sheet_layout)
        val behavior = BottomSheetBehavior.from(topSheetLayout)

        behavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                 bottomSheet
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
               /* bottomSheet.animate().y(v <= 0 ?
                view.getY() + mSheetBehavior.getPeekHeight() - yourView.getHeight() :
                view.getHeight() - yourView.getHeight()).setDuration(0).start();*/
            }
        })
    }

    override fun createViewModel(): BaseViewModel<MainState> {
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        return myViewModel
    }

    override fun onNavigationRouteChange(newRoute: NavigationRoute, oldRoute: NavigationRoute){
        when(newRoute.routeName){
            Route.OPEN.name ->{
                /*val f =Fragment1()
                f.isVisible
                    f.inside()*/
//                val navFragment = supportFragmentManager.findFragmentById(R.id.container)
//                val mapFragment = navFragment!!.childFragmentManager.getPrimaryNavigationFragment()
//                mapFragment.
//                myViewModel.navigation()
            }
        }
    }

    override fun onStateChanged(newState: MainState, oldState: MainState){

    }

}