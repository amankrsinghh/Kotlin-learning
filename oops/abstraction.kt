package oops

abstract class Atm {
    abstract fun process()
    fun process2(){
        var res = 20000
        println("Total Bank Balance:- $res")
    }
}

class User: Atm() {
    override fun process() {
        process2()
    }
}
fun main() {
    var obj = User()
    obj.process()
}///////heloohhhhhh