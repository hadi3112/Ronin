package com.muhammadsapplication.app.modules.gettingstartedtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityGettingStartedTwoBinding
import com.muhammadsapplication.app.modules.gettingstartedone.ui.GettingStartedOneActivity
import com.muhammadsapplication.app.modules.gettingstartedtwo.`data`.viewmodel.GettingStartedTwoVM
import kotlin.String
import kotlin.Unit

class GettingStartedTwoActivity :
    BaseActivity<ActivityGettingStartedTwoBinding>(R.layout.activity_getting_started_two) {
  private val viewModel: GettingStartedTwoVM by viewModels<GettingStartedTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gettingStartedTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumngettingstartedOne.setOnClickListener {
      val destIntent = GettingStartedOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInfoCard.setOnClickListener {
      val destIntent = GettingStartedOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GETTING_STARTED_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GettingStartedTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
