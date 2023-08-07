package com.seoulWomenTech.ss505.MyPage.Adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.seoulWomenTech.ss505.MyPage.placeholder.PlaceholderContent.PlaceholderItem
import com.seoulWomenTech.ss505.databinding.FragmentMyCommentBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter2(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter2.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentMyCommentBinding.inflate(
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

    inner class ViewHolder(binding: FragmentMyCommentBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val contentView: TextView = binding.myCommentContent

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}