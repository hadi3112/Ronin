package com.muhammadsapplication.app.modules.homepagelevels.ui

import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentHomepageLevelsBinding
import com.muhammadsapplication.app.modules.homepagelevels.`data`.model.SpinnerGroupSeventyFiveModel
import com.muhammadsapplication.app.modules.homepagelevels.`data`.viewmodel.HomepageLevelsVM
import kotlin.String
import kotlin.Unit

class HomepageLevelsFragment :
    BaseFragment<FragmentHomepageLevelsBinding>(R.layout.fragment_homepage_levels) {
  private val viewModel: HomepageLevelsVM by viewModels<HomepageLevelsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroupSeventyFiveList.value = mutableListOf(
    SpinnerGroupSeventyFiveModel("Item1"),
    SpinnerGroupSeventyFiveModel("Item2"),
    SpinnerGroupSeventyFiveModel("Item3"),
    SpinnerGroupSeventyFiveModel("Item4"),
    SpinnerGroupSeventyFiveModel("Item5")
    )
    val spinnerGroupSeventyFiveAdapter =
    SpinnerGroupSeventyFiveAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroupSeventyFiveList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyFive.adapter = spinnerGroupSeventyFiveAdapter
    binding.homepageLevelsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGE_LEVELS_FRAGMENT"

  }
}
