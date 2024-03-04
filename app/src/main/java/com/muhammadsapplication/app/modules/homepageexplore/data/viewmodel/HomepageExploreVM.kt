package com.muhammadsapplication.app.modules.homepageexplore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.homepageexplore.`data`.model.HomepageExploreModel
import org.koin.core.KoinComponent

class HomepageExploreVM : ViewModel(), KoinComponent {
  val homepageExploreModel: MutableLiveData<HomepageExploreModel> =
      MutableLiveData(HomepageExploreModel())

  var navArguments: Bundle? = null
}
