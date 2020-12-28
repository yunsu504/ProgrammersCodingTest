package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
정수 제곱근 판별
도움말
컴파일 옵션
정수 제곱근 판별
문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.
입출력 예
n	return
121	144
3	-1
입출력 예 설명
입출력 예#1
121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

입출력 예#2
3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.*/
public class practiceCodingTest18 {
	class Solution {
	    public double solution(long n) {
	        double answer = 0;
	        double d = Math.sqrt(n);
			String s = Double.toString(d);
			int nextDot = Double.toString(d).indexOf(".");
			String check = s.substring(nextDot+1);
			
			if (check.equals("0")){
			   answer = Math.pow(d+1, 2);
			}else{
				answer = -1;
			}
		
			return answer;
			
		}
	}
}
/*
실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.56ms, 53.3MB)
테스트 2 〉	통과 (0.49ms, 53.2MB)
테스트 3 〉	통과 (0.35ms, 52.4MB)
테스트 4 〉	통과 (0.60ms, 52.6MB)
테스트 5 〉	통과 (0.48ms, 52.1MB)
테스트 6 〉	통과 (0.61ms, 52.8MB)
테스트 7 〉	통과 (0.46ms, 52.8MB)
테스트 8 〉	통과 (0.52ms, 52.9MB)
테스트 9 〉	통과 (0.56ms, 52.4MB)
테스트 10 〉	통과 (0.51ms, 52.7MB)
테스트 11 〉	통과 (0.53ms, 52.1MB)
테스트 12 〉	통과 (3.00ms, 53.1MB)
테스트 13 〉	통과 (0.86ms, 53MB)
테스트 14 〉	통과 (0.49ms, 53.4MB)
테스트 15 〉	통과 (0.53ms, 52.3MB)
테스트 16 〉	통과 (2.68ms, 52.7MB)
테스트 17 〉	통과 (0.53ms, 52.2MB)
테스트 18 〉	통과 (0.80ms, 52.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/