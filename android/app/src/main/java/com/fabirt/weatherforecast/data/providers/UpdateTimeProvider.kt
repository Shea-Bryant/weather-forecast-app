package com.fabirt.weatherforecast.data.providers

interface UpdateTimeProvider {
    /**
     * Updates the latest time, in milliseconds, where the weather was updated.
     */
    fun saveLastUpdateTime(time: Long)

    /**
     * @return true if the latest stored time was at least 6 hours ago.
     */
    fun isCurrentWeatherUpdateNeeded(): Boolean
}