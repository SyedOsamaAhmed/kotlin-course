fun main(args: Array<String>) {
//    println(sum(3, 4, 5, 6, 7, 8, 9))

    //last no included
//    for (i in 1..10) {
//        println("i= $i")
//    }

    //last number excluded and counted upwards left  side always smaller no
//    for (i in 1..<10){
//        println(i)
//    }

    //decrement in kotlin

//    for(i in 10 downTo  1){
//        println(i);
//
//    }


//    for(i in 1 until 10 step 2){
//        println(i)
//    }

    for(i in 1..10 step 3){
        println(i)

    }
}

//varargs: define as many arguments as you want i.e indefinite numbers
fun sum(vararg numbers: Int): Int {
    var result = 0
    //for in loop
//    for (number in numbers) {
//        result += number
//    }
//for each loop
    numbers.forEach {
        result += it
    }
    return result
}