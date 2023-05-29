package co.edu.eam.retro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.edu.eam.retrofit.RetrofitClient
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val api = RetrofitClient.jsonPlaceholderApi
        GlobalScope.launch {
            try {
                val posts = api.getPosts()
                for (post in posts) {
                    println("Title: ${post.title}")
                    println("Body: ${post.body}")
                    println("-----")
                }
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }
    }
}

