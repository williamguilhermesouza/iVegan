package tk.williamsouza.ivegan.fragments.HomeFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tk.williamsouza.ivegan.R
import tk.williamsouza.ivegan.RestaurantsDataSource
import tk.williamsouza.ivegan.TopSpacingItemDecoration
import tk.williamsouza.ivegan.adapters.RestaurantsAdapter

class DeliverFragment : Fragment() {
    private lateinit var restaurantsAdapter : RestaurantsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = RestaurantsDataSource.createDataSet()
        restaurantsAdapter.submitList(data)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deliver, container, false)
    }

    private fun initRecyclerView() {

        val restaurantsView = view?.findViewById<RecyclerView>(R.id.restaurantsView)
        restaurantsView!!.layoutManager = LinearLayoutManager(this.context)
        val topSpacingDecoration = TopSpacingItemDecoration(30)
        restaurantsView.addItemDecoration(topSpacingDecoration)
        restaurantsAdapter = RestaurantsAdapter()
        restaurantsView?.adapter = restaurantsAdapter
    }

  
}