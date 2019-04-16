package example.pia.weatherforecast.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import example.pia.weatherforecast.data.db.entity.CurrentWeatherEntry


/**
 * Created by Eric on 4/15/2019.
 */

@Database(
    entities = [CurrentWeatherEntry::class],
    version = 1
)

abstract class ForecastDatabase : RoomDatabase(){
    abstract fun currentWeaterDao(): CurrentWeatherDao

    companion object {
        @Volatile private var instant: ForecastDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instant ?: synchronized(LOCK) {
            instant ?: buildDatabase(context).also { instant = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                ForecastDatabase::class.java, "forecast.db")
                .build()
    }
}