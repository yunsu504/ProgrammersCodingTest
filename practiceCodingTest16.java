package com.oopsw.test;
/*
 * logo
코딩테스트 연습
연습문제
자연수 뒤집어 배열로 만들기
도움말
컴파일 옵션
자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]*/
 
public class practiceCodingTest16 {

	public static void main(String[] args) {
		long n = 12345;
		String s = String.valueOf(n);
		int[] answer = new int[s.length()];
		for (int i = s.length()-1, j=0 ; i >= 0; i--,j++){
			int a = Integer.parseInt(String.valueOf(s.charAt(i)));
			answer[j] = a;
		}
	}

}
/*
실행 결과
같은 코드로 채점한 결과가 있습니다.
정확성  테스트
테스트 1 〉	통과 (0.05ms, 52.1MB)
테스트 2 〉	통과 (0.04ms, 52.1MB)
테스트 3 〉	통과 (0.03ms, 52.1MB)
테스트 4 〉	통과 (0.05ms, 52.6MB)
테스트 5 〉	통과 (0.05ms, 52.6MB)
테스트 6 〉	통과 (0.05ms, 52.9MB)
테스트 7 〉	통과 (0.05ms, 52.2MB)
테스트 8 〉	통과 (0.05ms, 52MB)
테스트 9 〉	통과 (0.04ms, 51.6MB)
테스트 10 〉	통과 (0.05ms, 52.7MB)
테스트 11 〉	통과 (0.03ms, 52MB)
테스트 12 〉	통과 (0.05ms, 52.4MB)
테스트 13 〉	통과 (0.05ms, 51.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/