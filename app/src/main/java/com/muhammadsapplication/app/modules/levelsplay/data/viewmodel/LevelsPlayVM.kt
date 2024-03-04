package com.muhammadsapplication.app.modules.levelsplay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.LevelsPlayModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.ListvectortwentytwoRowModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.SpinnerGroupEightyOneModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.SpinnerGroupSeventyNineModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.Sublevelforl1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LevelsPlayVM : ViewModel(), KoinComponent {
  val levelsPlayModel: MutableLiveData<LevelsPlayModel> = MutableLiveData(LevelsPlayModel())

  var navArguments: Bundle? = null

  val spinnerGroupSeventyNineList: MutableLiveData<MutableList<SpinnerGroupSeventyNineModel>> =
      MutableLiveData()

  val spinnerGroupEightyOneList: MutableLiveData<MutableList<SpinnerGroupEightyOneModel>> =
      MutableLiveData()

  val listvectortwentytwoList: MutableLiveData<MutableList<ListvectortwentytwoRowModel>> =
      MutableLiveData(mutableListOf())

  val sublevelForLList: MutableLiveData<MutableList<Sublevelforl1RowModel>> =
      MutableLiveData(mutableListOf())
}
