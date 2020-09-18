package com.example.rickandmortykotlin.network
import com.example.rickandmortykotlin.model.CharacterResult
import io.reactivex.Observable
import retrofit2.http.GET

interface ServiceAPI {
    @GET("character")
    fun getCharacters() : Observable<List<CharacterResult>>

}