package com.udacity.court_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scoreA : Int = 0
    var scoreB : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.action_bar_layout)
    }

//    Team A Buttons
    fun add_One_A(View: View){
        scoreA++
        displayScoreA(scoreA)
    }
    fun add_Two_A(View: View){
        scoreA += 2
        displayScoreA(scoreA)
//        Toast.makeText(this, "Add Two A Button Clicked", Toast.LENGTH_LONG).show()
    }
    public fun add_Three_A(View: View){
        scoreA += 3
        displayScoreA(scoreA)
    }

//    Team B Buttons
    fun add_One_B(View: View){
        scoreB++
        displayScoreB(scoreB)
    }
    fun add_Two_B(View: View){
        scoreB += 2
        displayScoreB(scoreB)
    }
    fun add_Three_B(View: View){
        scoreB += 3
        displayScoreB(scoreB)
    }


    fun scoreReset(View: View){
        scoreA = 0
        scoreB = 0

        displayScoreA(scoreA)
        displayScoreB(scoreB)
    }

    fun displayScoreA(score : Int){
        team_A_score.text = score.toString()
    }

    fun displayScoreB(score : Int){
        team_B_score.text = score.toString()
    }
}