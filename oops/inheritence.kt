package oops
////////================ single inheritance =======================///////
//open class  Father{
//    var car1 = "lamborghini"
//    fun car(){
//        println(car1)
//    }
//}
//class Child : Father(){
//    fun childCar(){
//        car()
//    }
//
//}


/////=================== Multilevel Inheritance ========================///////
//open class Father {  //////// father
//    var mobile = "Iphone"
//    fun mobile(){
//        println(mobile)
//    }
//}
//open class child : Father(){  /// father ka bachaaa
//    fun childMobile(){
//        mobile()
//    }
//}
//class child2 : child(){    ////// father ke bache ka bachaa
//    fun child2Mobile(){
//        childMobile()
//    }
//}




////////======================= hierarchical Inheritance =========================///
////ek baap ke 1 se jyaadaaa bache
//open class Father {
//    var bike = " kawasaki"
//    fun fatherBike(){
//        println(bike)
//    }
//}
//class child1 : Father(){
//    fun child1(){
//        fatherBike()
//    }
//}
//
//class child2 : Father(){
//    fun child2(){
//        fatherBike()
//    }
//}


////======================== Hybrid Inheritance ======================/////
/////// mixup of multilevel inheritance and hierarchical Inheritance

//open class Father {
//   var property = "Premium Flat"
//    fun property(){
//        println(property)
//    }
//}
//
//open class child1 : Father(){
//    fun child1 (){
//        property()
//    }
//}
//class child2 : Father(){
//    fun child2 (){
//        property()
//    }
//}
//class child3 : child1(){
//    fun child3 (){
//        child1()
//    }
//}


fun main() {
    /////============= single inheritance =======================////
//    var child = Child()
//    child.childCar()


/////================ multiLevel Inheritance ==================////
//    var child2 = child2()
//    child2.child2Mobile()

////================= hierarchical Inheritance ========================//////
//    var child1 = child1()
//    child1.child1()
//
//    var child2 = child2()
//    child2.child2()

    ///////========================== Hybrid Inheritance ====================///

//    var child1 = child1()  //// multilevel inheritance
//    child1.child1()
//
//    var child2 = child2()  /// multilevel inheritance
//    child2.child2()
//
//    var child3 = child3() /// hierarchical inheritance bcs child3 is son of child1
//    child3.child3()
}
/// ill continue