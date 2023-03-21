package com.example.a4kfullwallpaper

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter(var list:List<String>,fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager){
    val fragmentList = ArrayList<Fragment>()
    val fragmenttitleList = ArrayList<String>()
    override fun getCount(): Int {
        return   list.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return list[position]
    }
    fun addFragment(fragment:Fragment, title: String){
        fragmentList.add(fragment)
        fragmenttitleList.add(title)
    }
}