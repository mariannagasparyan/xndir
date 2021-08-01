package src.NorXndir

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val num = reader.nextInt()
    for (i in 1..num) {
        for (k in 1..i) {
            print("*")
        }
        for (j in 10 downTo i) {

            print(" ")
        }
        println()
    }
}