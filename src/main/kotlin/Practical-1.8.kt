//import java.util.*;
//fun main(){
//    var array1 = arrayOf(10,20,34,45,276);
//    println("create array1 using arrayof() method: ")
//    println(array1.contentDeepToString())
////    for (i in 0..array1.size-1){
////        print(" "+array1[i])
////    }
//    var array2 = Array<Int>(5){0}
//    var array3 = Array<Int>(7){i:Int -> i}
//
//    println("create array2 using array<>() method: ")
//    println(array2.contentDeepToString())
//    println("create array3 using array<>() and lambda method: ")
//    println(array3.contentDeepToString())
//
//    println("create array4 using intArrayof() method: ")
//    var array4 = intArrayOf(1,2,3,4,5)
//    println(array4.joinToString(" "))
//
//    println("create 2D array5 by using arrayof() and intArrayof() method : ")
//    var array5 = arrayOf(intArrayOf(1,4), intArrayOf(23,54), intArrayOf(23,57), intArrayOf(235,675), intArrayOf(346,689))
//    println(array5.contentDeepToString())
//
//
////    var arrayint = Array<Int>(5){0}
////    var i = 1
////    val abc:Int = arrayint.size
////    while( i < abc)
////    {
////        print("a[$i]=")
////        arrayint[i] = readLine()!!.toInt()
////        i++
////    }
//
//
////    for(index in 0..4)
////    {
////        println(arrayint[index])
////    }
//
////    println(arrayint.contentDeepToString())
//
//    var array6 = Array<Int>(5) { readLine()!!.toInt() }
////    for(i in array6)
////        println(i)
//    println(array6.contentDeepToString())
//
//    println(array6.sortedArray().contentDeepToString())
//}
//



import org.w3c.dom.ranges.Range
import java.awt.font.NumericShaper
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var a = arrayOf(10, 20, 30, 40)
    println("Array-1 by using arrayof() method : "+ Arrays.deepToString(a))

    var a2 = IntArray(size = 3)
    a2[0] = 10
    a2[1] = 20
    a2[2] = 30
    print("Array-2 by using IntArray() method : ")
    for (i in a2) {
        print(" "+i)
    }
    println("")

    var a3 = intArrayOf(1,2,3,4,5)
    print("Array-3 by using intArrayOf() method : ")
    for (j in a3) {
        print(" "+j)
    }
    println("")

    var a4 = Array<Int>(size = 5){0}
    println("Array-4 by using Array<>() : "+Arrays.deepToString(a4))

    val a5 = Array<Int>(size = 5) {index -> index * 2}
    print("Array-5 by using Array<>() and lambda function : ")
    for (i in a5) {
        print(" "+i)
    }
    println("")

    var a6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("2D Array-6 by using arrayOf() and intArrayOf() : "+Arrays.deepToString(a6))

    var b = IntArray(size = 5)
    println("Please enter Array values : ")
    for (i in 0 until 5) {
        print("a[$i] : ")
        var input = readLine()!!.toInt()
        b[i] = input
    }

    println("Entered Array : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")

    println("**********With Built-in Function**********")
    b.sort()
    println("After Sorting by built-in function : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")

    println("*********Without built-in function**********")
    bubbleSort(b)
    println("After Sorting without built-in function : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")
}

fun bubbleSort(b: IntArray) {
    var n = b.size
    for (i in 0 until n-1) {
        for (j in 0 until n-i-1) {
            if (b[j] > b[j+1]) {
                var temp = b[j]
                b[j] = b[j+1]
                b[j+1] = temp
            }
        }
    }
}