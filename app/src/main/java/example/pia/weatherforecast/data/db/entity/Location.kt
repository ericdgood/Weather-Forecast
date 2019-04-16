package example.pia.weatherforecast.data.db.entity

import com.google.gson.annotations.SerializedName

data class Location(
    val name: String, // Orlando
    val region: String, // Florida
    val country: String, // USA
    val lat: Double, // 28.52
    val lon: Double, // -81.23
    @SerializedName("tz_id")
    val tzId: String, // America/New_York
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Int, // 1555376742
    val localtime: String // 2019-04-15 21:05
)