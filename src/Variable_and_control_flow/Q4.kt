package Variable_and_control_flow

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Enter the marks")
    val x = sc.nextInt()
    when(x){
        in 90..100 -> println("A Grade!")
        in 80..89 -> println("B Grade!")
        in 70 .. 79 -> println("C Grade!")
        in 60 .. 69 -> println("D Grade!")
        else -> println("F grade! ( Fail )")
    }
}