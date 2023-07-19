fun main() {
    var x = 5
    val y = 3


//    value affected by operator is called operand.
//    placeholder:

    /*
    perform different operations using operators
     */
    println(" x + y = ${x + y}")
    println(" x - y = ${x - y}")
    println(" x * y = ${x * y}")
    println(" x / y = ${x / y}")
    println(" x % y = ${x % y}")


    var result = x + y
    result += 2
    println(" result = $result")
    result -= 2
    println(" result = $result")
    result *= 2
    println(" result = $result")
    result /= 2
    println(" result = $result")
    result %= 6
    println(" result = $result")

//learnt operator precedence
    println(" 3 + 3 * 4 = ${(3 + 3) * 4}")

    //Increment and Decrement operators:
    x = 2
    println(" x = ${x++}")
    println(" x = ${++x}")

    println(" x = ${x--}")
    println(" x = ${--x}")
}
