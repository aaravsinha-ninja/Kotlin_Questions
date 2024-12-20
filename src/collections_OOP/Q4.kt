package collections_OOP

fun main() {
    var list = listOf("Shanu","Pratyusha","Reva","Sai","Aryan","Areen")
    println(list)
    list = list.filter { it.length >= 4 }
    println(list)
}