package com.filipe.modulo7

class Dataclass {
}

fun main(){
var person = Person("filipe",12)
    println(person)
    person.email="filipe.puma@gmail.com"
    var (name,age)= person
    println(name)
}

data class Person(val name:String,val agr:Int){
    var email:String = ""
}
