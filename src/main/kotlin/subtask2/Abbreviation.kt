package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var contains = true
        val right = mutableListOf<Int>()
        val aUpp = a.toUpperCase()
        val bChar = b.toCharArray()


        for (i in b.indices) {
            aUpp.contains(bChar[i])
                .apply {
                    if (!this) contains = this
                    else right.add(aUpp.indexOf(bChar[i]))
                }
        }
        return when {
            !contains -> "NO"
            right.size != b.length -> "NO"
            right == right.sorted() -> "YES"
            else -> "NO"
        }
    }
}