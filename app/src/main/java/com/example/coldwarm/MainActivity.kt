package com.example.coldwarm
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_cold: Button
        val btn_warm: Button
        val relativeLayout: RelativeLayout

        btn_cold = findViewById<Button>(R.id.btVar1)
        btn_warm = findViewById<Button>(R.id.btVar2)
        relativeLayout = findViewById<RelativeLayout>(R.id.rlVar1)

        btn_cold.setOnClickListener { relativeLayout.setBackgroundResource(R.color.cool) }
        btn_warm.setOnClickListener { relativeLayout.setBackgroundResource(R.color.warm) }
    }
}
