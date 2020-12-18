package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
나누어 떨어지는 숫자 배열
도움말
컴파일 옵션
나누어 떨어지는 숫자 배열
문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
입출력 예
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
입출력 예 설명
입출력 예#1
arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.

입출력 예#2
arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.

입출력 예#3
3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.*/

import java.util.ArrayList;
import java.util.Collections;

public class practiceCodingTest02 {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList answer = new ArrayList <Integer>();
        for(int i = 0 ; i < arr.length; i ++){
			int input = arr[i] % divisor;
			if (input == 0){
				 answer.add(arr[i]);
			}//if  		
		}//for
        
		    if (answer.size() == 0){
                answer.add(-1);
            }
            Collections.sort(answer);    
            return answer;
    }
}
/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.32ms, 53.2MB)
테스트 2 〉	통과 (0.24ms, 52.6MB)
테스트 3 〉	통과 (0.33ms, 52.4MB)
테스트 4 〉	통과 (0.28ms, 53.1MB)
테스트 5 〉	통과 (0.32ms, 53.9MB)
테스트 6 〉	통과 (2.84ms, 56.1MB)
테스트 7 〉	통과 (0.38ms, 52.5MB)
테스트 8 〉	통과 (0.27ms, 52.4MB)
테스트 9 〉	통과 (0.44ms, 54.1MB)
테스트 10 〉	통과 (0.87ms, 52.8MB)
테스트 11 〉	통과 (0.79ms, 53.1MB)
테스트 12 〉	통과 (0.29ms, 53.2MB)
테스트 13 〉	통과 (0.45ms, 53.1MB)
테스트 14 〉	통과 (0.60ms, 52.6MB)
테스트 15 〉	통과 (0.37ms, 52.2MB)
테스트 16 〉	통과 (0.36ms, 52.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/