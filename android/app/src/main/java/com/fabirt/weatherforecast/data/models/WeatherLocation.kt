package com.fabirt.weatherforecast.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.fabirt.weatherforecast.core.constants.CURRENT_WEATHER_LOCATION_ID
import com.google.gson.annotations.SerializedName

@Entity(tableName = "weather_location")
data class WeatherLocation(
    @SerializedName("country")
    val country: String,
    @SerializedName("lat")
    val lat: String,
    @SerializedName("localtime")
    val localtime: String,
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Long,
    @SerializedName("lon")
    val lon: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("region")
    val region: String,
    @SerializedName("timezone_id")
    val timezoneId: String,
    @SerializedName("utc_offset")
    val utcOffset: String
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_LOCATION_ID
}