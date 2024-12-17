package Function_Questions

import java.util.Scanner

fun sum(a:Int,b:Int): Int {
    return a+b
}
fun main(){
    val sc = Scanner(System.`in`)
    println("Enter 2 numbers")
    val a = sc.nextInt()
    val b = sc.nextInt()
    println("Sum of 2 numbers ${sum(a, b)}")
}