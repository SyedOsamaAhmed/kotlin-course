/*
Delegates:
For some reason we have to use multiple inheritance but kotlin allows single inheritance so we use delegates they are multiple plugins as many implementation as required
 */

interface  A{
    fun print()
}

interface B{
    fun print2()
}

class FirstDelegate:A{
    override fun print() {
        TODO("Not yet implemented")
    }

}


class SecondDelegate:B{
    override fun print2() {
        TODO("Not yet implemented")
    }

}

class App: A by FirstDelegate(),B by SecondDelegate(){
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }
}