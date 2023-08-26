fun main() {
    val car=Car()
    car.name="Honda Accord"
    car.color="black"
    car.model="honda"

    println("Name: ${car.name}, model: ${car.model}, color: ${car.color}")

    car.move()
    car.stop()

    var car2=Car()
    car2.name="vitz"
    car2.model="Japan"
    car2.color="royal blue"

    println("\nName: ${car2.name}, model: ${car2.model}, color: ${car2.color}")
    car2.move()
    car2.stop()

}

class Car{
    var name=""
    var model=""
    var color=""

    fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }
}