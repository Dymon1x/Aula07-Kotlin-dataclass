package br.com.digitalhouse.ex4

class Funcionario(var nome: String, var numeroRegistro: Int){
    fun contains(x: Funcionario): Boolean{
        return x.numeroRegistro == numeroRegistro
    }
}