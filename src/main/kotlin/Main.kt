fun main() {
    sayHello("Alexa", 28)
}


fun sayHello(name: String, age: Int) {
    println("Hello $name, Your age is $age")
    val max = getMax(5, 9)
    println(max)
}

//fun getMax(a: Int, b: Int): Int {
//    val max = if (a > b) a else b;
//    return max
//}

fun getMax(a: Int,b:Int):Int =if (a>b) a else b