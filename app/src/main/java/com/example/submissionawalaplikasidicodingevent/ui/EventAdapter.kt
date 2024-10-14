package com.example.submissionawalaplikasidicodingevent.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.submissionawalaplikasidicodingevent.data.response.ListEventsItem
import com.example.submissionawalaplikasidicodingevent.databinding.ItemEventBinding

class EventAdapter : ListAdapter<ListEventsItem, EventAdapter.MyViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemEventBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val event = getItem(position)
        holder.bind(event)
    }

    class MyViewHolder(val binding: ItemEventBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                val event = getItem(adapterPosition)
                onItemClick(event)
            }
        }
        fun bind(event: ListEventsItem) {
            Glide.with(binding.ivBanner.context)
                .load(event.mediaCover)
                .into(binding.ivBanner)

            binding.tvEvent.text = event.name
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ListEventsItem>() {
            override fun areItemsTheSame(oldItem: ListEventsItem, newItem: ListEventsItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ListEventsItem, newItem: ListEventsItem): Boolean {
                return oldItem == newItem
            }
        }
    }
}