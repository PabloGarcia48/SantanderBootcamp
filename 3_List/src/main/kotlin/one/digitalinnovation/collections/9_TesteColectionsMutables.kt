package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 500.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { (println(it)) }

}