// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner

fun main() {

//TODO: Complete os espaços em branco com uma possível solução para o desafio

    val notas: IntArray = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var valor = readLine()!!.toInt()

    println(valor)

    for (i in 0..(notas.size - 1)) {
        if (valor >= notas[i]) {
            var qtNotas = valor / notas[i]
            println("${qtNotas} nota(s) de R$ " + notas[i] + ",00")

        } else {
            println("0 nota(s) de R$ " + notas[i] + ",00")
        }
        valor = valor % notas[i]
    }
}


/*
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner

fun main() {

//FAZER: Complete os espaços em branco com uma possível solução para o desafio

    val notas: IntArray = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var valor = readLine()!!.toInt()

    println(      )

for (i in 0..(notas.size - 1)) {
        if (valor >= notas[i]) {

         println("${       } nota(s) de R$ " + notas[i] + ",00")
        } else {
          println("0 nota(s) de R$ " + notas[i] + ",00")
        }
        valor = valor % notas[i]
    }
}
 */