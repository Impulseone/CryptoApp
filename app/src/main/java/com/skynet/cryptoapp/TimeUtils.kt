package com.skynet.cryptoapp

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*

fun convertTimestampToTime(timestamp:Long?):String{
    if (timestamp==null) return ""
    val stamp = Timestamp(timestamp*1000)
    val date = Date(stamp.time)
    val simpleDateFormat = SimpleDateFormat("HH:mm:ss",Locale.getDefault())
    simpleDateFormat.timeZone = TimeZone.getDefault()
    return simpleDateFormat.format(date)
}