package com.kim.pizzaorderapp_kim.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.pizzaorderapp_kim.fragments.ChickenStoreListFragment
import com.kim.pizzaorderapp_kim.fragments.PIzzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            0 -> "피자가게"
            else -> "치킨가게"
        }
    }
    override fun getCount(): Int {
       return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PIzzaStoreListFragment()
            else -> ChickenStoreListFragment()


        }
    }
}