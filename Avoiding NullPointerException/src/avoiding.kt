

fun main(args : Array<String>){

    // using ? we can assign null value
    var name : String? = null
    println(name)

    var obj : Naming? = Naming()
    println("Diff name is ${obj?.naming}")

    var num : Int? = null
    println(num)


}