package OOP

open class Animal(val animal: String){
    fun walk(){
        println("$animal is walking")
    }
}
class Dog(val name:String) : Animal(name){
    fun bark(){
        println("$name is barking")
    }
}
class Cat(val name:String) : Animal(name){
    fun meow(){
        println("$name is meowing")
    }
}
fun main() {
    val dog = Dog("Bella")
    val cat = Cat("Kitty")
    dog.walk()
    cat.walk()
    dog.bark()
    cat.meow()
}