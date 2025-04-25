package oops

//class Constructor (val a: Int,val b: Int){  /// === primary constructor ===//
//    val x = a
//    val z = b
//    fun add(){
//        println(a+b)
//    }
//}

///============================secondary constrictor ==============================///
//class ch{
//   var a: Int = 0
//    var b: Int = 0
//
//    constructor(a: Int, b: Int){ //secondary Constructor
//        this.a = a
//        this.b = b
//
//    }
//    fun add(){
//        println(a+b)
//    }
//}


/////============================ multiple constructor =================================/////
class ch2{
   var a: Int = 0
    var b: Int = 0
var name : String =""
    constructor(a: Int, b: Int){ //secondary Constructor
        this.a = a
        this.b = b

    }
    constructor(name: String){
        this.name = name
    }

    fun add(){
        println(a+b)
    }
    fun getname(){
        println(name)
    }
}

fun main() {

    ////============  Primary Constructor   ===========================///////
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val obj = Constructor(20,50).add()


    /////======================secondary Constructor===================////
//val cos = ch(20,50)
//    cos.add()

//=================================== multiple constructor =========================////
//    val constructor1 = ch2("aman")
//    val constructor2 = ch2(20,50)
//    constructor1.getname()
//    constructor2.add()

}