package com.muhammadsapplication.app.modules.gettingstartedtwo.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GettingStartedTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGettingStartedOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_getting_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosewhatto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_what_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_pick_a_prefere)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectwhattec: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_what_tec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonotworry: String? = MyApp.getInstance().resources.getString(R.string.lbl_do_not_worry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_there_s_tutoria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_go_through_as_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiLookingto: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_looking_to)

)
