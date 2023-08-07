package com.seoulWomenTech.ss505.Main.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.seoulWomenTech.ss505.Main.Fragment.Challenge.ChallengeFragment
import com.seoulWomenTech.ss505.Main.Fragment.MainFragment
import com.seoulWomenTech.ss505.Main.Fragment.Challenge.MyChallengeFragment
import com.seoulWomenTech.ss505.Post.PostFragment


class ViewPagerAdapter(fragment: MainFragment) : FragmentStateAdapter(fragment){
    var fragments = arrayOf(ChallengeFragment(), PostFragment(), MyChallengeFragment())

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    override fun getItemCount(): Int {
        return fragments.size
    }
}