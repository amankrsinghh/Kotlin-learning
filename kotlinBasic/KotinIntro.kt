package kotlinBasic

/*

kotlin is created by jet brain in 2010-11 and first version released in 2016.
Kotlin compiles to JVM bytecode → Runs on the Java Virtual Machine (JVM) like Java.
Kotlin code is converted to Java bytecode → Executed by the JVM.


Why JetBrains Created Kotlin?

    JetBrains needed a modern language that:
    Was interoperable with Java.
    Had better syntax (less boilerplate code).
    Was type-safe (avoiding NullPointerExceptions).
    Had first-class support for functional programming.

Since existing languages like Scala, Groovy, and Clojure had issues (slow compilation, complexity),
JetBrains decided to create their own language.


Why Did Google Choose Kotlin as the Official Language? (accepted official language in 2017)

Ans->   Java had limitations → Kotlin solved them with better syntax and safety.
        Kotlin was 100% interoperable with Java → No need to rewrite code.
        JetBrains actively supports Kotlin → Frequent updates & improvements.
        Kotlin had massive developer demand → Many Android developers preferred Kotlin over Java.
        Google wanted a modern, efficient language → Kotlin has better performance and fewer crashes.

How popular it is right Now and its Scope :->

    Kotlin is already used by over 60% of professional Android developers,
    and 95% of the top 1,000 Android apps contain Kotlin code.


 */
////===========================================================================================////////////////////////////////


/*
A. Package
A package is a way to organize related Kotlin files. It helps avoid naming conflicts.

You define a package at the top of a Kotlin file.
If no package is defined, the file belongs to the default package.


B. Imports
The import keyword is used to import functions, classes, and objects from other packages.
You can use wildcard imports (*) to import everything from a package.
Kotlin automatically imports some standard packages like kotlin.io, kotlin.math, etc.



C. Comments in Kotlin
Comments are ignored by the compiler and are used for documentation and explanation.

Types of Comments:
Single-line comment → Starts with //
Multi-line comment → Enclosed within /* */
KDoc comment → Used for documentation (/** */)


 */










// 2. Entry Point of Program and print standard Output

//fun main(){
//
// println("sharma")
//    println("shivam")
//
//
//}









// 3. Variables, lateinite and Data Types

/*
Variable are used to store a value and value can be of any type

Kotlin has two types of variables in Kotlin :
val (Immutable) → Read-only, cannot be changed.
var (Mutable) → Can be changed.
*/

//fun main() {
//
//    var name = "shivam"
//    name = "vijay"
//    println(name)
//
//
//
//}








// Topic lateinit (used to initialize variable later)

//fun main() {
//
//    lateinit var name: String
//    name = "shivam"
//    println(name)
//
//
//}








/*
lateinit Keyword (For Late Initialization)
Used only with var, not val.
Useful when you cannot initialize a variable immediately.
*/









// 4. Standard Input

//fun main() {
//
//    var name = readln()
//    println(name)
//
//
//}







// 5. Collections

/*

In Kotlin, collections are used to store and manipulate groups of data.
There are two main types of collections:

1. Immutable Collections (Read-Only)

List<T> → Ordered collection (duplicates allowed)
Set<T> → Unique elements (unordered)
Map<K, V> → Key-value pairs (unique keys)

2. Mutable Collections (Modifiable)
MutableList<T> → List with modification functions
MutableSet<T> → Set with modification functions
MutableMap<K, V> → Map with modification functions


 */

// Example :

//fun main() {
////    val fruits = mutableListOf("Apple", "Banana", "Cherry", "Apple","Orange", "Apple")
////    println(fruits)  // Output: [Apple, Banana, Cherry, Apple]
////    println(fruits[2])  // Output
////    println(fruits.size)  //



//    val map = mutableMapOf("shivam" to 108, "vijay" to 501, "Three" to 3)
//    map.remove("shivam")
//     println(map)
//


//}












// 6. All operators


/*
Kotlin Operators
Operators in Kotlin are special symbols used to perform operations on variables and values

Arithmetic → +, -, *, /, %
Comparison → ==, !=, >, <, >=, <=
Logical → &&, ||, !
Bitwise → and, or, xor, inv, shl, shr, ushr
Assignment → =, +=, -=, *=, /=, %=
Unary → ++, --, -, +, !
Range → .., downTo, until, step

 */










// Most Commonly Use Operator

// Arithmetic Operator

//fun main() {
//    val a = 10
//    val b = 3
//
//    println(a + b)  // Addition → 13
//    println(a - b)  // Subtraction → 7
//    println(a * b)  // Multiplication → 30
//    println(a / b)  // Division → 3 (Integer division)
//    println(a % b)  // Modulus → 1 (Remainder)
//}
//







/*
 Logical Operators
 && (AND Operator) → Both conditions must be true for the result to be true.
 || (OR) → at least one condition is true for result to be true
 ! (NOT) → Negates the condition! (Reverses the boolean value)
 */



//fun main() {

//    var a = readln()
//    var b = readln()

//    if (a == "shivam" && b == "rahul" ){
//    println("access granted")
//
//    }


//    if (a == "shivam" || b == "rahul" ){
//        println("access granted")
//    }



//    val isUserLoggedIn = false
//
//    if (!isUserLoggedIn) {
//        println("it is running")  // Executes because isUserLoggedIn is false
//    }




//}









// Comparison Operator
//fun main() {
//    val x = 5
//    val y = 10
//
//    println(x == y)  // Equal → false
//    println(x != y)  // Not Equal → true
//    println(x > y)   // Greater Than → false
//    println(x < y)   // Less Than → true
//    println(x >= y)  // Greater Than or Equal → false
//    println(x <= y)  // Less Than or Equal → true
//}









// Assignment Operator

//fun main() {
//    var num = 10

//    num += 5   // num = num + 5 → 15
//    num -= 3   // num = num - 3
//    num *= 2   // num = num * 2
//    num /= 4   // num = num / 4
//    num %= 5   // num = num % 5

//    println(num)
//}




