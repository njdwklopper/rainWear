package com.github.njdwklopper.lib.rain

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import java.util.*

private class Engine(settings: Settings) {
    init {
        val CHARS = "µßþÞÝÐB@A#Ç§ØW&æÆXƒ¢B¥\$M≡ý¶¿ñW"
        val RANDOM = Random()

        var mXOffset = 0f
        var mYOffset = 0f

        val mBackgroundPaint = Paint(Color.BLACK)

        val textPaint = Paint()
        textPaint.typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
        textPaint.isAntiAlias = true
        textPaint.color = settings.mainColor
    }


}

data class Settings(
    val screen: Screen,
    val mainColor: Int,
    val highLightColor: Int,
    val columns: Int,
    val fontSize: Float
)

data class Screen(
    val width: Float,
    val height: Float
)