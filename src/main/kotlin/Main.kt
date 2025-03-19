package org.example

//https://school.programmers.co.kr/learn/courses/30/lessons/81301
//숫자 문자열과 영단어
class Solution1 {
    fun solution(s: String): Int {
        var answer: String = s
        var list = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var listNum = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")

        for (i in list.indices) {
            if (answer.contains(list[i])) {
                answer = answer.replace(list[i], listNum[i])
            }
        }
        return answer.toInt()
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/12915
//문자열 내 마음대로 정렬하기
class Solution2 {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        answer = strings.sorted().sortedBy { it[n] }.toTypedArray()
        return answer
    }
}


//https://school.programmers.co.kr/learn/courses/30/lessons/120829
//각도기
class Solution3 {
    fun solution(angle: Int): Int {
        when (angle) {
            in 1..89 -> return 1
            in 91..179 -> return 3
            90 -> return 2
            180 -> return 4
            else -> return 0
        }
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/120831
//짝수의 합
class Solution4 {
    fun solution(n: Int): Int {
        var answer = 0
        for (n in 1..n) {
            if (n % 2 != 1) {
                answer += n
            }
        }
        return answer
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/120898
//편지
class Solution5 {
    fun solution(message: String): Int {
        return (message.length) * 2
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/134240
//푸드파이터
class Solution6 {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for (i in 1..food.size - 1) {
            val j = food[i] / 2
            if (j > 0) {
                for (k in 1..j) {
                    answer += i
                }
            }
        }
        val tmp = '0'+answer.reversed()
        answer += tmp

        return answer
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/132267
//콜라
class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        Math.ceil(1.5)
        return answer
    }
}


fun main() {
    //println(Solution().solution("one4seveneight")) //1


    /*val a : Array<String> = arrayOf("sun", "bed", "car")
    println(Solution().solution(a, 1))*/ //2

    //println(Solution().solution(4))

    val solution = Solution()
    println(solution.solution(intArrayOf(1, 3, 4, 6)))
    println(solution.solution(intArrayOf(1, 7, 1, 2)))

}


/* 양식
//
//
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        return answer
    }
}
*/
