/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {

    val products:Map<String,Double>
     products = mapOf (Pair ("apple", 4.0),
                        Pair ("orange", 4.6),
                        Pair ("grap", 3.3),
                        Pair ("blueberry", 1.3),
                        Pair ("strawberry", 3.2)
                       )
    totalproducts(products)
    pricegreaterthanfour(products)
}

fun pricegreaterthanfour(products:Map<String,Double>){
    println("pricegreaterthanfour")
    val count = products.count{it.value > 4.0}
    println("$count")
}
fun totalproducts(products:Map<String, Double>){
    println("prints total number of products")
    println("${products.size}")
    println("list all products")
    println(products)
}
