fun main() {

// For loop in enum classes:
//    for(direction in Direction.entries){
//        println(direction)
//    }

    //When in enum classes:
    when (Direction.valueOf("north".uppercase())) {
        Direction.EAST -> println("The direction is East")
        Direction.WEST -> println("The direction is West")
        Direction.NORTH -> println("The direction is North")
        Direction.SOUTH -> println("The direction is South")
    }


}

enum class Direction {
    EAST,
    WEST,
    NORTH,
    SOUTH

}
