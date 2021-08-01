package src.NorXndir

import java.util.*
fun main(args: Array<String>) {

    var a: Int
    var b: Int
    var min = 9
    var max = 0

    var sc = Scanner(System.`in`)

    print("Enter a number:")
    a = sc.nextInt()

    while (a > 0) {
        b = a % 10
        if (max < b) {
            max = b
        }
        if (min > b) {
            min = b
        }
        a /= 10
    }

    println("Max num:$max")
    println("Min num:$min")
}