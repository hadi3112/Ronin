package com.muhammadsapplication.app.modules.levels.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentLevelsBinding
import com.muhammadsapplication.app.modules.levels.`data`.model.SpinnerGroupSeventyOneModel
import com.muhammadsapplication.app.modules.levels.`data`.model.SpinnerGroupSeventyThreeModel
import com.muhammadsapplication.app.modules.levels.`data`.model.SublevelforlRowModel
import com.muhammadsapplication.app.modules.levels.`data`.viewmodel.LevelsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LevelsFragment : BaseFragment<FragmentLevelsBinding>(R.layout.fragment_levels) {
  private val viewModel: LevelsVM by viewModels<LevelsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroupSeventyOneList.value = mutableListOf(
    SpinnerGroupSeventyOneModel("Item1"),
    SpinnerGroupSeventyOneModel("Item2"),
    SpinnerGroupSeventyOneModel("Item3"),
    SpinnerGroupSeventyOneModel("Item4"),
    SpinnerGroupSeventyOneModel("Item5")
    )
    val spinnerGroupSeventyOneAdapter =
    SpinnerGroupSeventyOneAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroupSeventyOneList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyOne.adapter = spinnerGroupSeventyOneAdapter
    viewModel.spinnerGroupSeventyThreeList.value = mutableListOf(
    SpinnerGroupSeventyThreeModel("Item1"),
    SpinnerGroupSeventyThreeModel("Item2"),
    SpinnerGroupSeventyThreeModel("Item3"),
    SpinnerGroupSeventyThreeModel("Item4"),
    SpinnerGroupSeventyThreeModel("Item5")
    )
    val spinnerGroupSeventyThreeAdapter =
    SpinnerGroupSeventyThreeAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroupSeventyThreeList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyThree.adapter = spinnerGroupSeventyThreeAdapter
    val sublevelForLAdapter =
    SublevelForLAdapter(viewModel.sublevelForLList.value?:mutableListOf())
    binding.recyclerSublevelForL.adapter = sublevelForLAdapter
    sublevelForLAdapter.setOnItemClickListener(
    object : SublevelForLAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SublevelforlRowModel) {
        onClickRecyclerSublevelForL(view, position, item)
      }
    }
    )
    viewModel.sublevelForLList.observe(requireActivity()) {
      sublevelForLAdapter.updateData(it)
    }
    binding.levelsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSublevelForL(
    view: View,
    position: Int,
    item: SublevelforlRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LEVELS_FRAGMENT"

  }
}
