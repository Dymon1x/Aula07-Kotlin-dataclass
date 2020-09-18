package br.com.digitalhouse.ex3

class Aluno(var nome: String, var numeroAluno: Int) {
    fun contains(x: Aluno): Boolean{
        return x.numeroAluno == numeroAluno
    }
}