package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
제일 작은 수 제거하기
도움말
컴파일 옵션
제일 작은 수 제거하기
문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]*/
import java.util.Arrays;

public class practiceCodingTest19 {

	public static void main(String[] args) {
		
		int[] arr  = {1,5,7,3,2,6};
		int[] answer = new int[arr.length-1];
		
		int arr1 = arr[0];
		if (arr.length == 1){
			answer = new int[]{-1};
		}else{
			int tmp = arr[0];//4
			for (int i = 1, j = 0 ; i < arr.length && j <arr.length-1 ; i++, j++){
				if( arr[i] > tmp ){//3>4
					answer[j] = arr[i];
				}else{
					answer[j] = tmp;
					tmp = arr[i]; 
									
				}
				
			}
		for (int i = 0 ; i < answer.length; i++){
			System.out.println(answer[i]);
		}
			
		
		}
	}
}
/*
실행 결과
같은 코드로 채점한 결과가 있습니다.
정확성  테스트
테스트 1 〉	실패 (1.56ms, 61.1MB)
테스트 2 〉	실패 (0.03ms, 52.5MB)
테스트 3 〉	실패 (0.05ms, 53.2MB)
테스트 4 〉	실패 (0.03ms, 53.1MB)
테스트 5 〉	실패 (0.02ms, 52.2MB)
테스트 6 〉	실패 (0.05ms, 52.4MB)
테스트 7 〉	실패 (0.08ms, 52.3MB)
테스트 8 〉	통과 (0.01ms, 52MB)
테스트 9 〉	실패 (0.02ms, 51.8MB)
테스트 10 〉	실패 (0.02ms, 52.6MB)
테스트 11 〉	통과 (0.03ms, 52.3MB)
테스트 12 〉	실패 (0.02ms, 51.8MB)
테스트 13 〉	실패 (0.03ms, 53MB)
테스트 14 〉	실패 (0.06ms, 52.5MB)
테스트 15 〉	실패 (0.03ms, 51.6MB)
테스트 16 〉	실패 (0.05ms, 52.6MB)
채점 결과
정확성: 12.5
합계: 12.5 / 100.0*/