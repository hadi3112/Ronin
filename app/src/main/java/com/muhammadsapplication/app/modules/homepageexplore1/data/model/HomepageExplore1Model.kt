package com.muhammadsapplication.app.modules.homepageexplore1.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageExplore1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_hadi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt25718000Roni: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2571_8000_roni)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentTrack: String? = MyApp.getInstance().resources.getString(R.string.lbl_current_track)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_c_function)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPtsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_000_pts)

)
