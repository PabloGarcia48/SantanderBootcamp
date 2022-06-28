package one.digitalinnovation.collections

fun main() {
    val valores = IntArray(5)

    valores[0] = 1
    valores[1] = 7
    valores[2] = 6
    valores[3] = 3
    valores[4] = 2

    for (valor in valores) {
        println(valor)
    }
    println("---------------------------")

    valores.forEach {
        println(it)
    }

    println("---------------------------")

    for (indice in valores.indices) {
        println("${valores} --> ${valores[indice]}")
    }

    println("---------------------------")
    valores.sort()
    for (valor in valores) {
        println(valor)
    }
}