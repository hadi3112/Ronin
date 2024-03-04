package com.muhammadsapplication.app.modules.levelsplay.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.databinding.RowSublevelforl1Binding
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.Sublevelforl1RowModel
import kotlin.Int
import kotlin.collections.List

class SublevelForLAdapter(
  var list: List<Sublevelforl1RowModel>
) : RecyclerView.Adapter<SublevelForLAdapter.RowSublevelforl1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSublevelforl1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sublevelforl1,parent,false)
    return RowSublevelforl1VH(view)
  }

  override fun onBindViewHolder(holder: RowSublevelforl1VH, position: Int) {
    val sublevelforl1RowModel = Sublevelforl1RowModel()
    // TODO uncomment following line after integration with data source
    // val sublevelforl1RowModel = list[position]
    holder.binding.sublevelforl1RowModel = sublevelforl1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Sublevelforl1RowModel>) {
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
      item: Sublevelforl1RowModel
    ) {
    }
  }

  inner class RowSublevelforl1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSublevelforl1Binding = RowSublevelforl1Binding.bind(itemView)
  }
}
