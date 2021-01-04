package com.oopsw.test;
/*
코딩테스트 연습
연습문제
행렬의 덧셈
도움말
컴파일 옵션
행렬의 덧셈
문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
입출력 예
arr1	arr2	return
[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
[[1],[2]]	[[3],[4]]	[[4],[6]]*/

public class practiceCodingTest26 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

	int[][] answer = new int[arr1.length][arr1[1].length];
		for (int i = 0; i < arr1.length; i++ ){
			for (int j = 0; j < arr1[i].length; j++){
				  answer[i][j]+=arr1[i][j];
		       }
		   }
		       for(int i=0; i<arr2.length; i++){
		       for(int j=0; j<arr2[i].length; j++){
		          answer[i][j]+=arr2[i][j];
		       }
		   }

		return answer;
	}
}
/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.03ms, 53.9MB)
테스트 2 〉	통과 (0.09ms, 52.5MB)
테스트 3 〉	통과 (0.21ms, 52.5MB)
테스트 4 〉	통과 (0.12ms, 53.5MB)
테스트 5 〉	통과 (0.07ms, 52.5MB)
테스트 6 〉	통과 (0.12ms, 53.2MB)
테스트 7 〉	통과 (0.03ms, 51.8MB)
테스트 8 〉	통과 (0.08ms, 52.4MB)
테스트 9 〉	통과 (0.81ms, 54.2MB)
테스트 10 〉	통과 (0.62ms, 54.4MB)
테스트 11 〉	통과 (0.38ms, 53.4MB)
테스트 12 〉	통과 (0.52ms, 54.9MB)
테스트 13 〉	통과 (0.35ms, 55.4MB)
테스트 14 〉	통과 (0.51ms, 56.7MB)
테스트 15 〉	통과 (0.54ms, 57.6MB)
테스트 16 〉	통과 (0.51ms, 56.6MB)
테스트 17 〉	통과 (9.23ms, 97.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/