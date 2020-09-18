package com.example.rickandmortykotlin.repository

import com.example.rickandmortykotlin.model.CharacterResult
import com.example.rickandmortykotlin.network.RetrofitService
import io.reactivex.Observable

class Repository {
    fun getCharacters() : Observable<List<CharacterResult>> = RetrofitService.service.getCharacters()
}