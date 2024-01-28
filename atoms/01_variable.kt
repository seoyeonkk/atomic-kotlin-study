/**
 * [atom 1~5장]
 * var, val의 차이
 * 변수 할당, 변수 타입 종류, type inference 에 대하여 다룹니다.
 */
fun main() {
    var a: Int? = null
    var b: Double = 0.1
    val c: Int = 1

    println(a) // null
        
    a = 5 // 재할당
    println("hi" + a) // hi5
    println(a + b) // 5.1

    // c = 2 // erorr (val은 재할당 X)
    // print("hi" * a) // error (type inference 불가능)
    
    val whole: Int = 11
    val fractional: Double = 1.4
    val trueOrFalse: Boolean = true
    val words: String = "A value"
    val character: Char = 'z'
    val lines: String = """Triple quotes let
    you have many lines
    in your string"""
	
    println(whole) // 11
    println(fractional) // 1.4
    println(trueOrFalse) // true
    println(words) // A value
    println(character) // z
    println(lines) // Triple quotes let
                   // you have many lines
                   // in your string

}
