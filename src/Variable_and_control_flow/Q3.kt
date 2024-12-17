package Variable_and_control_flow

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Enter the number to print it's 10 multiples")
    val x = sc.nextInt()
    for (i in 0 until 10){
        println(x*(i+1))
    }
}