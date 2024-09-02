//main function is all the way at the end...

//Syntax for declaration of function
/*
 * fun name(arg1: arg1_datatype, arg2: arg2_datatype,..., argN: argN_datatype): return_datatype{
 * //Block of code goes here
 * }
 * 
 */
//If return datatype is not given, Kotlin.Unit datatype is assumed as return datatype
fun sum(num1: Int , num2 : Int) : Int{
    return num1+num2
}

//Function with default arguments
//If default arguments are not provided and the function is called without any arguments, an error will be raised.
fun areaOfCircle(radius: Int = 1) : Double{
    val pi = 3.14159
    var area = pi*radius*radius
    return area
}


//Task 1

fun celsiusToFahrenheit(celsius: Double): Double{
    return (celsius*1.8)+32
}

fun fahrenheitToCelsius(fahrenheit: Double): Double{
    return (fahrenheit-32)/1.8
}

//Recursion
fun factorial(num : Int): Int{
    return if(num<=1) 1 else num*factorial(num-1)
}

//To-do Fibonacci Sequence
fun fibonacci(n : Int, num1: Int = 0, num2: Int = 1){
    if (n <0){
        return
    }
    print(num1.toString()+' ')
    var temp = num1
    var n1 = num2
    var n2 = num1+num2
    fibonacci(n-1,n1,n2)
}

fun main(){
    var radius = 12
    
    //The below line will throw an error (commented out)
    //println("${sum()}")
    var num1 = 10
    var num2 = 15
    println("The sum of $num1 and $num2 is ${sum(num1,num2)}.")
    println("The are of a unit circle is ${areaOfCircle()}.")
    println("The area of a circle of radius $radius is ${areaOfCircle(radius)}.")
    
    var celsius : Double = 37.0
    println("${celsius} degrees celsius in fahrenheit is ${celsiusToFahrenheit(celsius)}.")
    var fahrenheit : Double = 98.6
    println("${fahrenheit} fahrenheit in degrees celsius is ${fahrenheitToCelsius(fahrenheit)}.")
    var num = 5
    println("Factorial of ${num} is ${factorial(num)}.")
    fibonacci(15)
}