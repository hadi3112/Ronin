package com.muhammadsapplication.app.modules.homepageexplore.ui

import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentHomepageExploreBinding
import com.muhammadsapplication.app.modules.homepageexplore.`data`.viewmodel.HomepageExploreVM
import kotlin.String
import kotlin.Unit

class HomepageExploreFragment :
    BaseFragment<FragmentHomepageExploreBinding>(R.layout.fragment_homepage_explore) {
  private val viewModel: HomepageExploreVM by viewModels<HomepageExploreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.homepageExploreVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGE_EXPLORE_FRAGMENT"

  }
}
