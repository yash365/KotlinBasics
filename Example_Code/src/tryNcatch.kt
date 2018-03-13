import java.lang.NumberFormatException

fun main(args : Array<String>) {

    val str : String = "6a"
    var num1 : Int = 0

    // old way
    try {
        num1 = str.toInt()
    }
    catch (e : NumberFormatException){
        println("Give proper input")
    }

    num1++
    println("old way try catch $num1")


    // new of using try catch
    var num2 : Int = try {
         str.toInt()
    }
    catch (e : NumberFormatException){
        -1
    }

    num2++
    println("new way try catch $num2")



}