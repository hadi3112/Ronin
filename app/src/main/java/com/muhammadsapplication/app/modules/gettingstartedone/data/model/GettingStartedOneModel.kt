package com.muhammadsapplication.app.modules.gettingstartedone.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GettingStartedOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGettingStartedOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_getting_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoPremium: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_premium)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnlockallLeve: String? =
      MyApp.getInstance().resources.getString(R.string.msg_unlock_all_leve)
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
  var txtNewChallengeP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_challenge_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_solve_tests_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscounts: String? = MyApp.getInstance().resources.getString(R.string.lbl_discounts)
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
