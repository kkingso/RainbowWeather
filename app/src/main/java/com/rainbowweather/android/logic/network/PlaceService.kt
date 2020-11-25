package com.rainbowweather.android.logic.network

import com.rainbowweather.android.RainbowWeatherApplication
import com.rainbowweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 城市搜索API的Retrofit接口
 * #https://api.caiyunapp.com/v2/place?query=北京&token={token}&lang=zh_CN
 */
interface PlaceService {

    @GET("v2/place?token=${RainbowWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}