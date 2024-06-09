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

class FifthActivity : AppCompatActivity() {

    lateinit var btn_upi: Button
    lateinit var btn_netbanking: Button
    lateinit var btn_cod: Button
    lateinit var btn_card: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fifth)

        btn_upi = findViewById(R.id.btn_upi)
        btn_netbanking = findViewById(R.id.btn_netbanking)
        btn_cod = findViewById(R.id.btn_cod)
        btn_card = findViewById(R.id.btn_card)

        btn_upi.setOnClickListener {
            val properties = Properties()
            // properties.addAttribute("product", "apple")
            MoEAnalyticsHelper.trackEvent(application, "UPI Payment", properties)


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

            btn_netbanking.setOnClickListener {
                val properties = Properties()
                // properties.addAttribute("product", "apple")
                MoEAnalyticsHelper.trackEvent(application, "NetBanking", properties)


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


                btn_cod.setOnClickListener {
                    val properties = Properties()
                    // properties.addAttribute("product", "apple")
                    MoEAnalyticsHelper.trackEvent(application, "Cash", properties)


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

                    btn_card.setOnClickListener {
                        val properties = Properties()
                        // properties.addAttribute("product", "apple")
                        MoEAnalyticsHelper.trackEvent(application, "Card", properties)


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

        btn_upi.setOnClickListener{
            val properties = Properties()
            // properties.addAttribute("product", "apple")
            MoEAnalyticsHelper.trackEvent(application, "UPI Payment", properties)
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }

        btn_netbanking.setOnClickListener{
            val properties = Properties()
            // properties.addAttribute("product", "apple")
            MoEAnalyticsHelper.trackEvent(application, "NetBanking", properties)
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }

        btn_cod.setOnClickListener{
            val properties = Properties()
            // properties.addAttribute("product", "apple")
            MoEAnalyticsHelper.trackEvent(application, "Cash", properties)
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }

        btn_card.setOnClickListener{
            val properties = Properties()
            // properties.addAttribute("product", "apple")
            MoEAnalyticsHelper.trackEvent(application, "Card", properties)
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }

    }
}
