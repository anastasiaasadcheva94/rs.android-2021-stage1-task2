package subtask2

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        val arrA = a.toUpperCase().toCharArray()
        val arrB = b.toUpperCase().toCharArray()
        return if (arrA.intersect(arrB.toList()).toCharArray().contentEquals(arrB)) "YES" else "NO"
    }
}
