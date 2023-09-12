// Enum Class: Collection of constants (Fixed set of values)

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10), SOUTH("south", 20), EAST("east", 30), WEST("west", 40);

    fun printData(){
        println("Direction = $direction and Distance = $distance")
    }
}