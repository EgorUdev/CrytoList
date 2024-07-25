package com.example.cryptolist.utils

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone

fun convertTimestampToTime(timestamp: Int?): String {
    if (timestamp == null) return ""
    val stamp = Timestamp(timestamp.toLong() * 1000)
    val date = stamp.time
    val pattern = "HH:mm:ss"
    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
    sdf.timeZone = TimeZone.getDefault()
    return sdf.format(date)
}