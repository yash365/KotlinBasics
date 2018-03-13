
fun main(argument : Array<String>){

    var a = 100
    var b = 500

    //when is switch alternative
    when(a){

        50 -> println("50")
        100 -> println("100")
        500 -> println("500")

        // else is default alternative
        else -> println("No same value")
    }

    // new use of when i.e switch
    var result : String = ""

    result = when(b) {

        50 -> "50"
        100 -> "100"
        500 -> "500"

        else -> "No same"
    }
 
    println(result)


}