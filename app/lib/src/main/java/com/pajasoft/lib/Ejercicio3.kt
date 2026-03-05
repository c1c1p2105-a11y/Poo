package com.pajasoft.lib

open class Animal(val nombre : String, val edad : Int){
    open fun hacerSonido(){
        println("Sonido generico.")
    }
    fun describirse(){
        println("Soy $nombre y tendo $edad años.")
    }
}
class Perro(nombre:String, edad: Int): Animal(nombre,edad) {
    override fun hacerSonido() {
        println("Guau!")
    }
}
class Gato(nombre:String, edad: Int): Animal(nombre,edad) {
    override fun hacerSonido() {
        println("Miauuu!")
    }
}

class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("muu!")
    }
}

fun main(){
    val perro = Perro("Rex",3)
    val gato = Gato("Rata",3)
    val vaca = Vaca("Vaa",3)
    perro.describirse()
    perro.hacerSonido()
    gato.describirse()
    gato.hacerSonido()
    vaca.describirse()
    vaca.hacerSonido()

}