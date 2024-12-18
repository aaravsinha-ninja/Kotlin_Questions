package Function_Questions

import java.util.Scanner
fun char_num(s : String, c : Char):Int{
    var num = 0
    for (char in s){
        if (char == c)
            num++
    }
    return num
}
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the String")
    val s = sc.nextLine()
    println("Enter the character to find")
    val c = sc.next()[0]
    println("Number of $c in $s is ${char_num(s,c)}")
}