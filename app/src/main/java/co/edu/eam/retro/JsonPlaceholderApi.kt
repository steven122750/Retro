package co.edu.eam.retrofit

import retrofit2.http.GET
import retrofit2.http.Headers

interface JsonPlaceholderApi {
    @Headers("Accept-Language: es")
    @GET("posts")
    suspend fun getPosts(): List<Post>
}