package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
서울에서 김서방 찾기
도움말
컴파일 옵션
서울에서 김서방 찾기
문제 설명
String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
Kim은 반드시 seoul 안에 포함되어 있습니다.
입출력 예
seoul	return
[Jane, Kim]	김서방은 1에 있다*/

public class practiceCodingTest08 {

	class Solution {
	    public String solution(String[] seoul) {
	    	String answer = "";
	        int number = 0;
			for (int i = 0 ; i < seoul.length ; i++){
	            
	            boolean b = seoul[i].equals("Kim");
	            if (b){
	                number = i;                
	            }
	        }
	        answer = "김서방은 " + number + "에 있다";
			return answer;
	    }
	}
}
/*
실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (8.31ms, 52.3MB)
테스트 2 〉	통과 (10.27ms, 52.4MB)
테스트 3 〉	통과 (7.62ms, 52.8MB)
테스트 4 〉	통과 (7.67ms, 53.1MB)
테스트 5 〉	통과 (8.28ms, 52.8MB)
테스트 6 〉	통과 (8.50ms, 52.1MB)
테스트 7 〉	통과 (8.12ms, 52.3MB)
테스트 8 〉	통과 (10.69ms, 53.4MB)
테스트 9 〉	통과 (8.37ms, 52.4MB)
테스트 10 〉	통과 (11.07ms, 52.4MB)
테스트 11 〉	통과 (7.92ms, 52.8MB)
테스트 12 〉	통과 (9.30ms, 52.4MB)
테스트 13 〉	통과 (8.23ms, 55.2MB)
테스트 14 〉	통과 (7.80ms, 53.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/