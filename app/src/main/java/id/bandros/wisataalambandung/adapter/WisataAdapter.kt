package id.bandros.wisataalambandung.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.bandros.wisataalambandung.R
import id.bandros.wisataalambandung.model.WisataFotoModel
import id.bandros.wisataalambandung.model.WisataModel
import kotlinx.android.synthetic.main.item_wisata.view.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class WisataAdapter(val context: Context, private val list: ArrayList<WisataModel>, val listener: Listener) : RecyclerView.Adapter<WisataAdapter.ViewHolder>() {

    interface Listener {
        fun onItemClick(pos: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.count()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(this.context,list[position])
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun bind(context: Context, data: WisataModel) {
            itemView.foto.background = context.resources.getDrawable(data.foto.get(0).foto)
            itemView.nama.text = data.nama
            itemView.views.onClick { listener.onItemClick(position) }
        }
    }
}