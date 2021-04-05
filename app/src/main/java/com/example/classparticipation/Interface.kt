package com.example.classparticipation

interface Interface {

    val testNum: Int

    fun example() : String

    fun example2() {
        println("It's example2!")
    }
}

class InterfaceImp : Interface{

    override val testNum: Int = 25
    override fun example(): String {
        TODO("Not yet implemented")
    }

}

fun main(args: Array<String>) {
    val ex = InterfaceImp()

    println("test = ${ex.testNum}")

    ex.example()

    println(ex.example2())
}