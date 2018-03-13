
fun main(args  : Array<String>){


    // range variable
    var nums = 1..100

    println("Range in asending order")
    // enhanced for loop
    for(a in nums){
        println(a)
    }

    println("Step using range")
    for(a in nums step 20){
        println(a)
    }

    // using decsending order using downTo Method
    var numDesc = 10 downTo 1

    println("Range in descending order")

    // enhanced for loop
    // step 3 is used to increment or decrements the number by the value
    for(a in numDesc){
        println(a)
    }

    println("step using downTo")
    for(a in numDesc step 3){
        println(a)
    }








}