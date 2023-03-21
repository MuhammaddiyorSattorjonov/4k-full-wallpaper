package com.example.a4kfullwallpaper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a4kfullwallpaper.databinding.FragmentInfoBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Info : BottomSheetDialogFragment() {
    lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(layoutInflater)

        return binding.root
    }

}