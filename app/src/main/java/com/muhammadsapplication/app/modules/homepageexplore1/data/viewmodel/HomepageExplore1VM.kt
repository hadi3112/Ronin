package com.muhammadsapplication.app.modules.homepageexplore1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.homepageexplore1.`data`.model.HomepageExplore1Model
import org.koin.core.KoinComponent

class HomepageExplore1VM : ViewModel(), KoinComponent {
  val homepageExplore1Model: MutableLiveData<HomepageExplore1Model> =
      MutableLiveData(HomepageExplore1Model())

  var navArguments: Bundle? = null
}
