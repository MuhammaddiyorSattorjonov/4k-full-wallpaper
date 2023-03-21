package com.example.a4kfullwallpaper

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.view.GravityCompat
import com.example.a4kfullwallpaper.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.N)
    lateinit var viewPagerAdapter:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)



        val home = Home()
        val random = Random()
        val liked = Liked()
        val popular = Popular()
        val support = supportFragmentManager




        binding.myBottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home_shu->{
                    support.beginTransaction().replace(R.id.viewPager,home).commit()
                    binding.tvName.text = "Home"
                }
                R.id.random->{
                    support.beginTransaction().replace(R.id.viewPager,random).commit()
                    binding.tvName.text = "Random"

                }
                R.id.liked->{
                    support.beginTransaction().replace(R.id.viewPager,liked).commit()
                    binding.tvName.text = "Liked"
                }
                R.id.popular->{
                    support.beginTransaction().replace(R.id.viewPager,popular).commit()
                    binding.tvName.text = "Popular"
                }
            }
            true
        }
        binding.menuBar.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home1->{
                    support.beginTransaction().replace(R.id.viewPager,home).commit()
                    binding.myBottomNav.menu.findItem(R.id.home_shu).isChecked = true
                    binding.tvName.text = "Home"
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
                R.id.random1->{
                    support.beginTransaction().replace(R.id.viewPager,random).commit()
                    binding.myBottomNav.menu.findItem(R.id.random).isChecked = true
                    binding.tvName.text = "Random"
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
                R.id.liked1->{
                    support.beginTransaction().replace(R.id.viewPager,liked).commit()
                    binding.myBottomNav.menu.findItem(R.id.liked).isChecked = true
                    binding.tvName.text = "Liked"
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
                R.id.popular1->{
                    support.beginTransaction().replace(R.id.viewPager,popular).commit()
                    binding.myBottomNav.menu.findItem(R.id.popular).isChecked = true
                    binding.tvName.text = "Popular"
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
                R.id.about1->{
                    val dialog = AlertDialog.Builder(this)
                    dialog.setTitle("4k full wallpaper haqida")
                    dialog.setIcon(R.drawable.img)
                    dialog.setMessage("4k full wallpaper ilovasi sizga fotosuratlarni taxrirlash,mobil qurilma ekraniga qo'yish,telefon hotirasiga saqlash imkoniyatlarini beradi.")
                    dialog.show()
                }
                R.id.history1->{
                    val dialog = AlertDialog.Builder(this)
                    dialog.setMessage(""+day+"."+month+"."+year)
                    dialog.show()
                }
            }
            true
        }
    }
}