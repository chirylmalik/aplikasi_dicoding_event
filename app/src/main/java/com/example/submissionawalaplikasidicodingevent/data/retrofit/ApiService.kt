package com.example.submissionawalaplikasidicodingevent.data.retrofit

import com.example.submissionawalaplikasidicodingevent.data.response.Response
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("events?active=1")
    fun getUpcomingEvent(): Call<List<Response>>
}