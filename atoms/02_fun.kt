/**
 * [atom 6장]
 * fun의 선언 (block body, expression body)
 * return type inference 에 대하여 다룹니다.
 */


/** 
 * block body
 * return type을 반드시 명시해줘야 함
 * 명시하지 않으면 Unit 타입으로 inference함
 */
fun multiplyByTwo(x: Int): Int {
    println("Inside multiplyByTwo")
    return x * 2
}

/** 
 * expression body
 * return type을 명시하지 않으면 반환 type inference 함
 */
fun multiplyByThree(x: Int): Int = x*3

fun main() {
    val a = multiplyByTwo(5)
    println(a) // Inside multiplyByTwo 
               // 10
    
    val b = multiplyByThree(5)
    println(b) // 15
    
}
