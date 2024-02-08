/*
 * 클래스의 생성자
 * 기본생성자와 보조생성자에 대하여 다룹니다.
 */

fun main() {
    var a = Person("권서연", 1997)
    var b = Person("권재림", 1995)
    
    var c = Person("조예은")    
    var d = Person("김지연")
}


class Person (var name: String, val birthYear: Int) {
    // 기본 생성자
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.") 
    }
    
    // 보조 생성자
    constructor(name: String) : this(name, 1996) {
        println("보조 생성자가 사용되었습니다.")
    }
}



// ==========================
// 1997년생 권서연님이 생성되었습니다.
// 1995년생 권재림님이 생성되었습니다.
// 1996년생 조예은님이 생성되었습니다.
// 보조 생성자가 사용되었습니다.
// 1996년생 김지연님이 생성되었습니다.
// 보조 생성자가 사용되었습니다.
