package com.gbd.mykttestapp

class KotlinTest {
    init {
        TestPrint.println("Init block")
    }

    constructor(i : Int)
    {
        TestPrint.println("Constructor")
    }

    var testFiledA : Int = 1;

    val isTested : Boolean
        get() = testFiledA == 1
}

