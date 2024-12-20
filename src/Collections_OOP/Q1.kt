package Collections_OOP

fun main() {
    var list1 = listOf( 2, 8, 9, 9, 2, 2, 3, 2, 1, 9, 9, 0, 9, 8, 2, 3, 9, 7)
    println(list1)
    list1 = list1.toSet().toList()
    println(list1)
    list1 = list1.sorted()
    println(list1)
}