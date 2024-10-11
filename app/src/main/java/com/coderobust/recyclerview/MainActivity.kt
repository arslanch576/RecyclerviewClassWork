package com.coderobust.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        val adapter = ArticlesAdapter(getArticles())
        recyclerview.adapter=adapter
        val manager=LinearLayoutManager(this)
        recyclerview.layoutManager= manager
    }

    fun getArticles(): List<Article> {
        val articles = ArrayList<Article>()

        articles.add(Article("Are These The Best Travel Clothes? My Review of Unbound Merino", "September 24, 2024", R.drawable.image1, "I’ve never been one of those travelers who goes crazy for gear. I like to pack light and keep things simple."))
        articles.add(Article("Dummy Title 2", "Date 2, 2024", R.drawable.image2, "This is a dummy article content for article 2. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 3", "Date 3, 2024", R.drawable.image3, "This is a dummy article content for article 3. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 4", "Date 4, 2024", R.drawable.image4, "This is a dummy article content for article 4. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 5", "Date 5, 2024", R.drawable.image1, "This is a dummy article content for article 5. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 6", "Date 6, 2024", R.drawable.image2, "This is a dummy article content for article 6. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 7", "Date 7, 2024", R.drawable.image3, "This is a dummy article content for article 7. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 8", "Date 8, 2024", R.drawable.image4, "This is a dummy article content for article 8. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 9", "Date 9, 2024", R.drawable.image1, "This is a dummy article content for article 9. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 10", "Date 10, 2024", R.drawable.image2, "This is a dummy article content for article 10. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 11", "Date 11, 2024", R.drawable.image3, "This is a dummy article content for article 11. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 12", "Date 12, 2024", R.drawable.image4, "This is a dummy article content for article 12. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 13", "Date 13, 2024", R.drawable.image1, "This is a dummy article content for article 13. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 14", "Date 14, 2024", R.drawable.image2, "This is a dummy article content for article 14. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 15", "Date 15, 2024", R.drawable.image3, "This is a dummy article content for article 15. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 16", "Date 16, 2024", R.drawable.image4, "This is a dummy article content for article 16. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 17", "Date 17, 2024", R.drawable.image1, "This is a dummy article content for article 17. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 18", "Date 18, 2024", R.drawable.image2, "This is a dummy article content for article 18. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 19", "Date 19, 2024", R.drawable.image3, "This is a dummy article content for article 19. It has some placeholder text for testing purposes."))
        articles.add(Article("Dummy Title 20", "Date 20, 2024", R.drawable.image4, "This is a dummy article content for article 20. It has some placeholder text for testing purposes."))

        return articles
    }

}