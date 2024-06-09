package com.example.check2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.moengage.core.Properties
import com.moengage.core.analytics.MoEAnalyticsHelper

class FourthActivity : AppCompatActivity() {

    lateinit var button_make_payment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)

        button_make_payment = findViewById(R.id.button_make_payment)

        button_make_payment.setOnClickListener {
            val properties = Properties()
            // properties.addAttribute("product", "apple")
            MoEAnalyticsHelper.trackEvent(application, "Payment Gateway", properties)



            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
            button_make_payment.setOnClickListener{
                val properties = Properties()
                MoEAnalyticsHelper.trackEvent(application, "Payment Gateway", properties)
                val intent = Intent(this, FifthActivity::class.java)
                startActivity(intent)
            }


    }
}
//class FourthActivity : AppCompatActivity() {
//
//    lateinit var button_make_payment: Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_fourth)
//
//        button_make_payment = findViewById(R.id.button_make_payment)
//
//        button_make_payment.setOnClickListener {
//            val properties = Properties()
//            // properties.addAttribute("product", "apple")
//            MoEAnalyticsHelper.trackEvent(application, "Payment Gateway", properties)
//
//            val intent = Intent(this, FifthActivity::class.java)
//            startActivity(intent)
//        }
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//}