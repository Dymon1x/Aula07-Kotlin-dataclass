package br.com.digitalhouse.aula7

fun main(){
    var notebook1 = Notebook("Dell", 3000)
    println(notebook1)

    var notebook2 = Notebook("Positivo", 3000)
    println(notebook1.equals(notebook2))
    //copy usado para copiar um objeto

    var copyNotebook2 = notebook2.copy(preco = 4000)
    println(copyNotebook2)


}