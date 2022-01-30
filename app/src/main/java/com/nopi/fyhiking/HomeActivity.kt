package com.nopi.fyhiking

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nopi.fyhiking.activities.MainActivity
import com.nopi.fyhiking.activities.PeralatanActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        infoGunung.setOnClickListener {
            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
        }

        Peralatan.setOnClickListener {
            val intent = Intent(this@HomeActivity, PeralatanActivity::class.java)
            startActivity(intent)
        }
    }


}