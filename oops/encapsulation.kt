package oops

class Encap {
    private var a = 23;
    internal var b = 20;
    fun add(){
        println(a+b);
    }
    fun mul(){
        println(a*b)
    }
    fun divide(){
        val div = a.toFloat()/b.toFloat()
        println(div)
    }
}

fun main() {
    val obj1 = Encap()
    obj1.divide()
    obj1.mul()
    obj1.add()

//    obj1.a = 23 ///this will give error because an is private
}