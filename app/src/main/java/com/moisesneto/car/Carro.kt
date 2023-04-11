package com.moisesneto.car

class Carro constructor(private val motor: MotorImpl): Motor by motor {
    fun anda(){
        when {
            !motor.estaLigado() -> println("Liga o carro primeiro")
            !motor.temAutonomia() -> {
                when(motor) {
                    is MotorEletrico -> println("Tem que carregar")
                    is MotorImplCombustao -> println("Coloca combustivel")
                }
            }
            else -> {
                motor.gastando()

                when(motor) {
                    is MotorEletrico -> println("Carro andando")
                    is MotorImplCombustao -> println("Carro andando: vrunn vrunn")
                }
            }
        }
    }

    fun freia() {
        println("Freiando o carro")
    }

    fun buzina() {
        println("##$$$!!!@@%@%@%")
    }
}