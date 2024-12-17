package Variable_and_control_flow

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val x = (Math.random()*100).toInt()
    println("Enter your Number")
    while (true){
        val y = sc.nextInt()
        if (y<x)
            println("To small")
        else if (y>x)
            println("To Large")
        else if (y == x) {
            println("Correct Answer!")
            break
        }
    }
}