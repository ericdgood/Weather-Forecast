package example.pia.weatherforecast.data.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherEntry(
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int, // 1555375521
    @SerializedName("last_updated")
    val lastUpdated: String, // 2019-04-15 20:45
    @SerializedName("temp_c")
    val tempC: Double, // 24.4
    @SerializedName("temp_f")
    val tempF: Double, // 75.9
    @SerializedName("is_day")
    val isDay: Int, // 0
    val condition: Condition,
    @SerializedName("wind_mph")
    val windMph: Double, // 6.9
    @SerializedName("wind_kph")
    val windKph: Double, // 11.2
    @SerializedName("wind_degree")
    val windDegree: Int, // 320
    @SerializedName("wind_dir")
    val windDir: String, // NW
    @SerializedName("pressure_mb")
    val pressureMb: Double, // 1017.0
    @SerializedName("pressure_in")
    val pressureIn: Double, // 30.5
    @SerializedName("precip_mm")
    val precipMm: Double, // 0.0
    @SerializedName("precip_in")
    val precipIn: Double, // 0.0
    val humidity: Int, // 30
    val cloud: Int, // 0
    @SerializedName("feelslike_c")
    val feelslikeC: Double, // 24.4
    @SerializedName("feelslike_f")
    val feelslikeF: Double, // 75.8
    @SerializedName("vis_km")
    val visKm: Double, // 16.0
    @SerializedName("vis_miles")
    val visMiles: Double, // 9.0
    val uv: Double, // 0.0
    @SerializedName("gust_mph")
    val gustMph: Double, // 12.1
    @SerializedName("gust_kph")
    val gustKph: Double // 19.4
)