class Rectangle(
    val a: Double,
    val b: Double
): Shape("Rectangle") {
    init{
        println("Rectangle Created with A = $a and B = $b")
    }

    fun area() = a * b

    fun perimetre() = 2 * a + 2 * b

    fun isSquare() = a == b
}