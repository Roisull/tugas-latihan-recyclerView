package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.data.MyContact

class ContactAdapter(private val listContact: ArrayList<MyContact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    // for diffutil
    private val diffCallBack = object : DiffUtil.ItemCallback<MyContact>(){
        override fun areItemsTheSame(oldItem: MyContact, newItem: MyContact): Boolean {
            return oldItem.nama == newItem.nama
        }

        override fun areContentsTheSame(oldItem: MyContact, newItem: MyContact): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

    private val differ = AsyncListDiffer(this, diffCallBack)

    fun submitData(value: ArrayList<MyContact>) = differ.submitList(value)

    // class Holder
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val nama = itemView.findViewById<TextView>(R.id.tv_konten_nama)
        val noHp = itemView.findViewById<TextView>(R.id.tv_konten_noHp)
    }

    // implementation member untuk membuat holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_contact_item, parent, false)

        return ViewHolder(view)
    }

    // melakukan penentuan data yang akan ditampilkan pada setiap item atau baris
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data = differ.currentList[position]

        holder.nama.text = listContact[position].nama
        holder.noHp.text = listContact[position].noHp
    }

    // memberitahu banyaknya data yang ditampilkan
    override fun getItemCount(): Int = differ.currentList.size
}