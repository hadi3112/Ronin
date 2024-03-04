package com.muhammadsapplication.app.modules.gettingstarted.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GettingStartedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGettingStartedOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_getting_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowitworks: String? = MyApp.getInstance().resources.getString(R.string.lbl_how_it_works)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPickaTechSta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pick_a_tech_sta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosealangua: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_a_langua)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompleteLevels: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_complete_levels)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_solve_tests_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProgress: String? = MyApp.getInstance().resources.getString(R.string.lbl_progress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_earn_medals_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiLookingto: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_looking_to)

)
