package com.muhammadsapplication.app.modules.homepagelevels.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.homepagelevels.`data`.model.HomepageLevelsModel
import com.muhammadsapplication.app.modules.homepagelevels.`data`.model.SpinnerGroupSeventyFiveModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageLevelsVM : ViewModel(), KoinComponent {
  val homepageLevelsModel: MutableLiveData<HomepageLevelsModel> =
      MutableLiveData(HomepageLevelsModel())

  var navArguments: Bundle? = null

  val spinnerGroupSeventyFiveList: MutableLiveData<MutableList<SpinnerGroupSeventyFiveModel>> =
      MutableLiveData()
}
