import kotlin.random.Random

class Rectangle(val a: Double, val b: Double): Shape("Rectangle") {
    init{
        println("Rectangle Created with A = $a and B = $b")
    }
companion object{
    fun randomrec():Rectangle{
        val a = Random.nextDouble(1.0,10.0)
        val b = Random.nextDouble(1.0,10.0)
        return Rectangle(a,b)
    }
}
    fun area() = a * b

    fun perimetre() = 2 * a + 2 * b

    fun isSquare() = a == b
}