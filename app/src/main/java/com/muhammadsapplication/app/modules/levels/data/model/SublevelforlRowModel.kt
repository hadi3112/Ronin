package com.muhammadsapplication.app.modules.levels.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SublevelforlRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArrays: String? = MyApp.getInstance().resources.getString(R.string.lbl_arrays)

)
