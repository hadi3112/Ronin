package com.muhammadsapplication.app.modules.levels1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.levels1.`data`.model.Levels1Model
import org.koin.core.KoinComponent

class Levels1VM : ViewModel(), KoinComponent {
  val levels1Model: MutableLiveData<Levels1Model> = MutableLiveData(Levels1Model())

  var navArguments: Bundle? = null
}
