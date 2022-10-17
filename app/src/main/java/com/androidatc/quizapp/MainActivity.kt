package com.androidatc.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

        fun startQuiz(View: View){
            val intent = Intent(this,Question::class.java)

            startActivity(intent)
        }

        fun goHelp(View: View){
            val intent = Intent(this,Help::class.java)

            startActivity(intent)
        }

    fun goPreferences(View: View){
        val intent = Intent(this,Preferences::class.java)

        startActivity(intent)
    }


}