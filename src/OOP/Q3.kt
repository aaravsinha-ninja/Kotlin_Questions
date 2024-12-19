package OOP

interface Drivable {
    fun drive(){
        println("The vehicle is Moving")
    }
    fun stop(){
        println("The vehicle is Stopped")
    }
}
class Car(val Brand : String, val Model : String) : Drivable{
    override fun drive() {
        println("The $Brand $Model is Driving")
    }
    override fun stop() {
        println("The $Brand $Model is Stopped")
    }
}
class Bike(val Brand : String, val Model : String) : Drivable{
    override fun drive() {
        println("The $Brand $Model is Driving")
    }
    override fun stop() {
        println("The $Brand $Model is Stopped")
    }
}
fun main(){
    val car = Car("BMW","M5")
    car.drive()
    car.stop()
    val bike = Bike("Honda","CBR")
    bike.drive()
    bike.stop()
}