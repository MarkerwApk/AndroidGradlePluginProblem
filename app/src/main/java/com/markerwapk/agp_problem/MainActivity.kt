package com.markerwapk.agp_problem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.WorkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //WorkManager.getInstance(this)
    }
}