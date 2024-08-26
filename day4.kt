fun main() {
    var a = 11
    var b = 5
    var c : Int
    
    //Some Ways to do airthmatic operations on two variables
    //Although '+','-','*','/','%' symbols can also be used
    println("Arithmetic operators")
    c = a.plus(b)	// For addition
    println("$a + $b is equal to $c")
    
    c=a.minus(b) 	// For subtraction
    println("$a - $b is equal to $c")
    
    c=a.times(b)	// For multiplication
    println("$a * $b is equal to $c")
    
    c=a.div(b)		// For division
    println("$a / $b is equal to $c")
    
    c=a.rem(b)		// For modulus (remainder)
    println("$a % $b is equal to $c")
    
    println("----------------------")
    //-------------------------------

    
    //Comparison Operators '==' and '!='
    println("Comparison Operator")
    println("$a is equal to $b is a ${a==b} statement.")
    println("$a is not equal to $b is a ${a!=b} statement.")
    println("---------------------------------------------")
    //------------------------------------------------------


    //Relational Operators '>','<','>=','<='
    var x = 10
    var y = 15
    println("Relational Operator")
    println("$x < $y is a ${x<y} statement")
    println("$x > $y is a ${x>y} statement")
    println("$x <= $y is a ${x<=y} statement")
    println("$x >= $y is a ${x>=y} statement")
    println("-------------------------------")
    //----------------------------------------


    //Assignment operators '+=','-=','*=','/='
    println("Assignment operator")
    x+=10
    println("x+=10 is equal to ${x}\nNow x is {x}")
    x-=10
    println("x-=10 is equal to ${x}\nNow x is {x}")
    x*=10
    println("x*=10 is equal to ${x}\nNow x is {x}")
    x/=10
    println("x/=10 is equal to ${x}\nNow x is {x}")
    println("------------------------------------")
    //---------------------------------------------


    //Uranry Operators '+','-','++','--','!'
    println("Uranary Operator")
    println("+x is equal to ${+x}")
    println(x)
    println("-x is equal to ${-x}")
    println("++x is equal to ${++x}")
    println("--x is equal to ${--x}")
    println("----------------------")
    //--------------------------------
}