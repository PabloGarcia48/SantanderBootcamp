package one.digitalinnovation.collections

fun main() {
    val valores = intArrayOf(2, 3, 4, 1, 10, 7)

    valores.forEach {
        println(it)
    }

    println("--------------------")
    valores.sort()
    valores.forEach {
        println(it)
    }
}