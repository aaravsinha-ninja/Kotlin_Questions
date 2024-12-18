package Function_Questions

import java.util.Scanner
fun factorial(a:Int):Int {
    if (a<=1) return 1
    return a * factorial(a-1)
}
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the number to get it's factorial")
    val n = sc.nextInt()
    println("Factorial of $n is ${factorial(n)}")
}