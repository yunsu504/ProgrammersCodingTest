package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
콜라츠 추측
도움말
컴파일 옵션
콜라츠 추측
문제 설명
1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.

1-1. 입력된 수가 짝수라면 2로 나눕니다. 
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.

제한 사항
입력된 수, num은 1 이상 8000000 미만인 정수입니다.
입출력 예
n	result
6	8
16	4
626331	-1
입출력 예 설명
입출력 예 #1
문제의 설명과 같습니다.

입출력 예 #2
16 -> 8 -> 4 -> 2 -> 1 이되어 총 4번만에 1이 됩니다.

입출력 예 #3
626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴해야합니다.*/
public class practiceCodingTest22 {
	class Solution {
	    public int solution(double num) {
	        int answer = 0;
	        while (num != 1){ 
	                if (num % 2 == 0){
	                    num = num / 2; 
	                    answer ++;
	                }else{
	                    num = num * 3 + 1;
	                    answer ++;
	                }
	                if (answer == 500){
	                    answer = -1; break;
	                }
	                
	        }
	        return answer;    
	    }       
	}
}
	/*실행 결과
	채점을 시작합니다.
	정확성  테스트
	테스트 1 〉	통과 (0.03ms, 52MB)
	테스트 2 〉	통과 (0.05ms, 52.4MB)
	테스트 3 〉	통과 (0.04ms, 52.9MB)
	테스트 4 〉	통과 (0.03ms, 52.9MB)
	테스트 5 〉	통과 (0.08ms, 52MB)
	테스트 6 〉	통과 (0.03ms, 52.1MB)
	테스트 7 〉	통과 (0.10ms, 52.3MB)
	테스트 8 〉	통과 (0.03ms, 51.6MB)
	테스트 9 〉	통과 (0.03ms, 52.9MB)
	테스트 10 〉	통과 (0.09ms, 52.2MB)
	테스트 11 〉	통과 (0.08ms, 52.6MB)
	테스트 12 〉	통과 (0.02ms, 52.6MB)
	테스트 13 〉	통과 (0.02ms, 53.1MB)
	테스트 14 〉	통과 (0.03ms, 52MB)
	테스트 15 〉	통과 (0.03ms, 52.4MB)
	테스트 16 〉	통과 (0.03ms, 54.1MB)
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0*/