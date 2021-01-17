package com.sitiw.githubuserapi.api

import com.sitiw.githubuserapi.data.model.DetailUserResponse
import com.sitiw.githubuserapi.data.model.User
import com.sitiw.githubuserapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 1708c2d6d015d0d8ab54f5bd9edc9d7f98b06e4b")
    fun getSearchUsers(
        @Query("q")query : String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 1708c2d6d015d0d8ab54f5bd9edc9d7f98b06e4b")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 1708c2d6d015d0d8ab54f5bd9edc9d7f98b06e4b")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 1708c2d6d015d0d8ab54f5bd9edc9d7f98b06e4b")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}