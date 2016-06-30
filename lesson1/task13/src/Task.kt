fun getList(): List<Int> {
    return arrayListOf(1, 5, 2).sort()
}

fun List<Int>.sort(): List<Int> {
    return this.sortedDescending()
}