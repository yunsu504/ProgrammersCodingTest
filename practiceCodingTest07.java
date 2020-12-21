package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
문자열 다루기 기본
도움말
컴파일 옵션
문자열 다루기 기본
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
s	return
a234	false
1234	true
 * 
 */

public class practiceCodingTest07 {
public static void main(String[] args) {
	String s = "2334";
	boolean answer = true;
	if (s.length() == 4 || s.length() == 6){
		if(s.matches(".*[a-zA-Z].*")){
			answer = false; 
		}

	}else{
		answer = false;
	}
	System.out.println(answer);
}
}
/*
실행 결과
같은 코드로 채점한 결과가 있습니다.
정확성  테스트
테스트 1 〉	통과 (0.47ms, 53.3MB)
테스트 2 〉	통과 (0.02ms, 52.3MB)
테스트 3 〉	통과 (0.44ms, 53.3MB)
테스트 4 〉	통과 (0.44ms, 52.1MB)
테스트 5 〉	통과 (0.02ms, 52.4MB)
테스트 6 〉	통과 (0.02ms, 52.1MB)
테스트 7 〉	통과 (0.01ms, 52.8MB)
테스트 8 〉	통과 (0.49ms, 52.9MB)
테스트 9 〉	통과 (0.47ms, 52.6MB)
테스트 10 〉	통과 (0.49ms, 53.2MB)
테스트 11 〉	통과 (0.44ms, 52.5MB)
테스트 12 〉	통과 (0.02ms, 52.4MB)
테스트 13 〉	통과 (0.02ms, 52.8MB)
테스트 14 〉	통과 (0.48ms, 52.8MB)
테스트 15 〉	통과 (0.43ms, 52.4MB)
테스트 16 〉	통과 (0.48ms, 52.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/