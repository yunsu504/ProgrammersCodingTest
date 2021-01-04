package com.oopsw.test;

import java.util.Scanner;
/*
코딩테스트 연습
연습문제
직사각형 별찍기
도움말
컴파일 옵션
직사각형 별찍기
문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

제한 조건
n과 m은 각각 1000 이하인 자연수입니다.
예시
입력

5 3
출력

*****
*****
******/
public class practiceCodingTest28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         String row = "";
	     for (int i = 0; i < a ; i ++){
		  	row += "*";
		 }		
		 for (int i = 0; i < b ; i++){
		   	System.out.println(row);
		 }
        
    }
}
/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (220.49ms, 48.4MB)
테스트 2 〉	통과 (221.82ms, 48.3MB)
테스트 3 〉	통과 (217.66ms, 49.2MB)
테스트 4 〉	통과 (244.93ms, 49.6MB)
테스트 5 〉	통과 (240.70ms, 51MB)
테스트 6 〉	통과 (245.22ms, 48.8MB)
테스트 7 〉	통과 (208.29ms, 48.6MB)
테스트 8 〉	통과 (229.86ms, 49MB)
테스트 9 〉	통과 (228.76ms, 49.3MB)
테스트 10 〉	통과 (228.97ms, 50.2MB)
테스트 11 〉	통과 (231.73ms, 49.5MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/