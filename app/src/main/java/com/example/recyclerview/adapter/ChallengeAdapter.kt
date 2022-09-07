package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.data.MyChallenge

class ChallengeAdapter(private val listChallenge: ArrayList<MyChallenge>): RecyclerView.Adapter<ChallengeAdapter.ViewHolder>() {
    // class holder
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val gambar = itemView.findViewById<ImageView>(R.id.iv_konten_rumah_adat)
        val namaProvinsi = itemView.findViewById<TextView>(R.id.tv_konten_provinsi)
        val namaRumahAdat = itemView.findViewById<TextView>(R.id.tv_konten_rumah_adat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.challenge_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.gambar.setImageResource(listChallenge[position].image)
        holder.namaProvinsi.text = listChallenge[position].namaProv
        holder.namaRumahAdat.text = listChallenge[position].namaRum
    }

    override fun getItemCount(): Int {
        return listChallenge.size
    }
}