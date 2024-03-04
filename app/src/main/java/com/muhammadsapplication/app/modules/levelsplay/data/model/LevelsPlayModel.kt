package com.muhammadsapplication.app.modules.levelsplay.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LevelsPlayModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_object_oriented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasics: String? = MyApp.getInstance().resources.getString(R.string.lbl_basics)
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
  var txtLoops: String? = MyApp.getInstance().resources.getString(R.string.lbl_loops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoopsTab: String? = MyApp.getInstance().resources.getString(R.string.lbl_loops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConditionals: String? = MyApp.getInstance().resources.getString(R.string.lbl_conditionals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForLoops: String? = MyApp.getInstance().resources.getString(R.string.lbl_for_loops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoopswithcond: String? =
      MyApp.getInstance().resources.getString(R.string.msg_loops_with_cond)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhileLoops: String? = MyApp.getInstance().resources.getString(R.string.lbl_while_loops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChallenge2M: String? = MyApp.getInstance().resources.getString(R.string.msg_challenge_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChallenge3A: String? = MyApp.getInstance().resources.getString(R.string.msg_challenge_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChallenge1G: String? = MyApp.getInstance().resources.getString(R.string.msg_challenge_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChallenge1Gr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_challenge_1_gr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_prerequisites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoopsTabOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_advanced_concep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBossChallenge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_boss_challenge)

)
