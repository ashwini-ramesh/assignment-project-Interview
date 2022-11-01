package com.example.assignmentapp.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email: String? = null
    var paswrd: String? = null
    var authListner: AuthListner? = null

    fun onLoginButtonClick(view: View) {
        authListner!!.onStarted()
        if (email.isNullOrEmpty()) {
            authListner?.onFailed("Invalid email Id")
            return
        } else if (paswrd.isNullOrEmpty()) {
            authListner?.onFailed("Invalid password")
            return
        }
        authListner?.onSuccess()
        //success
    }
}