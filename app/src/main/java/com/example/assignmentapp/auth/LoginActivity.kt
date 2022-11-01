package com.example.assignmentapp.auth


import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get


import com.example.assignmentapp.R
import com.example.assignmentapp.databinding.LoginScreenBinding


class LoginActivity : AppCompatActivity(), AuthListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: LoginScreenBinding = DataBindingUtil.setContentView(this, R.layout.login_screen)
        //val factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory()
        //val mViewModel = ViewModelProvider((this), factory).get(AuthViewModel::class.java)
        val mViewModel:AuthViewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewModel = mViewModel
        binding.lifecycleOwner=this
        //mViewModel.authListner = this@LoginActivity
    }

    override fun onStarted() {
        Toast.makeText(this@LoginActivity, "Login Started", Toast.LENGTH_LONG).show()
    }

    override fun onSuccess() {
        Toast.makeText(this@LoginActivity, "Login Success", Toast.LENGTH_LONG).show()
    }

    override fun onFailed(message: String) {
        Toast.makeText(this@LoginActivity, message, Toast.LENGTH_LONG).show()
    }
    //
}