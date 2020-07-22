package com.gbd.mykttestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tx: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tx = findViewById(R.id.main_text)

        TestPrint.setTextView(tx);
        val test : KotlinTest = KotlinTest(1)
        printSum(-1, 8)

        val dispatchTest : DispatchTest = DispatchTest()
        dispatchTest.test();
    }

    fun printSum(a: Int, b: Int) {
        TestPrint.println("sum of $a and $b is ${a + b}")
        val list = asList(1, 2, 3, 4, 5, 6, 7, b = 11)
        TestPrint.println(list.toString())
    }

    fun asList(vararg ts: Int, a: Int = 99, b: Int): List<Int> {
        val result = ArrayList<Int>()
        result.add(a)
        result.add(b)
        for (t in ts) // ts is an Array
            result.add(t)
        return result
    }
}
