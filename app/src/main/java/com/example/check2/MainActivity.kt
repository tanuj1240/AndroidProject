package com.example.check2

//import android.annotation.SuppressLint
//import android.content.Intent
//import android.os.Bundle
//import android.util.Log
//import android.widget.Button
//import android.widget.EditText
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var usernameInput: EditText
//    lateinit var passwordInput: EditText
//    lateinit var phoneNumberInput: EditText
//    lateinit var emailInput: EditText
//    lateinit var loginBtn: Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//
//        usernameInput = findViewById(R.id.username)
//        phoneNumberInput = findViewById(R.id.phoneNumber)
//        emailInput = findViewById(R.id.email)
//        passwordInput = findViewById(R.id.password)
////        loginBtn=findViewById(R.id.btnSecondActivity)
//
//        loginBtn.setOnClickListener {
//            val username = usernameInput.text.toString()
//            val phoneNumber = phoneNumberInput.text.toString()
//            val email = emailInput.text.toString()
//            val password = passwordInput.text.toString()
//
//            val btnSecondActivity = findViewById<Button>(R.id.btnSecondActivity)
//            btnSecondActivity.setOnClickListener {
//                val intent = Intent(this, SecondActivity::class.java)
//                startActivity(intent)
//            }
//
//        }
//    }
//}

//package com.example.check2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.moengage.core.Properties
import com.moengage.core.analytics.MoEAnalyticsHelper

class MainActivity : AppCompatActivity() {
    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var phoneNumberInput: EditText
    lateinit var emailInput: EditText
   // lateinit var loginBtn: Button
    lateinit var btnSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username)
        phoneNumberInput = findViewById(R.id.phoneNumber)
        emailInput = findViewById(R.id.email)
        passwordInput = findViewById(R.id.password)
        //loginBtn = findViewById(R.id.loginBtn)
        btnSecondActivity = findViewById(R.id.btnSecondActivity)

        btnSecondActivity.setOnClickListener {
            val username = usernameInput.text.toString()
            val phoneNumber = phoneNumberInput.text.toString()
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            Log.i(
                "test credentials",
                "username:$username and Password:$password and email:$email and phoneNumber:$phoneNumber"
            )

            // Log/Use entered data here. Like validation or sending to a server.
            MoEAnalyticsHelper.setUniqueId(application, email)
            MoEAnalyticsHelper.setMobileNumber(application, phoneNumber)
            MoEAnalyticsHelper.setEmailId(application, email)
            MoEAnalyticsHelper.setFirstName(application, username)

            val properties = Properties()
            properties.addAttribute("email", email)
            MoEAnalyticsHelper.trackEvent(application, "Login", properties)

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }

            btnSecondActivity.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}