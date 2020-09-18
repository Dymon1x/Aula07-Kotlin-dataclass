package br.com.digitalhouse.ex4

fun main() {
    var listaFunc = mutableListOf<Funcionario>(
        Funcionario("Leonardo C", 100),
        Funcionario("Leonardo B", 101),
        Funcionario("Matheus", 102),
        Funcionario("Arthur", 103)
    )
    var func = Funcionario("Thais", 101)
    println(listaFunc.contains(func))

    listaFunc.add(func)
    println(listaFunc.contains(func))

}