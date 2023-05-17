import kotlin.time.times

fun main(args: Array<String>) {

    println("enter the number of friend ")
    var n = readln()?.toInt()
    var h = readln()?.toInt()
    var temp = 0
    if (h != null && n != null) {
        for (i in 1..n) {
            var friendsHeight = readln()?.toInt()
            if (friendsHeight != null) {
                if (friendsHeight > h) {
                    temp += 2
                } else
                    temp += 1
            }
        }
    }
    println(temp)
}

fun fib(n: Int): Int {
    if (n <= 2) return 1
    else return fib(n - 1) + fib(n - 2)
}


fun printsum(snum: Int, endnum: Int) {
    var sum = 0
    for (i in snum..endnum) {
        sum += i
    }
    println(sum)
}


/*
    var country = readLine()
    when (country) {
        "usa" -> println("hello")
        "egypt" -> println("marhaba")
        else -> println("i don't know ")
    }
*/

/*   var list = mutableListOf<Int>()
   for (i in 1..5) {
       val x = readLine()?.toInt()
       if (x != null) {
           list.add(x)
       }
   }
   println(list.asReversed())
*/
/*   var avg = 0.0
   for (i in 1..5){
       var input = readLine()?.toInt()
       if (input != null){
           avg += input / 5.0
       }
   }
println("the avarage is $avg")

*/
/*   var userinput = readLine()?.toInt()
   var sum = 0
   var arraylegnth = userinput
   if (userinput != null) {
       for (i in *//**//*userinput) {
            sum += userinput[i]
        }
    }
    var avarage = sum / userinput.length
    println(userinput)
*/
/* var myArray = arrayOf(10,5,20,5,10,10)
 var sum = 0
 for (i in myArray)
 {
     sum += i
 }
 print(sum)*/


/*var myArray = arrayOf(10,15,20,50,30,250,80)
    var max = myArray[0]
    for (item in myArray)
    {
        if(item > max)
        {
            max = item
        }
    }
    print(max)*/

/* println("please Enter the first number ")
 var number = readLine()?.toInt()
 println("please Enter the secon number ")
 var power = readLine()?.toInt()
 var temp = 1
 while(power!! > 0 )
 {
     temp *= number!!
     power--
 }
 println(temp)
*/
/* var num = readlnOrNull()?.toInt()
 if (num != null ){
 while (num >= 0 )
 {
  println(num)
  num--
 }
 }*/
/*
    println("please enter ur age ")
    var age = readlnOrNull()?.toInt()
    if (age != null) {
        if (age >= 0 && age <= 18)
            println("You are not an adult ")
        else if (age in 19..64)
            println("You are adult ")
        else if (age > 65)
            println("u are really old ")
        else
            println("enter a valid number ")
    }*/
/*
  var s = readLine()
  println(s?.uppercase())
*/


/*var a = if (2 < 3 ) 6 else 10
println(a)*/


/*  var s = "ahmed"
  println("the string is $s")
if ( s == s.reversed() )
  println("the String $s is a palindrome ")*/

/* var  x =  4
var y = 4
var  z =  7
var b = 8 */

// println( !( x == y || z ==b ) )
/*
  val simple = 3 >4 || 4 > 3 && 4 <= 4

  val bool = true
  val x = 9
  val y = 3
  val z = 9

  val hard = !(x != z ) && bool || z > (x + y ) && (!bool || y < z )
*/
/* var x = 3
   var y = 4
   var z = 5
   println(" the x value os $x" )
   println("the result of x + y : ${x + y }" )
   println(z )

 val pi = 3.14159265359
 var raduis = 5.5F
 println("the raduios = ${0.75* pi * pow(5.5,3.0) }")


 var string = "mahmoud "
 println("out string ${string.uppercase()}")
 println("out string ${string.reversed()}")
 */
