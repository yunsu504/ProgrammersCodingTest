package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
정수 내림차순으로 배치하기
도움말
컴파일 옵션
정수 내림차순으로 배치하기
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211*/
import java.util.ArrayList;
import java.util.Collections;

public class practiceCodingTest17 {
	 public long solution(long n) {
	     String s = String.valueOf(n);
			int size = (int)Math.log10(n)+1;
			String b  = "A";
			
			ArrayList<Character> list =  new ArrayList<Character>();
			
			for (int i = 0 ; i < size ; i ++){
				list.add(s.charAt(i));
			}
			Collections.sort(list);
			Collections.reverse(list);
			for (int i = 0 ; i < size ; i ++){
			b += Character.toString(list.get(i));
			}
			long answer = Long.parseLong(b.substring(1));
			return answer;
		}
	}

/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (2.00ms, 52.2MB)
테스트 2 〉	통과 (1.78ms, 52.3MB)
테스트 3 〉	통과 (1.74ms, 52.7MB)
테스트 4 〉	통과 (1.84ms, 53MB)
테스트 5 〉	통과 (1.85ms, 52.4MB)
테스트 6 〉	통과 (1.85ms, 53.3MB)
테스트 7 〉	통과 (1.73ms, 53.1MB)
테스트 8 〉	통과 (1.83ms, 53.9MB)
테스트 9 〉	통과 (2.34ms, 54.1MB)
테스트 10 〉	통과 (1.85ms, 52.7MB)
테스트 11 〉	통과 (1.99ms, 52.5MB)
테스트 12 〉	통과 (1.91ms, 53.4MB)
테스트 13 〉	통과 (2.01ms, 52.7MB)
테스트 14 〉	통과 (1.91ms, 52.4MB)
테스트 15 〉	통과 (1.90ms, 52.5MB)
테스트 16 〉	통과 (2.00ms, 52.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/