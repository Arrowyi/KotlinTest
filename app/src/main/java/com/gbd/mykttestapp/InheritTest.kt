package com.gbd.mykttestapp

open class Rectangle {
    open fun draw() {
        TestPrint.println("Drawing a rectangle")
    }

    open val borderColor: String get() = "black"
    var myTest = 1;
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        TestPrint.println("Filling the rectangle")
    }

    //override property with get method
    val fillColor: String get() = super.borderColor
}

class FilledRectangle1 : Rectangle() {
    override fun draw() {
        TestPrint.println("Filling the rectangle1")
    }

    override val borderColor: String get() = "white"

    inner class Filler {
        fun fill() { /* ... */
        }

        fun drawAndFill() {
            super@FilledRectangle1.draw() // Calls Rectangle's implementation of draw()
            fill()
            TestPrint.println("Drawn a filled rectangle with color ${super@FilledRectangle1.borderColor}") // Uses Rectangle's implementation of borderColor's get()
            TestPrint.println("Drawn a filled rectangle with color $borderColor")
        }
    }
}

fun test() {
    val filledRectangle: FilledRectangle = FilledRectangle()
    filledRectangle.draw()

    val filledRectangle1: FilledRectangle1 = FilledRectangle1()
    filledRectangle1.Filler().drawAndFill()
}