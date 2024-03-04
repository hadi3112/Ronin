package com.muhammadsapplication.app.modules.levels.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.levels.`data`.model.LevelsModel
import com.muhammadsapplication.app.modules.levels.`data`.model.SpinnerGroupSeventyOneModel
import com.muhammadsapplication.app.modules.levels.`data`.model.SpinnerGroupSeventyThreeModel
import com.muhammadsapplication.app.modules.levels.`data`.model.SublevelforlRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LevelsVM : ViewModel(), KoinComponent {
  val levelsModel: MutableLiveData<LevelsModel> = MutableLiveData(LevelsModel())

  var navArguments: Bundle? = null

  val spinnerGroupSeventyOneList: MutableLiveData<MutableList<SpinnerGroupSeventyOneModel>> =
      MutableLiveData()

  val spinnerGroupSeventyThreeList: MutableLiveData<MutableList<SpinnerGroupSeventyThreeModel>> =
      MutableLiveData()

  val sublevelForLList: MutableLiveData<MutableList<SublevelforlRowModel>> =
      MutableLiveData(mutableListOf())
}
