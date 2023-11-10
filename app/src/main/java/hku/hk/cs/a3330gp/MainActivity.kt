package hku.hk.cs.a3330gp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val health =  findViewById<Button>(R.id.health)
        val profile =  findViewById<Button>(R.id.profile)
        val ar = findViewById<Button>(R.id.ar)
        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)

        topAppBar.setNavigationOnClickListener {
            // Handle navigation icon press
            onBackPressedDispatcher.onBackPressed()

        }

        health.setOnClickListener{
            startActivity(Intent(this, HealthStatistics::class.java))
        }

        profile.setOnClickListener{
            startActivity(Intent(this, Profile::class.java))
        }
    }
}