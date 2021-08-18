package com.example.covid19_tracker

import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan

class SpannableDelta(text: String, color: Int, start: Int) : SpannableString(text) {
    init {
        setSpan(
            ForegroundColorSpan(color),
            start,
            text.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
}