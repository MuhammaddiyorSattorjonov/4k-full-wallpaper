package com.example.a4kfullwallpaper

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.a4kfullwallpaper.databinding.FragmentPopularBinding

class Popular : Fragment() {
    lateinit var binding: FragmentPopularBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPopularBinding.inflate(layoutInflater)
        val animation = AnimationUtils.loadAnimation(context,R.anim.animation3)
        binding.root.startAnimation(animation)


        binding.rasm1.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm1)
            startActivity(intent)
        }
        binding.rasm2.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm2)
            startActivity(intent)
        }
        binding.rasm3.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm3)
            startActivity(intent)
        }
        binding.rasm4.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm5)
            startActivity(intent)
        }
        binding.rasm5.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm6)
            startActivity(intent)
        }
        binding.rasm6.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm7)
            startActivity(intent)
        }
        binding.rasm7.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm11)
            startActivity(intent)
        }
        binding.rasm8.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm9)
            startActivity(intent)
        }
        binding.rasm9.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.rasm10)
            startActivity(intent)
        }
        binding.photo1.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.photo1)
            startActivity(intent)
        }
        binding.photo2.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.photo2)
            startActivity(intent)
        }
        binding.photo3.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.photo3)
            startActivity(intent)
        }
        binding.photo4.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.photo4)
            startActivity(intent)
        }
        binding.photo5.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.photo5)
            startActivity(intent)
        }
        binding.photo6.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("rasm",R.drawable.photo6)
            startActivity(intent)
        }
        return binding.root
    }
}