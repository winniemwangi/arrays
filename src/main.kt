fun main() {
    arr(arrayOf("kachy","winnie","mwas"))


    var numbers = arrayOf(2, 3, 4, 5, 6, 7, 7)
    println(numbers[2])

    var name = arrayOf("winnie", "kate", "kachy")

    var country = arrayOf("Kenya", 520000, 66.95, true) //arrayOf<any>

    var names = arrayOf("abby", "Brenda", "Carol", "Diana", "Esther", "flo")
    println(names.contentToString())
    names.set(2, "christine")
    println(names.contentToString())
    println(names.get(2))
    println(names.indexOf("diana"))

    var newnames = arrayOf("winnie", "george")
    names = names.plus(newnames)
    println(names.contentToString())


    var nums = arrayOf(21, 325, 4, 79, 322, 2, 5335, 5)
    println(nums.average())
    println(nums.minOrNull())
    println(nums.maxOrNull())

    //sorting arrays

    var sortedNums = nums.sortedArray()
    println(sortedNums.contentToString())

    var nam = arrayOf("jack", "jay", "japheth", "james")
    var sortedNames = names.sortedArrayDescending()
    println(sortedNames.contentToString())

    //looping through arrays

    nums.forEach { num ->
        println(num + 100)

        println(num * num)
    }

    for (winnie in nums) {
        println(winnie)
    }

    var palces = arrayOf("Dubai", "Mumbai", "bombay", "capetown")
    for (palces in palces) {

        println(palces.capitalize())
    }

}

    //create a fun that takes in an array of names and prints each of them in uppercase

fun arr(names:Array<String>){
    names.forEach { x ->
        println(x.uppercase())
    }



}





