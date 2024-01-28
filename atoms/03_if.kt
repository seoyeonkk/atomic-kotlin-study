/** 
 * atom 7
 * if문에 대하여 다룹니다.
 */


// boolean식 대입
fun if1() {
    val x: Boolean = 1 >= 1
    if (x)
      println("It's True")
    else
      println("It's False")
}

// !연산자
fun if2() {
    val y: Boolean = false
    if (!y)
      println("!y is true") 
}


// if문 변수 대입
fun if3() {
    val num = 10
    val result = if (num > 100) 3 else 31
    println(result)
}

// if문 함수 대입
fun OneOrTheOther(exp: Boolean): String = 
    if (exp)
      "True!"
    else
      "False!"


fun main() {
    if1() // It's True
    if2() // !y is true
    if3() // 31
    
    val x = 1
    println(OneOrTheOther(x == 1)) // True!
    println(OneOrTheOther(x == 2)) // False!
}

