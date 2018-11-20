package com.eton.voler.api

import com.eton.voler.BuildConfig
import com.eton.voler.api.model.LufthansaToken
import com.eton.voler.api.model.ScheduleResponse
import retrofit2.Call
import retrofit2.http.*

interface FlightService {

    @FormUrlEncoded
    @POST(Constants.TOKEN_ENDPOINT)
    fun getToken(
        @Field("client_id") clientId: String = BuildConfig.LUFTHANSA_API_KEY,
        @Field("client_secret") clientSecret: String = BuildConfig.LUFTHANSA_SECRET,
        @Field("grant_type") grantType: String = "client_credentials"
    ): Call<LufthansaToken>

    @GET(Constants.FLIGHT_SCHEDULES)
    fun getFlightSchedules(
        @HeaderMap header: Map<String, String>,
        @Query("origin") origin: String,
        @Query("destination") destination: String,
        @Query("fromDateTime") departureDate: String,
        @Query("directFlights") directFlights: Boolean = false,
        @Query("limit") limit: String = "25",
        @Query("offset") offset: String
    ): Call<ScheduleResponse>
}