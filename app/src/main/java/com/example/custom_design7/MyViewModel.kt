package com.example.custom_design7

import android.app.Application
import com.saurabhbadola.statesman.BaseViewModel
import com.saurabhbadola.statesman.NavigationRoute

class MyViewModel(application: Application): BaseViewModel<MainState>(application = application) {
    override fun createInitialState(): MainState {
        return MainState()
    }
    fun navigation(){
        navigateTo(NavigationRoute(Route.OPEN.name,Route.OPEN.ordinal))
    }

}
enum class Route{
    OPEN,
    NOTOPEN,
}