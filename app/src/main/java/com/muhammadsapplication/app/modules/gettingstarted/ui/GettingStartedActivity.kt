package com.muhammadsapplication.app.modules.gettingstarted.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityGettingStartedBinding
import com.muhammadsapplication.app.modules.gettingstarted.`data`.viewmodel.GettingStartedVM
import com.muhammadsapplication.app.modules.gettingstartedtwo.ui.GettingStartedTwoActivity
import kotlin.String
import kotlin.Unit

class GettingStartedActivity :
    BaseActivity<ActivityGettingStartedBinding>(R.layout.activity_getting_started) {
  private val viewModel: GettingStartedVM by viewModels<GettingStartedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gettingStartedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearInfoCard.setOnClickListener {
      val destIntent = GettingStartedTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GETTING_STARTED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GettingStartedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
