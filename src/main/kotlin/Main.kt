fun main() {
    sayHello("Alexa", 28)
    val max = getMax(5, 9, 26)
    println(max)
}


fun sayHello(name: String, age: Int) {
    println("Hello $name, Your age is $age")

}

//fun getMax(a: Int, b: Int): Int {
//    val max = if (a > b) a else b;
//    return max
//}

/* function overloading is same function name with different no of parameters */
fun getMax(a: Int, b: Int) = if (a > b) a else b
fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

