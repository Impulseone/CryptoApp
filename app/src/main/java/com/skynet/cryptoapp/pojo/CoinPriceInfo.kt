package com.skynet.cryptoapp.pojo

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

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
    val pRICE: Double?,

    @SerializedName("LASTUPDATE")
    @Expose
    val lASTUPDATE: Int?,

    @SerializedName("MEDIAN")
    @Expose
    val mEDIAN: Double?,

    @SerializedName("LASTVOLUME")
    @Expose
    val lASTVOLUME: Double?,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lASTVOLUMETO: Double?,

    @SerializedName("LASTTRADEID")
    @Expose
    val lASTTRADEID: String?,

    @SerializedName("VOLUMEDAY")
    @Expose
    val vOLUMEDAY: Double?,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val vOLUMEDAYTO: Double?,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val vOLUME24HOUR: Double?,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val vOLUME24HOURTO: Double?,

    @SerializedName("OPENDAY")
    @Expose
    val oPENDAY: Double?,

    @SerializedName("HIGHDAY")
    @Expose
    val hIGHDAY: Double?,

    @SerializedName("LOWDAY")
    @Expose
    val lOWDAY: Double?,

    @SerializedName("OPEN24HOUR")
    @Expose
    val oPEN24HOUR: Double?,

    @SerializedName("HIGH24HOUR")
    @Expose
    val hIGH24HOUR: Double?,

    @SerializedName("LOW24HOUR")
    @Expose
    val lOW24HOUR: Double?,

    @SerializedName("LASTMARKET")
    @Expose
    val lASTMARKET: String?,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val vOLUMEHOUR: Double?,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val vOLUMEHOURTO: Double?,

    @SerializedName("OPENHOUR")
    @Expose
    val oPENHOUR: Double?,

    @SerializedName("HIGHHOUR")
    @Expose
    val hIGHHOUR: Double?,

    @SerializedName("LOWHOUR")
    @Expose
    val lOWHOUR: Double?,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val tOPTIERVOLUME24HOUR: Double?,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val tOPTIERVOLUME24HOURTO: Double?,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val cHANGE24HOUR: Double?,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val cHANGEPCT24HOUR: Double?,

    @SerializedName("CHANGEDAY")
    @Expose
    val cHANGEDAY: Double?,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val cHANGEPCTDAY: Double?,

    @SerializedName("CHANGEHOUR")
    @Expose
    val cHANGEHOUR: Double?,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val cHANGEPCTHOUR: Double?,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val cONVERSIONTYPE: String?,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val cONVERSIONSYMBOL: String?,

    @SerializedName("SUPPLY")
    @Expose
    val sUPPLY: Int?,

    @SerializedName("MKTCAP")
    @Expose
    val mKTCAP: Double?,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    val tOTALVOLUME24H: Double?,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val tOTALVOLUME24HTO: Double?,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val tOTALTOPTIERVOLUME24H: Double?,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val tOTALTOPTIERVOLUME24HTO: Double?,

    @SerializedName("IMAGEURL")
    @Expose
    val iMAGEURL: String?
)