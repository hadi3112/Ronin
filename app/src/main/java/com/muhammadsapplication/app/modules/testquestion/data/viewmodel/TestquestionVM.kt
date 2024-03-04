package com.muhammadsapplication.app.modules.testquestion.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.testquestion.`data`.model.TestquestionModel
import org.koin.core.KoinComponent

class TestquestionVM : ViewModel(), KoinComponent {
  val testquestionModel: MutableLiveData<TestquestionModel> = MutableLiveData(TestquestionModel())

  var navArguments: Bundle? = null
}
