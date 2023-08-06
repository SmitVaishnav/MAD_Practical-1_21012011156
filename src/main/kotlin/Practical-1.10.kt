//import java.util.*
//
//
//
//
//open class person(val firstname:String){
//    var lname:String=""
//    constructor(firstname: String,lastname: String):this(firstname){
//        lname = lastname
//    }
//
//    fun fullname(){
//        print(firstname + ""+ lname)
//    }
//}
//class student(val name:String):person(firstname ="vaishnav") {
//    var enno:String= ""
//    var Sname=name
//    constructor(name: String,ennrollmentno:String):this(name){
//        enno = ennrollmentno
//    }
//    init {
////        Sname = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
////        print(Sname)
//
//        println("init called")
//        println(firstname +" "+lname)
//
//
//    }
//
//
//}
//
//fun main(){
//    val s = student("Smit","21012011156")
//    print(s.name)
//}
//
//





class Car (
    var type : String,
    var model : Int,
    var Oprice : Double,
    var Cprice : Double,
    var owner : String,
    var milesdrive : Int)
{
    init {
        println("Object of class is created and Init is Called.")
        println()
    }
    fun getOriginalCarPrice(): Double {
        return Oprice
    }

    fun getCurrentCarPrice(): Double {
        return Cprice
    }

    fun displayCarInfo() {
        val originalPrice = getOriginalCarPrice()
        val currentPrice = getCurrentCarPrice()
        println("-----------------------------------")
        println("Car Information : $type, $model")
        println("Car Owner : $owner")
        println("Miles Drive : $milesdrive")
        println("Original Car Price : $originalPrice")
        println("Current Car Price : $currentPrice")
        println("-----------------------------------")
    }
}

fun main() {
    var car1 = Car("BMW",2018, 100000.0,98950.0, "Aman",105 )
    var car2 = Car("BMW",2019, 400000.0,399800.0, "Karan",20 )
    car1.displayCarInfo()
    car2.displayCarInfo()

    var cars = ArrayList<Car>()
    cars.add(Car("Toyota",2017, 1080000.0,1079000.0, "KJS",100 ))
    cars.add(Car("Maruti",2020, 4000000.0,3998000.0, "NPP",200 ))
    println("********** ArrayList of Car **********")
    for (car in cars) {
        car.displayCarInfo()
        println()
    }
}
