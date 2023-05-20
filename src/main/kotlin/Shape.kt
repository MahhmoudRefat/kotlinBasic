// to make this class inherited from we use Open Keyword
open class Shape(
    var name: String
) {
    init{
        println("I am the Super Class")
    }

    fun changeName(newName: String){
        name = newName
    }
}