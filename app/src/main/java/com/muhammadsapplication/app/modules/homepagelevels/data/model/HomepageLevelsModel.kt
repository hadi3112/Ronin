package com.muhammadsapplication.app.modules.homepagelevels.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageLevelsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_object_oriented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHTMLWebThirty: String? = MyApp.getInstance().resources.getString(R.string.lbl_html_web_3_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnlockedLvlOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_unlocked_lvl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasics: String? = MyApp.getInstance().resources.getString(R.string.lbl_basics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConditionals: String? = MyApp.getInstance().resources.getString(R.string.lbl_conditionals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputOutput: String? = MyApp.getInstance().resources.getString(R.string.lbl_input_output)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfelseelseif: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_if_else_elseif)

)
