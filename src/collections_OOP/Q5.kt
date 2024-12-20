package collections_OOP


fun main() {
    val map : HashMap <Char,Int> = HashMap()
    val s = "This is a Sample String"
    for (i in s) {
        if(map.containsKey(i)){
            map.put(i,0)
        }
        else{
            val temp:Int = map.get(i)!!
            map.put(i,temp+1)
        }

    }


}