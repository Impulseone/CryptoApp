package com.skynet.cryptoapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.json.JSONObject


data class CoinPriceInfoRawData(
    @SerializedName("RAW")
    @Expose
    private val coinPriceInfoJSONObject: JSONObject? = null
)

