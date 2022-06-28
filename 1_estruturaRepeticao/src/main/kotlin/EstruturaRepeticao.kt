fun main() {
    var num: Int = 15
    contar(num)
    println("")
    decrescer(num)
    println("")
    conteAte(num)
    println("")
    passos(num)
    println("")
    letras()

}

fun contar(num: Int) {
    print("Contar -> ")
    for (i in 0..num) {
        print("$i ")
    }
}


fun decrescer(num: Int) {
    print("Decrescer -> ")
    for (i in num downTo 0) {
        print("$i ")
    }
}

fun conteAte(num: Int) {
    print("Conte até -> ")
    for (i in 0 until num) {
        print("$i ")
    }
}

fun passos(num: Int) {
    print("Contar pulando -> ")
    for (i in 0..num step 2)
        print("$i ")
}

fun letras() {
    val sArray = "Olha essa String!"
    for (l in sArray) {
        print(l.toUpperCase())
    }
}