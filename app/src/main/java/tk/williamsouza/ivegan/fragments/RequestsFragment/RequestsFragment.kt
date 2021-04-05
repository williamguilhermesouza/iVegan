package tk.williamsouza.ivegan.fragments.RequestsFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import tk.williamsouza.ivegan.R
import tk.williamsouza.ivegan.adapters.ViewPagerAdapter

class RequestsFragment : Fragment(R.layout.fragment_requests) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        setUpTabs()
    }

    private fun setUpTabs() {
        val supportFragmentManager = childFragmentManager

        val viewPager = requireView().findViewById<ViewPager>(R.id.tabsPager)
        val homeTabs = requireView().findViewById<TabLayout>(R.id.requestTabs)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(PreviousFragment(), "Anteriores")
        adapter.addFragment(OngoingFragment(), "Em Andamento")

        viewPager.adapter = adapter
        homeTabs.setupWithViewPager(viewPager)
    }
}