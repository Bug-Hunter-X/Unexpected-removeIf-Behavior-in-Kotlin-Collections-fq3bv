fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeAll { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeAll { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map.entries.removeIf { it.key > 2 }
    println(map) // Output: {1=one, 2=two}
}

//Using removeAll provides consistent behavior across different collection types.