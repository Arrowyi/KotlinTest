package com.gbd.mykttestapp


open class Shape

class Rectangle : Shape() {
    fun forTest(){
        TestPrint.println("for test in Rectangle")
    }
}

fun Shape.getNameTest(): String {
    TestPrint.println("call shape.getName")
    return "Sharp"
}

fun Rectangle.getNameTest(msg: String): String {
    forTest()
    TestPrint.println("call Rectangle.getName")
    return "Rectangle"
}

fun printClassName(s: Shape) {
    TestPrint.println(s.getNameTest())
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

