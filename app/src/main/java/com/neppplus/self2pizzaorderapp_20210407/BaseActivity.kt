package com.neppplus.self2pizzaorderapp_20210407

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()
}