package com.filipe.modulo7

class CompanionObject {
}

fun main() {
    var person = Persson()
    Persson.Manager.adicionar()
    Persson.diminua()
    println(person.getTotalPerson())
    person.nome = "Ricardo"
    person.hello()
    val quleasa = "ricardo"
    println(quleasa.concatenacao())


    val humano = Humanos.Gerenciamento.adicionarHumano()
    println(Humanos.contador)
}

fun Persson.Manager.diminua(){
    counter--
}

fun String.concatenacao():String{
    return "ola" + this
}

fun Persson.hello(){
    println( "ola ${this.nome} ")
}

class Persson{
    var nome = ""
    var idade = 0

    fun getTotalPerson():Int = counter

    companion object Manager{
        var counter = 0

        fun adicionar(){
            counter++
        }

    }
}
// outro exemplo
class Humanos private constructor(){
    val nome = ""
    val idade = 0

    companion object Gerenciamento{
        var contador = 0

        fun adicionarHumano():Humanos{
            contador++
            return Humanos()
        }

    }
}