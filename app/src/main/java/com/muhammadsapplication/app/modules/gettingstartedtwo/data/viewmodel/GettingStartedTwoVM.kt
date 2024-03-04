package com.muhammadsapplication.app.modules.gettingstartedtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.gettingstartedtwo.`data`.model.GettingStartedTwoModel
import org.koin.core.KoinComponent

class GettingStartedTwoVM : ViewModel(), KoinComponent {
  val gettingStartedTwoModel: MutableLiveData<GettingStartedTwoModel> =
      MutableLiveData(GettingStartedTwoModel())

  var navArguments: Bundle? = null
}
