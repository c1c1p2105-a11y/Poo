package com.pajasoft.lib

class cuentaBancaria(val titular : String){

    var saldo: Double = 0.0

    fun depositar(cantidad: Double) {

        saldo += cantidad

        println("Deposito realizado con exito. Nuevo saldo: $saldo")

    }

    fun retirar(cantidad: Double){

        if (cantidad > saldo){

            println("Error: Saldo insuficiente")

        }else{

            saldo -= cantidad

            println("Retiro realizado con exito. Nuevo saldo: $saldo")

        }

    }

    fun mostrarSaldo(){

        println("Saldo actual de $titular: $saldo")

    }

}

fun main(){

    val cuenta = cuentaBancaria("Maria")

    cuenta.depositar(1000.0)

    cuenta.retirar(400.0)

    cuenta.mostrarSaldo()

    cuenta.retirar(800.0)

}
