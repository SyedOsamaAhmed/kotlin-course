
//primary Constructor:
class Car(var name: String, var model: String, var color: String){

    fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }
}


class User(var name: String,var lastName:String,var age:Int){
//    var name:String
    /*Initializer blocks are used when you have to write multiple lines of code e.g for checking validations when objects are made*/
//    init {
//        if(name.lowercase().startsWith('a')){
//            this.name=name
//        }else{
//            this.name="User"
//            println("The name doesn't start with 'a' or 'A'")
//        }
//    }

    constructor(name: String):this(name,"lastName",0)
    constructor(name:String,lastName: String):this(name,lastName,0)
}