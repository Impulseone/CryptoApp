package com.skynet.cryptoapp.pojo

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import com.skynet.cryptoapp.api.ApiFactory.BASE_IMAGE_URL
import com.skynet.cryptoapp.convertTimestampToTime

@Entity(tableName = "full_price_list")
data class CoinPriceInfo(
    @SerializedName("TYPE")
    @Expose
    val tYPE: String?,

    @SerializedName("MARKET")
    @Expose
    val mARKET: String?,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    val fROMSYMBOL: String,

    @SerializedName("TOSYMBOL")
    @Expose
    val tOSYMBOL: String?,

    @SerializedName("FLAGS")
    @Expose
    val fLAGS: String?,

    @SerializedName("PRICE")
    @Expose
    val pRICE: String?,

    @SerializedName("LASTUPDATE")
    @Expose
    val lASTUPDATE: Long?,

    @SerializedName("MEDIAN")
    @Expose
    val mEDIAN: String?,

    @SerializedName("LASTVOLUME")
    @Expose
    val lASTVOLUME: String?,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lASTVOLUMETO: String?,

    @SerializedName("LASTTRADEID")
    @Expose
    val lASTTRADEID: String?,

    @SerializedName("VOLUMEDAY")
    @Expose
    val vOLUMEDAY: String?,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val vOLUMEDAYTO: String?,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val vOLUME24HOUR: String?,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val vOLUME24HOURTO: String?,

    @SerializedName("OPENDAY")
    @Expose
    val oPENDAY: String?,

    @SerializedName("HIGHDAY")
    @Expose
    val hIGHDAY: String?,

    @SerializedName("LOWDAY")
    @Expose
    val lOWDAY: String?,

    @SerializedName("OPEN24HOUR")
    @Expose
    val oPEN24HOUR: String?,

    @SerializedName("HIGH24HOUR")
    @Expose
    val hIGH24HOUR: String?,

    @SerializedName("LOW24HOUR")
    @Expose
    val lOW24HOUR: String?,

    @SerializedName("LASTMARKET")
    @Expose
    val lASTMARKET: String?,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val vOLUMEHOUR: String?,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val vOLUMEHOURTO: String?,

    @SerializedName("OPENHOUR")
    @Expose
    val oPENHOUR: String?,

    @SerializedName("HIGHHOUR")
    @Expose
    val hIGHHOUR: String?,

    @SerializedName("LOWHOUR")
    @Expose
    val lOWHOUR: String?,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val tOPTIERVOLUME24HOUR: String?,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val tOPTIERVOLUME24HOURTO: String?,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val cHANGE24HOUR: String?,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val cHANGEPCT24HOUR: String?,

    @SerializedName("CHANGEDAY")
    @Expose
    val cHANGEDAY: String?,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val cHANGEPCTDAY: String?,

    @SerializedName("CHANGEHOUR")
    @Expose
    val cHANGEHOUR: String?,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val cHANGEPCTHOUR: String?,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val cONVERSIONTYPE: String?,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val cONVERSIONSYMBOL: String?,

    @SerializedName("SUPPLY")
    @Expose
    val sUPPLY: String?,

    @SerializedName("MKTCAP")
    @Expose
    val mKTCAP: String?,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    val tOTALVOLUME24H: String?,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val tOTALVOLUME24HTO: String?,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val tOTALTOPTIERVOLUME24H: String?,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val tOTALTOPTIERVOLUME24HTO: String?,

    @SerializedName("IMAGEURL")
    @Expose
    val iMAGEURL: String?
){
    fun getFormattedTime():String{
        return convertTimestampToTime(lASTUPDATE)
    }

    fun fullImageUrl():String{
        return BASE_IMAGE_URL + iMAGEURL
    }
}