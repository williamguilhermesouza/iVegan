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
import tk.williamsouza.ivegan.models.Restaurant

class RestaurantsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Restaurant> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RestaurantsViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.restaurant_list_item, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is RestaurantsViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(restaurantList : List<Restaurant>) {
        items = restaurantList
    }

    class RestaurantsViewHolder constructor(
            itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val restaurantImage = itemView.findViewById<ImageView>(R.id.restaurantImage)
        val restaurantTitle = itemView.findViewById<TextView>(R.id.restaurantTitle)
        val restaurantDescription = itemView.findViewById<TextView>(R.id.restaurantDescription)
        val restaurantTime = itemView.findViewById<TextView>(R.id.restaurantTime)

        fun bind(restaurant : Restaurant) {
            restaurantTitle.setText(restaurant.title)
            restaurantDescription.setText("${restaurant.rating}-${restaurant.type}-${restaurant.distance}km")
            restaurantTime.setText("${restaurant.time}-${restaurant.time + 10} ${if (restaurant.deliverTax == 0.0) "Grátis" else ""}")

            val requestOptions = RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                    .load(restaurant.image)
                    .into(restaurantImage)
        }
    }
}