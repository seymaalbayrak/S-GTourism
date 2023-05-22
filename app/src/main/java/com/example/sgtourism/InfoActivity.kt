package com.example.sgtourism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InfoActivity : AppCompatActivity() {
    private lateinit var text : TextView
    private lateinit var info : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        text = findViewById(R.id.textView5)

        if (intent.hasExtra("infoname")) {
            info = intent.getStringExtra("infoname")!!
        }

        if(info.equals("contact")) {
            text.setText("info@sg.tourism.com , + 90 539 971 35 20")
        }
        if (info.equals("about")) {
            text.setText("About us\n" +
                    "Established in 2020 with the aim of providing the best service and suggestion to its guests, S&G Tourism, as the innovative representative of the tourism sector, gives important suggestions for many cities and historical sites in the country. The brand has grown rapidly since its establishment and stands out with its visionary structure in the travel sector and breaking new grounds. One of the main goals is to guide indecisive customers to their dream vacations and listen to their suggestions."
            )
        }
    }
}