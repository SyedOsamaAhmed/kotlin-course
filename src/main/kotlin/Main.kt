fun main() {
    val alarm = 8

//    when(alarm){
//        in 1..10-> println("Number is in range 1-10")
//        12,6,14-> println("The time is $alarm")
//        else->println("The time is $alarm")
//    }
//    val text =
//        when {
//            !(alarm <= 10) -> "Number is in range 1-10"
//            alarm == 8 || alarm == 9 -> "the time is $alarm"
//            else -> "Time is $alarm"
//        }
//    println(text)
    var name:String?= null
    println(name?.length)
    name="the variable is not null"
    val text2=name?:"The variable is null"
    println(text2)


}