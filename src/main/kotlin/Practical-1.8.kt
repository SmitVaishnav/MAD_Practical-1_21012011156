import java.util.*;
fun main(){
    var array1 = arrayOf(10,20,34,45,276);
    println("create array1 using arrayof() method: ")
    println(array1.contentDeepToString())
//    for (i in 0..array1.size-1){
//        print(" "+array1[i])
//    }
    var array2 = Array<Int>(5){0}
    var array3 = Array<Int>(7){i:Int -> i}

    println("create array2 using array<>() method: ")
    println(array2.contentDeepToString())
    println("create array3 using array<>() and lambda method: ")
    println(array3.contentDeepToString())

    println("create array4 using intArrayof() method: ")
    var array4 = intArrayOf(1,2,3,4,5)
    println(array4.joinToString(" "))

    println("create 2D array5 by using arrayof() and intArrayof() method : ")
    var array5 = arrayOf(intArrayOf(1,4), intArrayOf(23,54), intArrayOf(23,57), intArrayOf(235,675), intArrayOf(346,689))
    println(array5.contentDeepToString())


//    var arrayint = Array<Int>(5){0}
//    var i = 1
//    val abc:Int = arrayint.size
//    while( i < abc)
//    {
//        print("a[$i]=")
//        arrayint[i] = readLine()!!.toInt()
//        i++
//    }


//    for(index in 0..4)
//    {
//        println(arrayint[index])
//    }

//    println(arrayint.contentDeepToString())

    var array6 = Array<Int>(5) { readLine()!!.toInt() }
//    for(i in array6)
//        println(i)
    println(array6.contentDeepToString())

    println(array6.sortedArray().contentDeepToString())
}

