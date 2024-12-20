package OOP
class Person(val Name:String){
    override fun toString(): String {
        return "The person's name is $Name"
    }
}

fun main() {
    val person1 = Person("Shanu")
    println(person1)
}