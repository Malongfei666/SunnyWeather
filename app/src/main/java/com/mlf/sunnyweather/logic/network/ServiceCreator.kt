package com.mlf.sunnyweather.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @description: TODO
 * @author: mlf
 * @date: 2024/9/8 13:07
 * @version: 1.0
 */
object ServiceCreator {
    private const val BASE_URL = "http://api.caiyunapp.com/"
    private val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
        GsonConverterFactory.create()).build()
    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)
    inline fun <reified T> create(): T = create(T::class.java)
}