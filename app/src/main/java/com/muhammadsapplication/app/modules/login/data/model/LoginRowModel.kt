package com.muhammadsapplication.app.modules.login.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailhint: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)

)
