import java.util.TreeMap

fun main() {

    val nameValue = readLine()
//    val name = "Sachin"
    val name = nameValue
    name?.forEachIndexed { index, char ->
        println("Index =$index Char = $char")
    }

//    val example = "A2 + B2"
//    val spannableString = SpannableStringBuilder text se h ye


    val array = arrayOf(1, 2, 3, 4)
    val mixArray = arrayOf<Any>(1, 2, 3, 4.0, 5f, true, false, "HelloJi", "OmNamhaShivay")

    val array3 = Array(4, { i -> i + 1 })
    val array4 = Array(4) { i -> i * 2 }

    println(array3.toList().toString())
    println(array4.toList().toString())

    val set = setOf(1, 2, 3, 1, 2, 3)
    val set1 = hashSetOf(1, 2, 3, 1, 2, 3)
    println(set)
    println(set1)

    //set.add(4)
    set1.add(4)

    println(set.elementAt(set.size - 1))
    println(set.elementAt(0))
    println(set1.elementAt(set.size - 1))
    println(set1.elementAt(0))


    val hashMap = hashMapOf<Char, Int>()
    val map = java.util.LinkedHashMap<Char, Int>()
    "hashMapS".forEach {
        hashMap.put(it, "hashMapS".count { char -> char == it })
        map.put(it, "hashMapS".count { char -> char == it })
    }

    println(hashMap.toString())
    println(map.toString())

    println("======")
    println( isAnagram("anagram", "nagaram"))
}

private fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false

    val hashMapS = hashMapOf<Char,Int>()
    val hashMapT = hashMapOf<Char,Int>()

    for(i in s.indices){
        hashMapS[s[i]] = 1+hashMapS.getOrDefault(s[i],0)
        hashMapT[t[i]]= 1+hashMapT.getOrDefault(t[i],0)
    }

    hashMapS.keys.forEach {
        if(hashMapS.get(it) != hashMapT.getOrDefault(it,0)) return false
    }
    return true
}