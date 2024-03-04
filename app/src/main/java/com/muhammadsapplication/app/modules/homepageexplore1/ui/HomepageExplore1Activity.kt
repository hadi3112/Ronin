package com.muhammadsapplication.app.modules.homepageexplore1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityHomepageExplore1Binding
import com.muhammadsapplication.app.modules.homepageexplore1.`data`.viewmodel.HomepageExplore1VM
import kotlin.String
import kotlin.Unit

class HomepageExplore1Activity :
    BaseActivity<ActivityHomepageExplore1Binding>(R.layout.activity_homepage_explore1) {
  private val viewModel: HomepageExplore1VM by viewModels<HomepageExplore1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageExplore1VM = viewModel
    val adapter = HomepageExplore1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabBar,binding.viewPagerViewpager) { tab, position ->
      tab.text = HomepageExplore1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageClose.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "HOMEPAGE_EXPLORE1ACTIVITY"

    }
  }
