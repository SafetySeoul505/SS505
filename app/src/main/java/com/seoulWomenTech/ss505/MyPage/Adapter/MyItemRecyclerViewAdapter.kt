package com.seoulWomenTech.ss505.MyPage.Adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

import com.seoulWomenTech.ss505.MyPage.placeholder.PlaceholderContent.PlaceholderItem
import com.seoulWomenTech.ss505.databinding.FragmentMyPostBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentMyPostBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.contentView.text = item.content
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentMyPostBinding) : RecyclerView.ViewHolder(binding.root) {
        val contentView: TextView = binding.myPostContent

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}