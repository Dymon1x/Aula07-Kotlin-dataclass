package br.com.digitalhouse.ex1

class Pessoa(var nome: String, var RG: Int) {
    // utilizando o equals por padrao do sistema, irá retornar false
    fun equals(x: Pessoa): Boolean {
        return x.RG == RG
    }
}