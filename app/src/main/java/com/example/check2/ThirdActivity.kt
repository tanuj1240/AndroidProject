package com.example.check2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.moengage.core.Properties
import com.moengage.core.analytics.MoEAnalyticsHelper

class ThirdActivity : AppCompatActivity() {

    lateinit var buy_now_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        buy_now_button = findViewById(R.id.buy_now_button)

        buy_now_button.setOnClickListener {
            val properties = Properties()
            properties.addAttribute("product", "Fogg Perfume")
            properties.addAttribute("quantity", 1)
            properties.addAttribute("price", 500)
            properties.addAttribute("productId", 800)
            MoEAnalyticsHelper.trackEvent(application, "Buy_Now_Click", properties)


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
                )
                insets
            }

            buy_now_button.setOnClickListener {
                val intent = Intent(this, FourthActivity::class.java)
                startActivity(intent)
            }
        }
    }
}