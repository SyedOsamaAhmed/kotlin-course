fun main() {
    val names= arrayOf("John","Natalia","Kim")
    val numbers= arrayOf(4,5,6,7,"Beetle",'v')
    names[2]="Alexa"
    println("Last name = ${names[2]}")
    println("Array size is: ${names.size}")

    for (name in names){
        println(name)
    }

    for (i in numbers){
        println(i)
//        if(i is Int)println(i)
    }
}