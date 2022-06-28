package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = setOf(pair)

    map1.forEach{ (x, y) -> println("Chave: $x    Valor: $y")}
}