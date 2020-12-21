package com.oopsw.test;
/*
 * logo
코딩테스트 연습
연습문제
문자열 내림차순으로 배치하기
도움말
컴파일 옵션
문자열 내림차순으로 배치하기
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s	return
Zbcdefg	gfedcbZ
 */
import java.util.ArrayList;
import java.util.Collections;

public class practiceCodingTest06 {

	public static void main(String[] args) {
		String s = "afAsGhtHfh";
		String answer = "";
		ArrayList<Character> upper = new ArrayList<Character>();
		ArrayList<Character> lower = new ArrayList<Character>();
		for(int i = 0 ; i < s.length() ; i ++){
		char getChar = s.charAt(i);
		boolean checkCase = Character.isUpperCase(getChar);
			if (!checkCase) {
				lower.add(getChar);
			}else{
				upper.add(getChar);
			}//if
		}//for
		Collections.sort(lower);
		Collections.sort(upper);
		Collections.reverse(lower);
		Collections.reverse(upper);	
		for(int i = 0 ; i < lower.size(); i++){
			//answer += lower.get(i).toString();
			System.out.println(lower.get(i).toString());
		}//for 
		for(int i = 0 ; i < upper.size(); i++){
			answer += upper.get(i).toString();
		}
		System.out.println(answer);
	}

}
/*
 * 실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (2.31ms, 52.7MB)
테스트 2 〉	통과 (1.90ms, 53.2MB)
테스트 3 〉	통과 (3.08ms, 53.5MB)
테스트 4 〉	통과 (2.14ms, 54.5MB)
테스트 5 〉	통과 (4.28ms, 52.2MB)
테스트 6 〉	통과 (4.36ms, 53.9MB)
테스트 7 〉	통과 (2.33ms, 51.9MB)
테스트 8 〉	통과 (2.12ms, 52.7MB)
테스트 9 〉	통과 (2.57ms, 52.6MB)
테스트 10 〉	통과 (2.57ms, 54.1MB)
테스트 11 〉	통과 (2.26ms, 52.1MB)
테스트 12 〉	통과 (2.21ms, 52.5MB)
테스트 13 〉	통과 (5.67ms, 52.2MB)
테스트 14 〉	통과 (1.92ms, 52.3MB)
테스트 15 〉	통과 (1.87ms, 53.2MB)
테스트 16 〉	통과 (1.89ms, 53MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 * */
