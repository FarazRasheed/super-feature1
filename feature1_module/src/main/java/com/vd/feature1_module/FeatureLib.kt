package com.vd.feature1_module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FeatureLib : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_lib)

        findViewById<Button>(R.id.button_first).setOnClickListener {
            val intent = Intent(this, FeatureLib2::class.java)
            startActivity(intent)
        }
    }
}