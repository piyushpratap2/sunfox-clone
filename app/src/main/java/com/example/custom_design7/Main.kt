package com.example.custom_design7

import com.saurabhbadola.statesman.annotations.State
import com.saurabhbadola.statesman.annotations.StateField

@State
data class Main(
    @StateField var name:String,
    @StateField var email:String,
    @StateField var password:String
)
