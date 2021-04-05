package tk.williamsouza.ivegan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import tk.williamsouza.ivegan.fragments.HomeFragment.HomeFragment
import tk.williamsouza.ivegan.fragments.ProfileFragment
import tk.williamsouza.ivegan.fragments.RequestsFragment.RequestsFragment
import tk.williamsouza.ivegan.fragments.SearchFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomMenu = findViewById<BottomNavigationView>(R.id.bottomMenu)

        val homeFragment = HomeFragment()
        val searchFragment = SearchFragment()
        val requestsFragment = RequestsFragment()
        val profileFragment = ProfileFragment()

        setCurrentFragment(homeFragment)

        bottomMenu.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.homeButton -> setCurrentFragment(homeFragment)
                R.id.searchButton -> setCurrentFragment(searchFragment)
                R.id.requestsButton -> setCurrentFragment(requestsFragment)
                R.id.profileButton -> setCurrentFragment(profileFragment)
            }

            true
        }



    }


    fun setCurrentFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentView, fragment)
            commit()
        }

    }
}