package OOP
class car(val brand : String,val model : String,val year : Int){
    fun Display(){
        println(" The Brand of the car is $brand \n The Model of the car is $model \n The year of manufacturing fo the car is $year")
    }
}

fun main(){
    val car1 = car("Lamborgini","Urus",2024)
    car1.Display()
}