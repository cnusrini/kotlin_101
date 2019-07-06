/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {

    val custwithtype = mapOf<Int,String>(1 to "Mary", 2 to "Peter", 3 to "Amos",4 to "Craig")
    val custwithnotype = mapOf(1 to "Mary", 2 to "Peter", 3 to "Amos",4 to "Craig")

     for (key in custwithtype.keys)
    {
        println(custwithtype[key])
    }

    for(key in custwithtype.keys){
        println("value at key $key is ${custwithtype[key]}")

    }

    for (key in custwithnotype.keys){
        println(custwithnotype[key])
    }
    for (key in custwithnotype.keys){
        println ("value at key $key is ${custwithnotype[key]}")
    }

   val isMary:Boolean
    val isMary1:Boolean
  isMary =  custwithtype.contains(3)
    isMary1 = custwithtype.containsKey(3)

    if(isMary == true && isMary1 == true){
    println(isMary)
        println(isMary1)
    }
    else{
        println("not available")
    }

}
