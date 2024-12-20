package collections_OOP


fun main() {
    val map : HashMap <Char,Int> = HashMap()
    val s = "This is a Sample String"
    for (i in s) {
        if (i == ' ') continue
        else if(!map.containsKey(i)){
            map[i] = 1
        }

        else{
                map[i] = map[i]!! + 1
        }

    }
    println(map)
}