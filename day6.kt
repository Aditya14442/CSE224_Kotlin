fun main(){
    //Syntax for foor loops
    
    /*
    for (item in start..end){ //end is included
        println(item)
    }
    
    //Or
    for (number in start untill end){ //end is not included
    	println(number)
    }
    */
    println("-------------------------\nFor Loops\n-------------------------")
    for (number in 1..5){
        println(number)
    }
    println("-------------------------")
    
    for (number in 1 until 5){
        println(number)
    }
    println("-------------------------")
        
    for (number in 5 downTo 1){
        println(number)
    }
    println("-------------------------")
    
    for (number in 0 until 10 step 2){
        println(number)
    }
    println("-------------------------")
    /*
    for (item in collection){
        println(item)
    }
    */
    var list : Array<String> = arrayOf("Table","Chair","Couch","Matress")
    
    for (item in list){
        println(item)
    }
    println("-------------------------")
    
    var fruits : Array<String> = arrayOf("Apple","Banana","Cherry","Date")
    for (index in fruits.indices){
        println("The fruit at index ${index} is ${fruits[index]}")
    }
    println("-------------------------")
    println("\n\n-------------------------\nWhile Loops\n-------------------------\n")
    
    //While loops
    
    var number = 5
    while (number > 0){
        println(number)
        number--
    }
    println("-------------------------")
    //Do while loops
    //In do while loop the do statement is executed first regardless of the expression being truth or false.
    //After the do block is executed once, then the while statemeent will be checked
    do{
        println(number)
        number++
    }while (number<=5)
    println("-------------------------")
    
    //Functions 
    //There are two types of functions - PreDefined and User Defined
    println("\n\n-------------------------\nFunctions\n-------------------------\n")
    /*
    fun myFunc(parameters: ParameterDataType): ReturnType{
        return result
    }
    */
    fun demo(){
        println("Hello World")
    }
    demo()
    println("-------------------------")
    
    fun square(number: Int): Int{
        return number*number
        }
    println(square(25))
    
    
}
