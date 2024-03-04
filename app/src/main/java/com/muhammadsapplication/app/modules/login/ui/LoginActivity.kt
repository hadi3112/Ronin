package com.muhammadsapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityLoginBinding
import com.muhammadsapplication.app.modules.gettingstarted.ui.GettingStartedActivity
import com.muhammadsapplication.app.modules.login.`data`.model.LoginRowModel
import com.muhammadsapplication.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val loginAdapter = LoginAdapter(viewModel.loginList.value?:mutableListOf())
    binding.recyclerLogin.adapter = loginAdapter
    loginAdapter.setOnItemClickListener(
    object : LoginAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LoginRowModel) {
        onClickRecyclerLogin(view, position, item)
      }
    }
    )
    viewModel.loginList.observe(this) {
      loginAdapter.updateData(it)
    }
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignIn.setOnClickListener {
      val destIntent = GettingStartedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerLogin(
    view: View,
    position: Int,
    item: LoginRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
