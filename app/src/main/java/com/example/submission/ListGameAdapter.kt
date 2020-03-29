package com.example.submission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListGameAdapter(val listGame: ArrayList<Game>) : RecyclerView.Adapter<ListGameAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_view, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val game = listGame[position]
        Glide.with(holder.itemView.context)
            .load(game.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = game.name
        holder.tvDetail.text = game.detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, detail::class.java)
            moveDetail.putExtra(detail.EXTRA_NAME, game.name)
            moveDetail.putExtra(detail.EXTRA_PHOTO, game.photo)
            moveDetail.putExtra(detail.EXTRA_DETAIL, game.detail)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listGame.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.title_item)
        var tvDetail: TextView = itemView.findViewById(R.id.detail_item)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item)
    }
}