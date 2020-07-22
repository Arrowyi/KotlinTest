package com.gbd.mykttestapp

import android.util.Log
import android.widget.TextView

object TestPrint {
    private lateinit var tx: TextView
    fun setTextView(textView: TextView) {
        tx = textView;
    }

    fun println(msg: String) {
        Log.i("print_test", msg)
        tx.append(msg)
        tx.append("\n")
    }
}