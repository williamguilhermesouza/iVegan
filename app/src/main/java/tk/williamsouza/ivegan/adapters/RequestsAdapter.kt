package tk.williamsouza.ivegan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import tk.williamsouza.ivegan.R
import tk.williamsouza.ivegan.models.Request

class RequestsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Request> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RequestsViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.request_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is RequestsViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    fun submitList(requestsList : List<Request>) {
        items = requestsList
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class RequestsViewHolder constructor(
            itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val titleView = itemView.findViewById<TextView>(R.id.titleTextView)
        val imageView = itemView.findViewById<ImageView>(R.id.requestImageView)
        val idView = itemView.findViewById<TextView>(R.id.requestId)
        val requestItemsView = itemView.findViewById<TextView>(R.id.requestItems)

        fun bind(request: Request) {
            titleView.setText(request.date)
            idView.setText(request.id.toString())
            var items = ""
            for (item in request.items) {
                items += item + "\n"
            }
            requestItemsView.setText(items)

            val requestOptions = RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                    .applyDefaultRequestOptions(requestOptions)
                    .load(request.restaurant.image)
                    .into(imageView)
        }
    }
}