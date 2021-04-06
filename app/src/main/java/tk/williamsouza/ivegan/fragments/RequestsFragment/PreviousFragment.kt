package tk.williamsouza.ivegan.fragments.RequestsFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tk.williamsouza.ivegan.R
import tk.williamsouza.ivegan.RequestsDataSource
import tk.williamsouza.ivegan.TopSpacingItemDecoration
import tk.williamsouza.ivegan.adapters.RequestsAdapter

class PreviousFragment : Fragment() {
    private lateinit var requestsAdapter : RequestsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_previous, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = RequestsDataSource.createDataSet()
        requestsAdapter.submitList(data)
    }

    private fun initRecyclerView() {

        val requestsView = view?.findViewById<RecyclerView>(R.id.requestsRecyclerView)
        requestsView!!.layoutManager = LinearLayoutManager(this.context)
        val topSpacingDecoration = TopSpacingItemDecoration(30)
        requestsView.addItemDecoration(topSpacingDecoration)
        requestsAdapter = RequestsAdapter()
        requestsView?.adapter = requestsAdapter
    }

}