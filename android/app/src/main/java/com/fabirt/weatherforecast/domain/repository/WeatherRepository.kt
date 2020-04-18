package com.fabirt.weatherforecast.domain.repository

import androidx.lifecycle.LiveData
import com.fabirt.weatherforecast.domain.entities.CurrentWeather
import com.fabirt.weatherforecast.data.models.WeatherLocation

interface WeatherRepository {
    val currentWeather: LiveData<CurrentWeather?>
    val currentLocation: LiveData<WeatherLocation?>

    /**
     *
     */
    suspend fun fetchCurrentWeatherRacionale()

    /**
     *
     */
    suspend fun fetchCurrentWeatherMandatory()
}