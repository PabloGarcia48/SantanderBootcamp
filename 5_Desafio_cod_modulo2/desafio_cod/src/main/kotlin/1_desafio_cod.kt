// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)

//TODO: Complete os espaços em branco com uma possível solução para o desafio

    var a = reader.nextDouble()
    var b = reader.nextDouble()

    var weightA = 3.5
    var weightB = 7.5
    var totalWeight = 11

    var m = (a *  weightA + b * weightB) / totalWeight

    var r = "%.5f".format(m)

    println("MEDIA = ${r}")
}