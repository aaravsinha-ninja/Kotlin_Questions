package Variable_and_control_flow

import java.util.Scanner

fun main(){
    println("Enter two numbers")
    val sc = Scanner(System.`in`)
    println("Enter 2 numbers to perform operation on")
    val x = sc.nextInt()
    val y = sc.nextInt()
    println("Enter the operation to be performed \n1) Addition \n2) Subtraction \n3) Multiplication \n4) Division")
    val z = sc.nextInt()
    when(z){
        1 -> println(x+y)
        2 -> println(x-y)
        3 -> println(x*y)
        4 -> println(x/y)
        else -> println("Wrong input")
    }
}