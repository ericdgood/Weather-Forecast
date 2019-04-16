package example.pia.weatherforecast.data.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_WEATHER_ID = 0

@Entity(tableName = "current_weather")
data class CurrentWeatherEntry(
    @SerializedName("temp_c")
    val tempC: Double, // 24.4
    @SerializedName("temp_f")
    val tempF: Double, // 75.9
    @SerializedName("is_day")
    val isDay: Int, // 0

    @Embedded(prefix = "condition_")
    val condition: Condition,

    @SerializedName("wind_mph")
    val windMph: Double, // 6.9
    @SerializedName("wind_kph")
    val windKph: Double, // 11.2
    @SerializedName("wind_dir")
    val windDir: String, // NW
    @SerializedName("precip_mm")
    val precipMm: Double, // 0.0
    @SerializedName("precip_in")
    val precipIn: Double, // 0.0
    @SerializedName("feelslike_c")
    val feelslikeC: Double, // 24.4
    @SerializedName("feelslike_f")
    val feelslikeF: Double, // 75.8
    @SerializedName("vis_km")
    val visKm: Double, // 16.0
    @SerializedName("vis_miles")
    val visMiles: Double // 9.0
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}