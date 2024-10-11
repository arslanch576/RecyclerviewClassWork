package com.coderobust.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ArticleDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_details)

        val title:String?=intent.getStringExtra("title")
        val date:String?=intent.getStringExtra("date")
        val details:String?=intent.getStringExtra("details")
        val image:Int=intent.getIntExtra("image",R.drawable.image1)

        findViewById<TextView>(R.id.title5).text=title
        findViewById<TextView>(R.id.date).text=date
        findViewById<TextView>(R.id.details).text=details
        findViewById<ImageView>(R.id.image5).setImageResource(image)

    }
}