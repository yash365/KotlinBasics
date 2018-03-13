
fun main(args : Array<String>){

    // prints till 19
    var nums = 1 until 20

    println("using until")
    for(a in nums){
        println(a)
    }

    println("using reversed")
    for(b in nums.reversed()){
        println(b)
    }

    // to get the total count of variable nums
    println("Count is ${nums.count()}")

}