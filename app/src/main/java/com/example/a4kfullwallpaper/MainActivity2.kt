package com.example.a4kfullwallpaper

import android.app.WallpaperManager
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a4kfullwallpaper.databinding.ActivityMain2Binding
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val a = intent.getIntExtra("rasm", 0)
        binding.image.setImageResource(a)

        binding.back.setOnClickListener {
            finish()
        }
        binding.info.setOnClickListener {
            val b = Info()
            b.show(supportFragmentManager, b.toString())
        }
        binding.share.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND);
            intent.setType("image/jpeg");
            intent.putExtra(Intent.EXTRA_STREAM, intent.getIntExtra("rasm", 0));
            startActivity(Intent.createChooser(intent, "Share Image"))
        }
        binding.telQoyish.setOnClickListener {
            Toast.makeText(
                this,
                "Ekranga rasm joylanmoqda. Joylanish jarayonida ilovadan chiqmang va ilovadagi tugmalar ezilmaydi",
                Toast.LENGTH_LONG
            ).show()
            val bitmap: Bitmap =
                BitmapFactory.decodeResource(resources, intent.getIntExtra("rasm", 0))
            val wallpaperManager = WallpaperManager.getInstance(baseContext)
            wallpaperManager.setBitmap(bitmap)
            Snackbar.make(
                binding.root, "Rasm ekranga joylandi. Korishingiz mumkin",
                Snackbar.LENGTH_LONG
            )
                .setAction("Action", null).show()
        }

        binding.like.setOnClickListener {
            binding.like.setImageResource(R.drawable.favorite_qizil)

            binding.like.setOnClickListener {
                binding.like.setImageResource(R.drawable.ic_baseline_favorite_border_24)

                binding.like.setOnClickListener {
                    binding.like.setImageResource(R.drawable.favorite_qizil)

                    binding.like.setOnClickListener {
                        binding.like.setImageResource(R.drawable.ic_baseline_favorite_border_24)

                        binding.like.setOnClickListener {
                            binding.like.setImageResource(R.drawable.favorite_qizil)

                            binding.like.setOnClickListener {
                                binding.like.setImageResource(R.drawable.ic_baseline_favorite_border_24)

                                binding.like.setOnClickListener {
                                    binding.like.setImageResource(R.drawable.favorite_qizil)
                                }
                            }
                        }
                    }
                }
            }
        }




        binding.save.setOnClickListener {
            Toast.makeText(this, "Endi qilaman", Toast.LENGTH_SHORT).show()
        }
    }
}
