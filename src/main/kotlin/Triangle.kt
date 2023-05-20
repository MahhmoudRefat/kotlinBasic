import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
): Shape("Triangle") {
    init {
        println("the $name Sides Provided is: A = $a, B = $b, C = $c")
        println("the $name Area is: ${area()}")
        println("the $name Perimeter is: ${perimeter()}")
    }

    fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))
    fun perimeter() = a + b + c
}

