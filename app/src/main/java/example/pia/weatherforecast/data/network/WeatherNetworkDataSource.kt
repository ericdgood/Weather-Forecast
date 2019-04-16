package example.pia.weatherforecast.data.network

import androidx.lifecycle.LiveData
import example.pia.weatherforecast.data.network.response.CurrentWeatherResponse


/**
 * Created by Eric on 4/16/2019.
 */
interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
}