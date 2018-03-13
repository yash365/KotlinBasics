package ExtensionFunction

fun main(args : Array<String>){

    var obj1 = Alien()
    obj1.skills = "Java"
    obj1.show()

    var obj2 = Alien()
    obj2.skills = "Kotlin"
    obj2.show()

    var obj3 = obj1.plus(obj2)
    obj3.show()

}


// return type is Alien
// By putting Alien.plus it becomes an Extension function not internally but externally
fun Alien.plus(alien : Alien) : Alien
{

    var newObj = Alien()
    newObj.skills = this.skills + " " + alien.skills
    return newObj

}