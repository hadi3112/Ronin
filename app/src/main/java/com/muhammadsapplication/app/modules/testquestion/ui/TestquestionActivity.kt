package com.muhammadsapplication.app.modules.testquestion.ui

import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityTestquestionBinding
import com.muhammadsapplication.app.modules.testquestion.`data`.viewmodel.TestquestionVM
import kotlin.String
import kotlin.Unit

class TestquestionActivity :
    BaseActivity<ActivityTestquestionBinding>(R.layout.activity_testquestion) {
  private val viewModel: TestquestionVM by viewModels<TestquestionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.testquestionVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TESTQUESTION_ACTIVITY"

  }
}
