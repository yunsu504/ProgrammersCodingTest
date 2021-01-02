package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
핸드폰 번호 가리기
도움말
컴파일 옵션
핸드폰 번호 가리기
문제 설명
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 4 이상, 20이하인 문자열입니다.
입출력 예
phone_number	return
01033334444	*******4444
027778888	*****8888*/
public class practiceCodingTest25 {

	class Solution {
	    public String solution(String phone_number) {
	    int beginIndex = phone_number.length() - 4;
		String answer = "";
			for (int i = 0; i < beginIndex ; i++){
				answer += "*";
			}
			answer += phone_number.substring(beginIndex);
	        return answer;
	    }
	}
}
/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (2.67ms, 52.2MB)
테스트 2 〉	통과 (2.94ms, 52.6MB)
테스트 3 〉	통과 (2.51ms, 52.1MB)
테스트 4 〉	통과 (2.46ms, 52.9MB)
테스트 5 〉	통과 (2.55ms, 52.9MB)
테스트 6 〉	통과 (1.79ms, 52MB)
테스트 7 〉	통과 (9.57ms, 52.4MB)
테스트 8 〉	통과 (2.83ms, 53.1MB)
테스트 9 〉	통과 (1.57ms, 52.7MB)
테스트 10 〉	통과 (2.44ms, 52.4MB)
테스트 11 〉	통과 (2.68ms, 52.3MB)
테스트 12 〉	통과 (2.52ms, 52.4MB)
테스트 13 〉	통과 (2.70ms, 52.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/