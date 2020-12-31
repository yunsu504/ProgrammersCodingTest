package com.oopsw.test;
/*
코딩테스트 연습
연습문제
평균 구하기
도움말
컴파일 옵션
평균 구하기
문제 설명

정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
입출력 예
arr	return
[1,2,3,4]	2.5
[5,5]	5*/
public class practiceCodingTest23 {
	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        double sum = 0;
	        for ( int i = 0 ; i < arr.length; i++){
	           sum += arr[i];
	        }
	        answer = sum / arr.length;
	        return answer;
	    }
	}
}
	/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.03ms, 53.4MB)
테스트 2 〉	통과 (0.02ms, 52.8MB)
테스트 3 〉	통과 (0.02ms, 52.1MB)
테스트 4 〉	통과 (0.02ms, 53.3MB)
테스트 5 〉	통과 (0.02ms, 52.2MB)
테스트 6 〉	통과 (0.02ms, 52.9MB)
테스트 7 〉	통과 (0.03ms, 53.1MB)
테스트 8 〉	통과 (0.02ms, 52.4MB)
테스트 9 〉	통과 (0.01ms, 52.6MB)
테스트 10 〉	통과 (0.02ms, 53MB)
테스트 11 〉	통과 (0.02ms, 52.9MB)
테스트 12 〉	통과 (0.02ms, 52.6MB)
테스트 13 〉	통과 (0.02ms, 52.3MB)
테스트 14 〉	통과 (0.02ms, 52.9MB)
테스트 15 〉	통과 (0.02ms, 52MB)
테스트 16 〉	통과 (0.03ms, 52.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/