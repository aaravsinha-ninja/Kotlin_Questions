package Function_Questions

import java.util.Scanner

fun is_Prime (a :Int): Boolean {
    if (a <= 1) return false
    if (a <= 3) return true
    if (a % 2 == 0 || a % 3 == 0) return false
    var i = 5
    while (i * i <= a) {
        if (a % i == 0 || a % (i + 2) == 0) return false
        i += 6
    }
    return true
}
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter a number to be checked if it is a prime number or not")
    val a = sc.nextInt()
    if (is_Prime(a)) println("The number is a prime number")
    else println("The number is not a prime number")
}
