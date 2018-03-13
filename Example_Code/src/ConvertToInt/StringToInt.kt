package ConvertToInt

fun main(args : Array<String>) {

    val str : String = "6a"

    // old way
    var num : Int = Integer.parseInt(str)
    num++

    println("Old way converting $num")

    //new way
    var num1 : Int = str.toInt()
    num1--

    println("New way converting $num1")

}