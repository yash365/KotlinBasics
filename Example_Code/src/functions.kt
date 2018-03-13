//to change the default class name use
@file : JvmName("Functions")



fun main(args : Array<String>) {

    add(4,5)

    var result = subtract(7,4)
    println(result)

    var mul_result = multiply(6, 99)
    println(mul_result)

    var max = max(6, 99)
    println(max)

    var min = min(6, 99)
    println(min)

}


fun add(a : Int, b : Int){
    println(a+b)
}

// Int is a return type
fun subtract(a : Int, b : Int) : Int {
    return a-b
}

// return in a single line
fun multiply(a : Int, b : Int) : Int = a*b

// return max number
fun max(a : Int, b : Int) : Int{

    if(a>b)
        return a
    else
        return b
}

// return min in a single line
fun min(a : Int, b : Int) : Int = if(a<b) a else b