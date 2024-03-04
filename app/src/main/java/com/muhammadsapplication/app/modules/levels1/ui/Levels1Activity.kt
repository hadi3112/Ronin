package com.muhammadsapplication.app.modules.levels1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityLevels1Binding
import com.muhammadsapplication.app.modules.levels1.`data`.viewmodel.Levels1VM
import kotlin.String
import kotlin.Unit

class Levels1Activity : BaseActivity<ActivityLevels1Binding>(R.layout.activity_levels1) {
  private val viewModel: Levels1VM by viewModels<Levels1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.levels1VM = viewModel
    val adapter = Levels1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabBar,binding.viewPagerViewpager) { tab, position ->
      tab.text = Levels1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "LEVELS1ACTIVITY"

    }
  }
