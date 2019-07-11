data class Car(var name: String, var price: Int)
fun main() {
    var intList: List<Int> = listOf<Int>(1,2,3) 
    wordslist(intList)
    val words = listOf("pen", "cup", "dog", "spectacles")
    val words2: List<String> = listOf<String>("pen", "cup", "dog", "spectacles")
    val words1:List<String> = listOf<String>("pen", "cup", "dog", "person","cement", "coal", "spectacles")
    val nums:List<Int> = listOf<Int>(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)
    nums(nums)
    words2(words2)
    words1(words1)
    
}
fun words1(words:List<String>){
    println("in words1")
    val first = words.first()
    val last = words.last()
    words.forEach{
        println(it)
    }
    for (item in words){
        println(item)
    }
    for (i in 0 until words.size) {

        print("${words[i]} ")
    }
    
    words.forEachIndexed{i, e -> println("words[$i] = $e")}
    println(first)
    println(last)
}
fun nums(nums:List<Int>){
    println("in numsfn")
    val count = nums.count()
    val negatives = nums.count{e->e<0}
    val geteven = nums.count{e->e%2 ==0}
    val sortedasc = nums.sorted()
    val sorteddesc =  nums.sortedDescending()
    println(sorteddesc)
    println(sortedasc)
    println(count)
    println(negatives)
    println(geteven)
}
fun wordslist(intList:List<Int>){
    println("in wordslistfn")
     val obj = Car("Mazda", 6300)
     val cars = listOf<Car>(obj)
    val count = cars.count()
    println(cars)
    println(count)
}

fun words2(words2:List<String>){
    println("in words2fn")
}