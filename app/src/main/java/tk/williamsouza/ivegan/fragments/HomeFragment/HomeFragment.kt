package tk.williamsouza.ivegan.fragments.HomeFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import tk.williamsouza.ivegan.R
import tk.williamsouza.ivegan.adapters.ViewPagerAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {
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
        val homeTabs = requireView().findViewById<TabLayout>(R.id.homeTabs)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(DeliverFragment(), "Entrega")
        adapter.addFragment(WithdrawFragment(), "Retirada")

        viewPager.adapter = adapter
        homeTabs.setupWithViewPager(viewPager)
    }
}