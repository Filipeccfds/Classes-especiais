package com.filipe.modulo7

class Enum {
}

fun main() {
    var season:Season = Season.SUMMER
    println(season)
    season.hello()

    when(season){
        Season.FALL -> println("É Outono")
        Season.WINTER -> println("É Inverno")
        else -> println("É Verão")
    }

}


enum class Season(clima:String){
    WINTER("Winter"){
        override fun hello() {
        println("ola inverno!")
        }
    },
    FALL("Outono"){
        override fun hello() {
            println("ola outono!")
        }
                  },
    SUMMER("Verao"){
        override fun hello() {
            println("ola verao!")
        }
    };

    abstract fun hello()
}