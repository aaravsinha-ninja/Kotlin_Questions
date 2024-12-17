package Variable_and_control_flow
import java.util.*
fun main() {
    println("Enter your age")
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    if (x<18)
        println("Not an Adult")
    else
        println("Is an Adult")
}