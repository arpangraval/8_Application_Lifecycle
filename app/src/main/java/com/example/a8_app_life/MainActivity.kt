package com.example.a8_app_life

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MyAppStatus:","App is in Create State")
    }

    override fun onStart() {
        super.onStart()
        Log.e("MyAppStatus:","App is in Start State")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MyAppStatus:","App is in ReStart State")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MyAppStatus:","App is in Destroy State")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MyAppStatus:","App is in Pause State")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MyAppStatus:","App is in Resume State")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MyAppStatus:","App is in Stop State")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this,"Are you sure?",Toast.LENGTH_LONG).show()
    }

}