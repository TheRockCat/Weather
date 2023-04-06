package com.example.weather
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_page2.*

/**
 * A simple [Fragment] subclass.
 */
class Page2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page2, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPreference =  requireContext().getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        var editor = sharedPreference.edit()

        city1.setOnClickListener{
            editor.putString("CITY", sscity1.text.toString())
            editor.apply()
        }

        city2.setOnClickListener{
            editor.putString("CITY", sscity2.text.toString())
            editor.apply()
        }

        city3.setOnClickListener{
            editor.putString("CITY", sscity3.text.toString())
            editor.apply()
        }

        city4.setOnClickListener{
            editor.putString("CITY", sscity4.text.toString())
            editor.apply()
        }

        city5.setOnClickListener{
            editor.putString("CITY", sscity5.text.toString())
            editor.apply()
        }

        city6.setOnClickListener{
            editor.putString("CITY", sscity6.text.toString())
            editor.apply()
        }

        city7.setOnClickListener{
            editor.putString("CITY", sscity7.text.toString())
            editor.apply()
        }

        city8.setOnClickListener{
            editor.putString("CITY", sscity8.text.toString())
            editor.apply()
        }

        city9.setOnClickListener{
            editor.putString("CITY", sscity9.text.toString())
            editor.apply()
        }

        city10.setOnClickListener{
            editor.putString("CITY", sscity10.text.toString())
            editor.apply()
        }
    }
}