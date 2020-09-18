package br.com.digitalhouse.ex2

class Coca(var tamanho: Int, var preco: Double){
    fun equals(x: Coca): Boolean{
        return x.tamanho == tamanho
    }
}