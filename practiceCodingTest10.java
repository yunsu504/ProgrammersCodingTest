package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
수박수박수박수박수박수?
도움말
컴파일 옵션
수박수박수박수박수박수?
문제 설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	수박수
4	수박수박*/
public class practiceCodingTest10 {
	class Solution {
	    public String solution(int n) {
			int count = n / 2;
			int number = n % 2;
			
			StringBuilder answer = new StringBuilder();
			for (int i = 1; i <= count; i++ ){
				answer.append("수박");
			}
			if (number == 1){
				answer.append("수");
			}
			return answer.toString();
	    }
	}
}
/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.13ms, 53.1MB)
테스트 2 〉	통과 (0.18ms, 52.7MB)
테스트 3 〉	통과 (0.20ms, 53.2MB)
테스트 4 〉	통과 (0.38ms, 52.2MB)
테스트 5 〉	통과 (0.22ms, 52.5MB)
테스트 6 〉	통과 (0.05ms, 52.2MB)
테스트 7 〉	통과 (0.08ms, 52.7MB)
테스트 8 〉	통과 (0.07ms, 53MB)
테스트 9 〉	통과 (0.07ms, 52.3MB)
테스트 10 〉	통과 (0.07ms, 52.4MB)
테스트 11 〉	통과 (0.08ms, 52.6MB)
테스트 12 〉	통과 (0.08ms, 52.5MB)
테스트 13 〉	통과 (0.11ms, 51.8MB)
테스트 14 〉	통과 (0.08ms, 52.3MB)
테스트 15 〉	통과 (0.66ms, 53.1MB)
테스트 16 〉	통과 (0.09ms, 52.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/