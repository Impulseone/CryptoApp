package com.skynet.cryptoapp.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

data class CoinPriceInfo (
    @SerializedName("TYPE")
    @Expose
    private val tYPE: String? = null,

    @SerializedName("MARKET")
    @Expose
    private val mARKET: String? = null,

    @SerializedName("FROMSYMBOL")
    @Expose
    private val fROMSYMBOL: String? = null,

    @SerializedName("TOSYMBOL")
    @Expose
    private val tOSYMBOL: String? = null,

    @SerializedName("FLAGS")
    @Expose
    private val fLAGS: String? = null,

    @SerializedName("PRICE")
    @Expose
    private val pRICE: Double? = null,

    @SerializedName("LASTUPDATE")
    @Expose
    private val lASTUPDATE: Int? = null,

    @SerializedName("MEDIAN")
    @Expose
    private val mEDIAN: Double? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    private val lASTVOLUME: Double? = null,

    @SerializedName("LASTVOLUMETO")
    @Expose
    private val lASTVOLUMETO: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    private val lASTTRADEID: String? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    private val vOLUMEDAY: Double? = null,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    private val vOLUMEDAYTO: Double? = null,

    @SerializedName("VOLUME24HOUR")
    @Expose
    private val vOLUME24HOUR: Double? = null,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    private val vOLUME24HOURTO: Double? = null,

    @SerializedName("OPENDAY")
    @Expose
    private val oPENDAY: Double? = null,

    @SerializedName("HIGHDAY")
    @Expose
    private val hIGHDAY: Double? = null,

    @SerializedName("LOWDAY")
    @Expose
    private val lOWDAY: Double? = null,

    @SerializedName("OPEN24HOUR")
    @Expose
    private val oPEN24HOUR: Double? = null,

    @SerializedName("HIGH24HOUR")
    @Expose
    private val hIGH24HOUR: Double? = null,

    @SerializedName("LOW24HOUR")
    @Expose
    private val lOW24HOUR: Double? = null,

    @SerializedName("LASTMARKET")
    @Expose
    private val lASTMARKET: String? = null,

    @SerializedName("VOLUMEHOUR")
    @Expose
    private val vOLUMEHOUR: Double? = null,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    private val vOLUMEHOURTO: Double? = null,

    @SerializedName("OPENHOUR")
    @Expose
    private val oPENHOUR: Double? = null,

    @SerializedName("HIGHHOUR")
    @Expose
    private val hIGHHOUR: Double? = null,

    @SerializedName("LOWHOUR")
    @Expose
    private val lOWHOUR: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    private val tOPTIERVOLUME24HOUR: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    private val tOPTIERVOLUME24HOURTO: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    private val cHANGE24HOUR: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    private val cHANGEPCT24HOUR: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    private val cHANGEDAY: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    private val cHANGEPCTDAY: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    private val cHANGEHOUR: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    private val cHANGEPCTHOUR: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    private val cONVERSIONTYPE: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    private val cONVERSIONSYMBOL: String? = null,

    @SerializedName("SUPPLY")
    @Expose
    private val sUPPLY: Int? = null,

    @SerializedName("MKTCAP")
    @Expose
    private val mKTCAP: Double? = null,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    private val tOTALVOLUME24H: Double? = null,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    private val tOTALVOLUME24HTO: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    private val tOTALTOPTIERVOLUME24H: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    private val tOTALTOPTIERVOLUME24HTO: Double? = null,

    @SerializedName("IMAGEURL")
    @Expose
    private val iMAGEURL: String? = null
)