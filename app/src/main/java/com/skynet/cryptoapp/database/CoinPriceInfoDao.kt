package com.skynet.cryptoapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.skynet.cryptoapp.pojo.CoinPriceInfo

@Dao
interface CoinPriceInfoDao {

    @Query("select * from full_price_list order by lASTUPDATE")
    fun getPriceList(): LiveData<List<CoinPriceInfo>>

    @Query("select * from full_price_list where fROMSYMBOL==:fSym limit 1")
    fun getPriceInfoAboutCoin(fSym:String):LiveData<CoinPriceInfo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceList(priceList: List<CoinPriceInfo>)
}