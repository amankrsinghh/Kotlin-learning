package oops

/////=========================== polymorphism through override function ===============///

//open class Animal {
//    open fun sound(){
//        println("sound")
//    }
//}
//class Dog: Animal(){
//    override fun sound(){
//        println("Bark Bark")
//    }
//}
//
//class Cat: Animal(){
//    override fun sound(){
//        println("Meow Meow")
//    }
//}


////////////////// function / method overloading ============////
class  Father {
    fun details(name: String, age: Int){
        println(name)
        println(age)
    }
}
class Son{
    fun details(name: String,age: Int,department: String){ //// function with same name but with different parameter
        println(name)
        println(age)
        println(department)
    }
}

fun main() {

    ////========= polymorphism =========///
//    var obj = Animal()
//    obj.sound()
//    var obj2 = Dog()
//    obj2.sound()
//    var obj3 = Cat()
//    obj3.sound()

    ////======== method overloading =================////
    var obj = Father()
    obj.details("Aman", 34)

    var obj2 = Son()
    obj2.details("Aman ka beta let be x",0,"BTech CSE")

}