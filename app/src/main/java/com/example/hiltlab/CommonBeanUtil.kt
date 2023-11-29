package com.example.hiltlab

object CommonBeanUtil {

    fun checkCommonBeanID(id: String): Boolean = HiltApplication.getCommonBean().id == id
}
