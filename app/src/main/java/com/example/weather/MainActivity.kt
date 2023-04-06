@file:Suppress("DEPRECATION")

package com.example.weather
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        var editor = sharedPreference.edit()

        sscity1.setOnClickListener{
            editor.putString("CITY", sscity1.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity2.setOnClickListener{
            editor.putString("CITY", sscity2.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity3.setOnClickListener{
            editor.putString("CITY", sscity3.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity4.setOnClickListener{
            editor.putString("CITY", sscity4.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity5.setOnClickListener{
            editor.putString("CITY", sscity5.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity6.setOnClickListener{
            editor.putString("CITY", sscity6.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity7.setOnClickListener{
            editor.putString("CITY", sscity7.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity8.setOnClickListener{
            editor.putString("CITY", sscity8.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity9.setOnClickListener{
            editor.putString("CITY", sscity9.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }

        sscity10.setOnClickListener{
            editor.putString("CITY", sscity10.text.toString())
            editor.apply()
            startActivity(Intent(this, WeatherActivity::class.java))
        }
    }
}