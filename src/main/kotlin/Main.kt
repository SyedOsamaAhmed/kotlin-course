fun main() {
    val names = arrayOf("John", "Natalia", "Kim")
    val mixedElements = arrayOf(4, 5, 6, 7, "Beetle", 'v')
    names[2] = "Alexa"
//    println("Last name = ${names[2]}")
//    println("Array size is: ${names.size}")

//    for (name in names){
//        println(name)
//    }

    for (i in mixedElements){

        if(i is Int)println(i)
        if(i is String) println(i)
    }
    val numbers = arrayOf(20,30,50,100,239)
    println(getMaxAndMin(numbers,true))
    println(getMaxAndMin(numbers,false))

}

fun getMaxAndMin(numbers: Array<Int>, searchMax: Boolean): Int {
    var max = numbers[0]
    var min = numbers[0]

    return if(searchMax){
        for(number in numbers){
            if(number>max)max=number
        }
        max
    }else{
        for (number in numbers){
            if(number<min)min=number
        }
        min
    }
}
