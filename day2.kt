fun main(){
    var aa : Short = 20000
    var b = 10
    var bool : Boolean = true
    var sum="The sum of ${aa}a and $b is ${aa+b}. This is a ${bool} statement"
//     var name_line="Aditya\nAditya\nAditya\nAditya\nAditya\n"
    var name_line="""Aditya
Aditya
Aditya
Aditya
Aditya"""
//     var name_diagonal="Aditya\n\tAditya\n\t\tAditya\n\t\t\tAditya\n\t\t\t\tAditya\n\t\t\t\t\tAditya"
    var name_diagonal="""Aditya
    Aditya
    	Aditya
        	Aditya
            	Aditya"""
//     var name_tictactoe="\tAditya\nAditya\t\tAditya\n\tAditya"
    var name_tictactoe="""	Aditya
Aditya		Aditya
	Aditya"""
    println(sum)
    println("To use string interpolation with the variable 'MyVar' use $")
    println(name_line)
    println()
    println(name_diagonal)
    println("\n\n")
    println(name_tictactoe)
    
    
    
    
    val numbers= arrayOf(1,2,3,4,5)
    val words : Array<String> = arrayOf("Apache","Bush Baby","Cheverolet","Dementors","Eureka","Flossing","Gamma","Hectare","Intangible","Jester","Katana", "Leaver","Memento","Nemesis","Orka","Pelican","Quinine","Reverend","Satire","Tyrannosaurus","Utopia","Versace","Wobble","Xylem","Yottabyte","Zirconium")
    //Lambda Function
    var squares = Array(5) {i -> i*i}
    println(numbers[2])
    println(words[4])
    println(squares[4])
//     println(numbers)
//     print("Hello World")
}

/* Data types in kotlin are -
 * 
 * Integers ---> 
 * Byte 
 * Short
 * Int
 * Long
 * Float 
 * Double
 * 
 * Char
 * 
 * Boolean
 * 
 * String
 */