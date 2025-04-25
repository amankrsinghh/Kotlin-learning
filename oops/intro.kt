package oops
class Schedule {
    fun task1(){
        println("wake up")
    }
    fun task2(){
        println("take Bath")
    }
    fun task3(){
        println("Get ready for the work")
    }
    fun task4(){
        println("back to home")
    }
    fun task5(){
        println("Sleep....")
    }
}
fun main() {
    val person1 = Schedule() ///object creation
    person1.task1()
    person1.task2()
    person1.task3()
    person1.task4()
    person1.task5()
    println("====================================================================")
    val person2 = Schedule()
    person2.task1()
    person2.task3()
    person2.task4()
}