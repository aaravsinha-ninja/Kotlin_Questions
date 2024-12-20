package null_safety
fun uc( s : String? ) : String {
    val up :String = s?.uppercase()?:"Empty"
    return up
}
fun main() {
    val s : String? = null
    val result = uc(s)
    println(result)
}