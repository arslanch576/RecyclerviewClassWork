package com.coderobust.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val image:ImageView=itemView.findViewById(R.id.image1)
    val title:TextView=itemView.findViewById(R.id.title1)
}