import java.util.*




open class person(val firstname:String){
    var lname:String=""
    constructor(firstname: String,lastname: String):this(firstname){
        lname = lastname
    }

    fun fullname(){
        print(firstname + ""+ lname)
    }
}
class student(val name:String):person(firstname ="vaishnav") {
    var enno:String= ""
    var Sname=name
    constructor(name: String,ennrollmentno:String):this(name){
        enno = ennrollmentno
    }
    init {
//        Sname = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
//        print(Sname)

        println("init called")
        println(firstname +" "+lname)


    }


}

fun main(){
    val s = student("Smit","21012011156")
    print(s.name)
}


