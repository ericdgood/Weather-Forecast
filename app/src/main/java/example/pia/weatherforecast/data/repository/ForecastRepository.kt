package example.pia.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import example.pia.weatherforecast.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry


/**
 * Created by Eric on 4/16/2019.
 */
interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}