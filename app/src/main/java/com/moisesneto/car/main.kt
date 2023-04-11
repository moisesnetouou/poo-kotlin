package com.moisesneto.car

fun main(){
    val motorCombustao = MotorImplCombustao()

    val fuca = Carro(motorCombustao)
    fuca.ligar()
    fuca.anda()
    fuca.anda()
    fuca.anda()
    fuca.anda()

    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.anda()
    tesla.anda()
}