package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1000.0, "PJ")
    val maria = Funcionario("Maria", 500.0, "CLT")

    val funcionarios1 = setOf(pedro, joao)
    val funcionarios2 = setOf(maria)
    val funcionario3 = setOf(joao, pedro, maria)

    println("--- Union ---")
    val resultadoUnion = funcionarios1.union(funcionarios2)
    resultadoUnion.forEach{ println(it)}

    println("--- Subtract ---")
    val resultadoSubtract = resultadoUnion.subtract(funcionarios2)
    resultadoSubtract.forEach{ println(it)}

    println("--- Intersect ---")
    val resultadoIntersect = funcionario3.intersect(funcionarios2)
    resultadoIntersect.forEach{ println(it)}

}