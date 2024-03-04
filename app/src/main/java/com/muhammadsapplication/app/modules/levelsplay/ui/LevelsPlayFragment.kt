package com.muhammadsapplication.app.modules.levelsplay.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentLevelsPlayBinding
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.ListvectortwentytwoRowModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.SpinnerGroupEightyOneModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.SpinnerGroupSeventyNineModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.Sublevelforl1RowModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.viewmodel.LevelsPlayVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LevelsPlayFragment : BaseFragment<FragmentLevelsPlayBinding>(R.layout.fragment_levels_play) {
  private val viewModel: LevelsPlayVM by viewModels<LevelsPlayVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroupSeventyNineList.value = mutableListOf(
    SpinnerGroupSeventyNineModel("Item1"),
    SpinnerGroupSeventyNineModel("Item2"),
    SpinnerGroupSeventyNineModel("Item3"),
    SpinnerGroupSeventyNineModel("Item4"),
    SpinnerGroupSeventyNineModel("Item5")
    )
    val spinnerGroupSeventyNineAdapter =
    SpinnerGroupSeventyNineAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroupSeventyNineList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyNine.adapter = spinnerGroupSeventyNineAdapter
    viewModel.spinnerGroupEightyOneList.value = mutableListOf(
    SpinnerGroupEightyOneModel("Item1"),
    SpinnerGroupEightyOneModel("Item2"),
    SpinnerGroupEightyOneModel("Item3"),
    SpinnerGroupEightyOneModel("Item4"),
    SpinnerGroupEightyOneModel("Item5")
    )
    val spinnerGroupEightyOneAdapter =
    SpinnerGroupEightyOneAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroupEightyOneList.value?:
    mutableListOf())
    binding.spinnerGroupEightyOne.adapter = spinnerGroupEightyOneAdapter
    val listvectortwentytwoAdapter =
    ListvectortwentytwoAdapter(viewModel.listvectortwentytwoList.value?:mutableListOf())
    binding.recyclerListvectortwentytwo.adapter = listvectortwentytwoAdapter
    listvectortwentytwoAdapter.setOnItemClickListener(
    object : ListvectortwentytwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListvectortwentytwoRowModel) {
        onClickRecyclerListvectortwentytwo(view, position, item)
      }
    }
    )
    viewModel.listvectortwentytwoList.observe(requireActivity()) {
      listvectortwentytwoAdapter.updateData(it)
    }
    val sublevelForLAdapter =
    SublevelForLAdapter(viewModel.sublevelForLList.value?:mutableListOf())
    binding.recyclerSublevelForL.adapter = sublevelForLAdapter
    sublevelForLAdapter.setOnItemClickListener(
    object : SublevelForLAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Sublevelforl1RowModel) {
        onClickRecyclerSublevelForL(view, position, item)
      }
    }
    )
    viewModel.sublevelForLList.observe(requireActivity()) {
      sublevelForLAdapter.updateData(it)
    }
    binding.levelsPlayVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListvectortwentytwo(
    view: View,
    position: Int,
    item: ListvectortwentytwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerSublevelForL(
    view: View,
    position: Int,
    item: Sublevelforl1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LEVELS_PLAY_FRAGMENT"

  }
}
