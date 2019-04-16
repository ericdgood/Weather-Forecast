package example.pia.weatherforecast.data.network.response

import com.google.gson.annotations.SerializedName
import example.pia.weatherforecast.data.db.entity.CurrentWeatherEntry
import example.pia.weatherforecast.data.db.entity.Location

data class CurrentWeatherResponse(
    val location: Location,

    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)