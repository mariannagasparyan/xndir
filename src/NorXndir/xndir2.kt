package src.NorXndir

fun main() {
    val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }
    println(listOf("annna", "anna", "anastasia").sortedWith(lengthComparator))
}