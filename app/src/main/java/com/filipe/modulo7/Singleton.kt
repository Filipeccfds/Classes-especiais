package com.filipe.modulo7

class Singleton {
}

fun main() {
    Horario.setHorario(Turno.Noite)
    Horario.printar()
    Horario.setHorario(Turno.Manha)
    Horario.printar()

    val other = OtherClass()
    Horario.setHorario(Turno.Tarde)
    other.printHorario()
}
//vc pode usar outras classes para linkar o como object
class OtherClass{
    init {
        Horario.setHorario(Turno.Manha)
    }
    fun printHorario() = Horario.printar()
}

object Horario {
    private var turno:Turno = Turno.Noite

    fun setHorario(newTurno: Turno){
        this.turno = newTurno
    }

    fun printar() = println("Seu turno e ${turno}")

}

enum class Turno(seuTurno: String){
    Manha("Turno da Manha"),
    Tarde("Turno da Tarde"),
    Noite("Turno da Noite")
}