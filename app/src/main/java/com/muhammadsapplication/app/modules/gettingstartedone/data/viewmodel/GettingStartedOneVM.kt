package com.muhammadsapplication.app.modules.gettingstartedone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.gettingstartedone.`data`.model.GettingStartedOneModel
import org.koin.core.KoinComponent

class GettingStartedOneVM : ViewModel(), KoinComponent {
  val gettingStartedOneModel: MutableLiveData<GettingStartedOneModel> =
      MutableLiveData(GettingStartedOneModel())

  var navArguments: Bundle? = null
}
