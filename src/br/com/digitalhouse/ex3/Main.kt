package br.com.digitalhouse.ex3

fun main(){
    val aluno1 = Aluno("Leonardo B", 10)
    val aluno2 = Aluno("Leonardo C", 11)
    val aluno3 = Aluno("Matheus", 12)
    val aluno4 = Aluno("Thais", 13)

    val alunoLista = mutableListOf<Aluno>()
    alunoLista.add(aluno1)
    alunoLista.add(aluno2)
    alunoLista.add(aluno3)
    alunoLista.add(aluno4)

    val aluno5 = Aluno("Arthur", 10)
    println(alunoLista.contains(aluno5))
    alunoLista.add(aluno5)
    println(alunoLista.contains(aluno5))

}