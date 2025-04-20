package nullpointer

fun main() {

    println("enter your name")
//    var name:String = readLine()!! //-> initialization is a must

    var name: String? // this can accept null ?-> elvis operator
    //println(name.length)  //this wil give error because null value can be detect

    name = "aman"
//    name = null
 //first method to accept or handle null exception

//    if (name == null){
//        println(-1)
//    }
//    else{
//        println(name.length)
//    }


    //second method -> safe call
//    println(name?.length)


    ///third method !!-> assassin operator
    println(name!!.length)

}