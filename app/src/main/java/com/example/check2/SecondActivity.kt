package com.example.check2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.moengage.core.Properties
import com.moengage.core.analytics.MoEAnalyticsHelper

class SecondActivity : AppCompatActivity() {

    lateinit var add_to_cart_button1: Button
    lateinit var add_to_cart_button2: Button
    lateinit var add_to_cart_button3: Button
    lateinit var view_cart_button: Button

//    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)



        add_to_cart_button1 = findViewById(R.id.add_to_cart_button1)
        add_to_cart_button2 = findViewById(R.id.add_to_cart_button2)
        add_to_cart_button3 = findViewById(R.id.add_to_cart_button3)
        view_cart_button = findViewById(R.id.view_cart_button)

        add_to_cart_button1.setOnClickListener {
            val properties = Properties()
            properties.addAttribute("product", "Fogg Perfume")
            properties.addAttribute("quantity", 1)
            properties.addAttribute("price", 500)
            properties.addAttribute("productId", 800)
            MoEAnalyticsHelper.trackEvent(application, "Add to Cart", properties)

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
        }

        add_to_cart_button2.setOnClickListener {
            val properties = Properties()
            properties.addAttribute("product", "Oreo")
            properties.addAttribute("quantity", 1)
            properties.addAttribute("price", 200)
            properties.addAttribute("productId", 801)
            MoEAnalyticsHelper.trackEvent(application, "Add to Cart", properties)

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
        }


        add_to_cart_button3.setOnClickListener {
            val properties = Properties()
            properties.addAttribute("product", "Dairy Milk")
            properties.addAttribute("quantity", 1)
            properties.addAttribute("productId", 802)
            properties.addAttribute("price", 100)
            MoEAnalyticsHelper.trackEvent(application, "Add to Cart", properties)

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
        }

        view_cart_button.setOnClickListener {
            val properties = Properties()
            MoEAnalyticsHelper.trackEvent(application, "view cart", properties)

            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

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
        }

//        view_cart_button = findViewById(R.id.view_cart_button)
//        view_cart_button.setOnClickListener {
//            val intent = Intent(this, ThirdActivity::class.java)
//            startActivity(intent)
//        }
    }
}

