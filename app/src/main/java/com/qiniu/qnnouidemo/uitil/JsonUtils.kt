package com.qlive.qnlivekit.uitil;

import android.text.TextUtils
import com.google.gson.Gson

object JsonUtils {

    private val gson = Gson()

    fun <T> parseObject(text: String?, clazz: Class<T>): T? {
        if (TextUtils.isEmpty(text)) {
            return null
        }
        var t: T? = null
        try {
            t = gson.fromJson(text, clazz)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return t
    }

    fun toJson(any: Any): String {
        return gson.toJson(any)
    }

}