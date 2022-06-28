package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios) {
        println(salario)
    }

    println("----------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Media dos salários: ${salarios.average()}")

    println("-- Maior que 2500 --")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it)}

    println("-- Quantos salários estão entre 2000 e 5000 --")
    println(salarios.count{it in 2000.0..5000.0})


    println("-- Encontre salario de 2250 --")
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    println("-- Encontre salario de 1000 --")
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.0})


}