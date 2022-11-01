package com.example.assignmentapp.auth

interface AuthListner {
    fun onStarted()
    fun onSuccess()
    fun onFailed(message:String)

}