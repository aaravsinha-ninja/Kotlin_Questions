package Function_Questions

import java.util.Scanner
fun largest_num(array: IntArray):Int{
    var largest = 0
    array.forEach {
        if (it>largest){
            largest = it
        }
    }
    return largest
}
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the number of elements in the array")
    val n = sc.nextInt()
    println("Enter a list of integer")
    val array = IntArray(n)
    for (i in array.indices)
        array[i]=sc.nextInt()
    println("Largest value in the array is ${largest_num(array)}")
}