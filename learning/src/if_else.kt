
fun main(args : Array<String>){

    var a = 5
    var b = 6

    var result : Int = 0

     if(a == b)
        println("Equals")
    else
        println("Not Equals")

    // new use of if else
    result = if(a == b)
        a
    else
        b

    println(result)


}