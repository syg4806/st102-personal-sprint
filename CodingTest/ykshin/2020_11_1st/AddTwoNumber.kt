
//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/68644

/**
 * 접근방법
 * 두개의 수를 더한 결과에서 중복제거를 해야하니 set 자료구조에 더한 결과를 저장한다.
 * 만들어진 set을 정렬하고 출력형태에 맞는 IntArray로 변환하여 리턴한다.
 */

fun main(){
    class Solution {
        fun solution(numbers: IntArray): IntArray {
            val set = mutableSetOf<Int>()
            for(i in numbers.indices){
                for(j in i+1 until numbers.size){
                    set.add(numbers[i] + numbers[j])
                }
            }
            return set.sorted().toIntArray()
        }
    }
    val numbers = intArrayOf(2,1,3,4,1)
    println(Solution().solution(numbers).joinToString (" "))
}

