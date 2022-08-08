package com.vjChauhan.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vjChauhan.daggerhilt.InjectCar.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Field injection
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car.getCar()
    }
}