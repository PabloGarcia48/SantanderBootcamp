package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 500.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { (println(it)) }

    println("--- adição do Pedro---")
    funcionarios.add(pedro)
    funcionarios.forEach { (println(it)) }

    println("--- remoção do João---")
    funcionarios.remove(joao)
    funcionarios.forEach { (println(it)) }

    println("--- SET ---")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { (println(it)) }

    println("--- adicionado ao SET Pedro e Maria ---")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { (println(it)) }

    println("--- removido do SET a Maria ---")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { (println(it)) }


}