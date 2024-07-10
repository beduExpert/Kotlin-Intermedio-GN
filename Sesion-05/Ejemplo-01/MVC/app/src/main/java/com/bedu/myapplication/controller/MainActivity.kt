package com.bedu.myapplication.controller

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.bedu.myapplication.R
import com.bedu.myapplication.model.Board

class MainActivity : ComponentActivity() {
    private var model: Board? = null
    private var buttonGrid: ViewGroup? = null
    private var winnerPlayerViewGroup: View? = null
    private var winnerPlayerLabel: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        winnerPlayerLabel = findViewById(R.id.winnerPlayerLabel)
        winnerPlayerViewGroup = findViewById(R.id.winnerPlayerViewGroup)
        buttonGrid = findViewById(R.id.buttonGrid)
        model = Board()
    }

    fun onCellClicked(v: View) {
        val button = v as Button
        val tag = button.tag.toString()
        val row = tag.substring(0, 1).toInt()
        val col = tag.substring(1, 2).toInt()
        Log.i(TAG, "Click Row: [$row,$col]")
        val playerThatMoved = model!!.mark(row, col)
        if (playerThatMoved != null) {
            button.text = playerThatMoved.toString()
            if (model!!.winner != null) {
                winnerPlayerLabel!!.text = playerThatMoved.toString()
                winnerPlayerViewGroup!!.visibility = View.VISIBLE
            }
        }
    }

    fun onClickReset(v: View) {
        winnerPlayerViewGroup!!.visibility = View.GONE
        winnerPlayerLabel!!.text = ""
        model!!.restart()
        for (i in 0 until buttonGrid!!.childCount) {
            (buttonGrid!!.getChildAt(i) as Button).text = ""
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.name
    }
}