package com.muhammadsapplication.app.modules.levels.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.databinding.RowSublevelforlBinding
import com.muhammadsapplication.app.modules.levels.`data`.model.SublevelforlRowModel
import kotlin.Int
import kotlin.collections.List

class SublevelForLAdapter(
  var list: List<SublevelforlRowModel>
) : RecyclerView.Adapter<SublevelForLAdapter.RowSublevelforlVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSublevelforlVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sublevelforl,parent,false)
    return RowSublevelforlVH(view)
  }

  override fun onBindViewHolder(holder: RowSublevelforlVH, position: Int) {
    val sublevelforlRowModel = SublevelforlRowModel()
    // TODO uncomment following line after integration with data source
    // val sublevelforlRowModel = list[position]
    holder.binding.sublevelforlRowModel = sublevelforlRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SublevelforlRowModel>) {
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
      item: SublevelforlRowModel
    ) {
    }
  }

  inner class RowSublevelforlVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSublevelforlBinding = RowSublevelforlBinding.bind(itemView)
  }
}
