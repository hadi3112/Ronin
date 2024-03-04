package com.muhammadsapplication.app.modules.homepageexplore.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeemore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtObjectOriented: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_object_oriented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPython: String? = MyApp.getInstance().resources.getString(R.string.lbl_python)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtC: String? = MyApp.getInstance().resources.getString(R.string.lbl_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHTML: String? = MyApp.getInstance().resources.getString(R.string.lbl_html)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndroidDev: String? = MyApp.getInstance().resources.getString(R.string.lbl_android_dev)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSolidity: String? = MyApp.getInstance().resources.getString(R.string.lbl_solidity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularModules: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_modules)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_python_4_every)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHTMLforWebThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_html_for_web_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCaBeginner: String? = MyApp.getInstance().resources.getString(R.string.msg_c_a_beginner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLearnSolididit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_learn_solididit)

)
