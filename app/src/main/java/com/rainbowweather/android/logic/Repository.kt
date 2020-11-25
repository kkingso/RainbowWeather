package com.rainbowweather.android.logic

import androidx.lifecycle.liveData
import com.rainbowweather.android.logic.network.RainbowWeatherNetwork
import kotlinx.coroutines.Dispatchers

/**
 * 仓库层的统一入口
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = RainbowWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "OK") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
        emit(result)
    }

}