package com.example.test1_c14240086.recyclerviewgwe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

data class DcWayang(
    var foto : String,
    var nama : String,
    var karakter : String,
    var deskripsi : String
)

class AdapterRecView (private val listWayang: ArrayList<DcWayang>) :
        RecyclerView.Adapter<AdapterRecView.ListViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterRecView.ListViewHolder {
        val binding = ItemRecyclerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdapterRecView.ListViewHolder, position: Int) {
        val wayang = listWayang[position]
        holder.binding.namaWayang.text = wayang.nama
        holder.binding.karakterWayang.text = wayang.karakter
        holder.binding.deskripsiWayang.text = wayang.deskripsi
    }

    override fun getItemCount(): Int {
        return listWayang.size
    }

}

class ListViewHolder(val binding : ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root)

