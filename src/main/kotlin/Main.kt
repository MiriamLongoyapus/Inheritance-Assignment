fun main(){
    val vehicle = Vehicle("Toyota","Senena","Grey",7)
    vehicle.carry(7)
    vehicle.carry(9)
    vehicle.identity()
    println(calculateParkingFees(2))

    val bus = Bus("Toyota","Serena","white",85)
    println(bus.maxTripFare(400.00))
    println(bus.calculateParkingFees(3))

}
open class Vehicle(var make: String,var model: String,var color: String,var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("overcapacity by $x people")

        }
    }
    fun identity() {
        println("I am a $color $make $model")
    }


}
////- calculateParkingFees(hours: Int) : Calculates and returns the
////parking fees by multiplying the hours by 20
fun calculateParkingFees(hours: Int):Int {
    var parkingFees = hours * 20
    return parkingFees
}

class Car( make:String, model: String, color: String, capacity: Int):Vehicle(make, model, color, capacity)

//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
class Bus( make: String,  model: String,  color: String,  capacity: Int):Vehicle(make,model,color,capacity){
    fun maxTripFare(fare: Double): Double{
        var trip = fare*capacity
        return trip
    }
    fun calculateParkingFees(hours: Int): Int{
        var parkingFees = hours * capacity
        return parkingFees



    }
}