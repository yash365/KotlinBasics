import java.util.*

fun main(args : Array<String>) {


    // array list
    var nums = listOf(1,2,3,4)

    for( (a, e) in nums.withIndex()){
        println(" $a : $e")
    }

    // map
    var aliens = TreeMap<String, Int>()

    // java syntax aliens.put(""First",454)
    aliens["First"] = 454   // First is key n 454 is value
    aliens["Second"] = 578

    for((name, age2) in aliens) {
        println("$name : $age2")
    }


}