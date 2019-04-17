package example.pia.weatherforecast

import android.app.Application
import example.pia.weatherforecast.data.db.ForecastDatabase
import example.pia.weatherforecast.data.network.*
import example.pia.weatherforecast.data.repository.ForecastRepository
import example.pia.weatherforecast.data.repository.ForecastRepositoryImpl
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton


/**
 * Created by Eric on 4/16/2019.
 */
class ForecastApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy{
        import(androidXModule(this@ForecastApplication))

        bind() from singleton { ForecastDatabase(instance()) }
        bind() from singleton { instance<ForecastDatabase>().currentWeaterDao() }
        bind<ConnectivityInterceptor>() with singleton { ConnectivityInterceptorImpl(instance()) }
        bind() from singleton { ApixuWeatherApiService(instance()) }
        bind<WeatherNetworkDataSource>() with singleton { WeatherNetworkDataSourceImpl(instance()) }
        bind<ForecastRepository>() with singleton { ForecastRepositoryImpl(instance(), instance()) }
    }

}