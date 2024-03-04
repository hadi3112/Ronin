package com.muhammadsapplication.app.modules.splashscreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivitySplashscreenBinding
import com.muhammadsapplication.app.modules.login.ui.LoginActivity
import com.muhammadsapplication.app.modules.splashscreen.`data`.viewmodel.SplashscreenVM
import kotlin.String
import kotlin.Unit

class SplashscreenActivity :
    BaseActivity<ActivitySplashscreenBinding>(R.layout.activity_splashscreen) {
  private val viewModel: SplashscreenVM by viewModels<SplashscreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashscreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.frameSplashScreen.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SPLASHSCREEN_ACTIVITY"

    }
  }
