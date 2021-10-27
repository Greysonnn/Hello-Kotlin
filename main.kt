
fun main() {
    println("Hello Kotlin")
    var x: Int = 3  //declare variable
    val z: Int = 9 //Val vs. Var : let vs const in js
    println("The value of x is $x")
    x = 4
    println("The value of x is now $x")


    val wholeNumber = 3
    val bigNumber = 3L
    val preciseDecimal = 3.33
    val decimal = 3.333f
    val booleanPizza = true

    print10Number()

    val e = isEven(5)
    println(e)
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun print10Number() {
    for (i in 1..10) {
        println(i)
    }
}

