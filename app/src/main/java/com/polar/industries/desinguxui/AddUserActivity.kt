package com.polar.industries.desinguxui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)
        supportActionBar!!.hide()
    }
}