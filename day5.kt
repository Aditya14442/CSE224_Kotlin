fun main(){
    var temprature = 25
    if (temprature > 20){
        println("It's a warm day!")
    }
    
    var age = 18
    if (age>=18){
        println("You are an adult.")
    }
    else{
        println("You are a minor.")
    }
    
    //Task 1 : Make a Grading System
    var marks : Int = 90
    if (marks>=90){
        println("You got an 'A' grade.")
    }
    else if(marks>=85){
        println("You got a 'B' grade.")
    }
    else if(marks >=70){
        println("You got a 'C' grade.")
    }
    else{
        println("You got a 'D' grade.")
    }
    
    //Task 2 : Make a basic Calculator
    var op1 = 25
    var op2 = 5
    var op = '/'
    if (op=='+'){
        println("$op1 ${op} $op2 is equal to ${op1+op2}")
    }
    else if(op=='-'){
        println("$op1 ${op} $op2 is equal to ${op1-op2}")
    }
    else if(op=='*'){
        println("$op1 ${op} $op2 is equal to ${op1*op2}")
    }
    else if (op=='/'){
        if(op2!=0){
        println("$op1 ${op} $op2 is equal to ${op1/op2}")
        }
        else{
            println("${op1} / ${op2} is not possible. : Division by zero")
        }
    }
    else{
        println("Invalid Operator.")
    }
    
    //Task 3 : Age Classification
    var Age : Int = 20
    if (Age<13){
        println("You are a child.")
    }
    else if (age in 13..19){
        println("You are a teenager.")
    }
    else if (age in 20..64){
        println("You are an adult.")
    }
    else{
        println("You are a senior citizen.")
    }
    
    //When expression
    //When in Kotlin is equivalent to Switch statements in C/C++ or Java
    val DayOfTheWeek : Int = 2
    val DayAsString : String = when (DayOfTheWeek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        
        else -> "Invalid Day"
    }
    println("Day ${DayOfTheWeek} is ${DayAsString}")
    //'when' keyword executes the expression written after -> (If the expression before it is true) and returns the output
    
    val number : Int = 13
    when{
        number%2==0 -> println("Number ${number} is even.")
        number%2!=0 -> println("Number ${number} is odd.")
        else -> println("Unexpected Input")
    }
    
}