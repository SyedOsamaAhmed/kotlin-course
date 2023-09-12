fun main() {
//    val instance=Database.getInstance()
//    println(instance)

    println(Database)
    println(Database)
    println(Database)
    println(Database)
    println(Database)
    println(Database)

}

//Singleton pattern: only one instance of a class is allowed

//class Database private constructor() {
//    companion object {
//        private var instance: Database? = null
//        fun getInstance()
//                : Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//            return instance
//
//        }
//    }
//
//
//}

//Singleton using object declaration:

object Database{
    init {
        println("Database created successfully!")
    }
}
