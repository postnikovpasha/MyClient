package com.example.myvkclient.presentation.screen.profile.feed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myvkclient.R
import com.example.myvkclient.presentation.common.loadImage
import kotlinx.android.synthetic.main.item_post_message.view.*
import java.lang.IllegalArgumentException
import kotlin.coroutines.coroutineContext

class FeedAdapter (private val onLoadPosts: () -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        const val POST_MESSAGE = 1
    }

    private val items: MutableList<BaseMessage> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = when (viewType) {
        POST_MESSAGE -> PostMessageHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_post_message,
                parent,
                false
            )
        )

        else -> throw IllegalArgumentException("viewType $viewType not found")
    }

    override fun getItemViewType(position: Int): Int = when (items[position]) {
        is PostMessage -> POST_MESSAGE
        else -> throw IllegalArgumentException("${items[position].javaClass} not found")
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PostMessageHolder -> holder.bind(items[position] as PostMessage)
        }
    }

    fun setItems(items: List<BaseMessage>) {
        this.items.clear()
        this.items.addAll(items)

        notifyDataSetChanged()
    }

    inner class PostMessageHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(data: PostMessage) {
            itemView.itemPostMessage.text = data.message

            if (data.image.isNotEmpty()) {
                itemView.itemPostImage.loadImage(data.image)
                //itemView.itemPostImage.loadImage("https://www.wallpaperup.com/uploads/wallpapers/2016/11/07/1034374/05c783cafe5f6e753dc1addc18c1c8ee.jpg")
            }
        }
    }

}