fun main() {
    val userName = "Osama"
    val age = 32
    println(message = "Hello $userName and my age is $age!")
    /*
    Literals: value assigned to the variable
    val and var: val for readonly variable and var for reassigning variable
    */
    val minIntegerValue = Int.MIN_VALUE
    val maxIntegerValue = Int.MAX_VALUE

    println("Maximum Int Value:$maxIntegerValue, Minimum Int Value:$minIntegerValue")

    val minByteValue = Byte.MIN_VALUE
    val maxByteValue = Byte.MAX_VALUE
    println("Maximum Byte value:$maxByteValue, Minimum Byte Value:$minByteValue")

    val minShortValue = Short.MIN_VALUE
    val maxShortValue = Short.MAX_VALUE
    println("Maximum Short value:$maxShortValue, Minimum Short Value:$minShortValue")

    val minLongValue = Long.MIN_VALUE
    val maxLongValue = Long.MAX_VALUE
    println("Maximum Long value:$maxLongValue, Minimum Long Value:$minLongValue")

    val number = 2.5
    val floatNum = 0.9f
    val myChar = 'a'
    val myBool= true

    println("Float: $floatNum, Double: $number , Char: $myChar , Boolean: $myBool ")
}
