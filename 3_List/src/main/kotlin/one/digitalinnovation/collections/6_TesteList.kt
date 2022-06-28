package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0,"PJ")
    val maria = Funcionario("Maria", 500.0,"CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("--- Encontre Maria ---")
    println(funcionarios.find { it.nome == "Maria" })

    println("--- Organizar por salário ---")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("--- Organizar por tipo contratação ---")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}
