package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
소수 찾기
도움말
컴파일 옵션
소수 찾기
문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환*/
public class practiceCodingTest09 {
	
	public static void main(String[] args) {
		int n = 5;
		int count = 0;
		boolean[] check = new boolean[n+1]; //false가 default
		check[0] = true; check[1] = true;
		for(int i = 2; i <= n; i++ ){ //소수가 아닌얘들은 True
			if (check[i] == false){
				for (int j = 2; j <= n / i; j++){
					if (check[i*j] == false){
						check[i*j] = true;
					}
				}
			}
		}for (int i = 2; i <= n; i++){
			if (check[i] == false){
				count ++;
			}
		}System.out.println( count);
	}

}
/*
 * 실행 결과
같은 코드로 채점한 결과가 있습니다.
정확성  테스트
테스트 1 〉	통과 (0.02ms, 52.3MB)
테스트 2 〉	통과 (0.04ms, 52.6MB)
테스트 3 〉	통과 (0.07ms, 52.9MB)
테스트 4 〉	통과 (0.14ms, 51.8MB)
테스트 5 〉	통과 (0.11ms, 54.1MB)
테스트 6 〉	통과 (1.12ms, 52.4MB)
테스트 7 〉	통과 (0.30ms, 52.2MB)
테스트 8 〉	통과 (0.77ms, 53.5MB)
테스트 9 〉	통과 (0.77ms, 52.2MB)
테스트 10 〉	통과 (11.72ms, 52.3MB)
테스트 11 〉	통과 (20.69ms, 53.8MB)
테스트 12 〉	통과 (18.77ms, 52.3MB)
효율성  테스트
테스트 1 〉	통과 (33.76ms, 54.2MB)
테스트 2 〉	통과 (25.66ms, 53.2MB)
테스트 3 〉	통과 (22.23ms, 53.9MB)
테스트 4 〉	통과 (22.10ms, 52.6MB)
채점 결과
정확성: 75.0
효율성: 25.0
합계: 100.0 / 100.0*/
