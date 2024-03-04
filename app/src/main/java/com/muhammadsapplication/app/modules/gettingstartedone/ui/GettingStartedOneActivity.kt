package com.muhammadsapplication.app.modules.gettingstartedone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityGettingStartedOneBinding
import com.muhammadsapplication.app.modules.gettingstartedone.`data`.viewmodel.GettingStartedOneVM
import kotlin.String
import kotlin.Unit

class GettingStartedOneActivity :
    BaseActivity<ActivityGettingStartedOneBinding>(R.layout.activity_getting_started_one) {
  private val viewModel: GettingStartedOneVM by viewModels<GettingStartedOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gettingStartedOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "GETTING_STARTED_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GettingStartedOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
