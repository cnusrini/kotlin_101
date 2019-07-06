//Sample tutorial to apply mapOf

fun main(args: Array<String>) {
    println("Hello, world map!")
    val countries:Map<String,Int>
     countries = mapOf (Pair ("argentina", 40000000),
                        Pair ("Spain", 46000000),
                        Pair ("uruguay", 3400000)
                       )
    lisOfAllCOuntries(countries)
    getInhabitants(countries)
    totalList(countries)
    countAllInhabitats(countries)
}

fun countAllInhabitats(countries:Map<String,Int>){
    println("sum of all inhabitants")
    var sum = 0
    countries.forEach {sum += it.value}

    println(sum)
}
fun lisOfAllCOuntries(countries:Map<String,Int>){
    println("in all of all ")
    println(countries)
}

fun getInhabitants(countries:Map<String,Int>){
    println("result from getInhabitants fn")
    val inhabitats:Int? = countries["argentina"]
    if(inhabitats != null){
    println(inhabitats)
    }
    else{
        println("no inhabitats")
    }

}

fun totalList(countries:Map<String,Int>){
    println("result from totallist fn")
    println("${countries.size}")
}
