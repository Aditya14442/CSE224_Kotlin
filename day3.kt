fun main() {
    var array : Array<Int> = arrayOf(3,3,9,1,4,2,6,5,0)
    for (num in array){
        print(num.toString()+' ')
    }
    print("\n\n")
    
    
    //Multi Dimentional Arrays
    var multiDimArray : Array<Array<Int>> = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))
    for (i in multiDimArray){
        for (j in i){
            print(j.toString()+' ')
        }
        print('\n')
    }
    
    //To cast a variable on the spot use .toType() method. (For example : .toString() .toInt() .toBoolean())
    var x : Int = 100
    var y : Long = x.toLong()
    println(y)
    
    //Safecasting : Done using 'as?' keyword. Returns null of cast is not possible
    //Unsafe casting : Done using 'as' . Throws ClassCastException if casting fails.
    val a = "hi"
    val b: String = a as String
    println("Unsafe Case Result: $b")
    
    var d : Int? = a as? Int
    if(d!=null){
        println("Safe cast done. Result = $d")
    }
    else{
        println("Safe casting failed :( ")
    }
}