package example.pia.weatherforecast.data.response

data class Condition(
    val text: String, // Clear
    val icon: String, // //cdn.apixu.com/weather/64x64/night/113.png
    val code: Int // 1000
)