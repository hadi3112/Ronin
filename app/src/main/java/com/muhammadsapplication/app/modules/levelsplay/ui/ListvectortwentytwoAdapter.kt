package com.muhammadsapplication.app.modules.levelsplay.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.databinding.RowListvectortwentytwoBinding
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.ListvectortwentytwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListvectortwentytwoAdapter(
  var list: List<ListvectortwentytwoRowModel>
) : RecyclerView.Adapter<ListvectortwentytwoAdapter.RowListvectortwentytwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListvectortwentytwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listvectortwentytwo,parent,false)
    return RowListvectortwentytwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListvectortwentytwoVH, position: Int) {
    val listvectortwentytwoRowModel = ListvectortwentytwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listvectortwentytwoRowModel = list[position]
    holder.binding.listvectortwentytwoRowModel = listvectortwentytwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListvectortwentytwoRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListvectortwentytwoRowModel
    ) {
    }
  }

  inner class RowListvectortwentytwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListvectortwentytwoBinding = RowListvectortwentytwoBinding.bind(itemView)
  }
}
