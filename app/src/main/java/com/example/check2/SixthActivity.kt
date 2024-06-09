package com.example.check2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.moengage.core.MoECoreHelper
import com.moengage.core.Properties
import com.moengage.core.analytics.MoEAnalyticsHelper
import com.moengage.inbox.ui.view.InboxActivity

class SixthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixth)

        lateinit var cardsbutton: Button
        lateinit var logoutButton: Button

        val inboxbutton: Button = findViewById(R.id.cardsbutton)
        inboxbutton.setOnClickListener {
            val intent = Intent(this, InboxActivity::class.java)
            startActivity(intent)
            //Log.i("SEt Log" ,"Button CLicked")
        }

        logoutButton = findViewById(R.id.logoutButton)

        logoutButton.setOnClickListener {
            val properties = Properties()
           // properties.addAttribute("product", "apple")
         //   MoEAnalyticsHelper.trackEvent(application, "Product_Purchased", properties)
            MoECoreHelper.logoutUser(this)


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
    }
}
