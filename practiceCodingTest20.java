package com.oopsw.test;
/*컴파일 옵션
짝수와 홀수
문제 설명
정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.

제한 조건
num은 int 범위의 정수입니다.
0은 짝수입니다.
입출력 예
num	return
3	Odd
4	Even*/
public class practiceCodingTest20 {
    public String solution(int num) {
        String answer = "";
        switch (num % 2){
		case 0: answer = "Even"; break;
		default: answer = "Odd"; break;
                
			}
        return answer;
    }
}
/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.02ms, 53MB)
테스트 2 〉	통과 (0.02ms, 51.9MB)
테스트 3 〉	통과 (0.02ms, 52.6MB)
테스트 4 〉	통과 (0.01ms, 53.8MB)
테스트 5 〉	통과 (0.02ms, 52.6MB)
테스트 6 〉	통과 (0.02ms, 52.7MB)
테스트 7 〉	통과 (0.03ms, 52.5MB)
테스트 8 〉	통과 (0.02ms, 52.8MB)
테스트 9 〉	통과 (0.01ms, 52.2MB)
테스트 10 〉	통과 (0.03ms, 52MB)
테스트 11 〉	통과 (0.02ms, 52MB)
테스트 12 〉	통과 (0.02ms, 52.4MB)
테스트 13 〉	통과 (0.02ms, 53.1MB)
테스트 14 〉	통과 (0.02ms, 52.1MB)
테스트 15 〉	통과 (0.01ms, 52.9MB)
테스트 16 〉	통과 (0.02ms, 52.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/