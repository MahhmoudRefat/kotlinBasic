class Circle(
    val radius: Double
): Shape("Circle") {
    val pi = 3.141592

    init {
        println("$name Created with Radius = $radius")

        println("$name Area is ${area()}")
        println("$name Perimeter is ${perimeter()}")
    }

    fun area() = radius * radius * pi
    fun perimeter() = 2 * radius * pi
}