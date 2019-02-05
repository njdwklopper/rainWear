package com.github.njdwklopper.lib.rain

import android.graphics.Canvas

interface RainSurface {
    fun init()
    fun draw(canvas: Canvas)
}