package com.mobinity.wantactmanager.viewModel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel

class LoginViewModel(context: Context): ViewModel() {

    val context = context

    fun loginBtnClick(){

        Toast.makeText(context, "Login Click", Toast.LENGTH_SHORT).show()

    }
}