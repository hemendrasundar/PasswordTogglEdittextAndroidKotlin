package com.hemendra.spinner

import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_pass_off.setOnClickListener{
            et.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            et.setTransformationMethod(HideReturnsTransformationMethod())
            btn_pass_on.visibility = ImageView.VISIBLE
            btn_pass_off.visibility = ImageView.GONE
        }
        btn_pass_on.setOnClickListener {
            et.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            et.setTransformationMethod(PasswordTransformationMethod())
            btn_pass_off.visibility = ImageView.VISIBLE
            btn_pass_on.visibility = ImageView.GONE
        }


    }
}