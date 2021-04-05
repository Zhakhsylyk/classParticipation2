package com.example.classparticipation

abstract class Shape(val shape: String) {
    abstract var color: String

    abstract fun Area(area:Double)

    fun ShapeType() {
        println("Type: $shape")
    }
}

class Rectangle(shape: String) : Shape(shape) {
    override var color = "red"
    override fun Area(area:Double){
        println("Area is: $area")
    }
}
