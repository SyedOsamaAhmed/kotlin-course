fun main() {
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

//    for(i in 1..10 step 3){
//        println(i)
//
//    }

    //while loop:
    var number=0

//    while(number<10){
//        number++
//       if(number==7)continue
//        if(number==7)break
//        println(number)
//
//    }

//    for (i in 1..10) {
//     if(i in 3..7)continue
//        if (i == 7) break
//        println(i)
//    }

    //do while loop:
//    do {
//        println(number)
//    }while (number<10)


    //nested loops:
    outer@ while (number<5){
        number++
        println(number)

        var i=0
        while (i<5){
            println("*** $i")
            i++
        }
    }
}

//varargs: define as many arguments as you want i.e indefinite numbers
//fun sum(vararg numbers: Int): Int {
//    var result = 0
//    //for in loop
////    for (number in numbers) {
////        result += number
////    }
////for each loop
//    numbers.forEach {
//        result += it
//    }
//    return result
//}