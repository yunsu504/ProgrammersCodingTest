package com.oopsw.test;
/*코딩테스트 연습
연습문제
문자열 내 p와 y의 개수
도움말
컴파일 옵션
문자열 내 p와 y의 개수
문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
입출력 예
s	answer
pPoooyY	true
Pyy	false
입출력 예 설명
입출력 예 #1
'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.

입출력 예 #2
'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.*/

public class practiceCodingTest05 {

    boolean solution(String s) {
		
		boolean answer = true;
		int p = 0;
		int y = 0;
		
		for(int i = 0 ; i < s.length() ; i++){
			char getChar = s.charAt(i);
			switch(getChar){
			case 'p':	p++;	break;
			case 'P':	p++;	break;
			case 'y':	y++;	break;
			case 'Y':	y++;	break;
			}
		}
		if (p != y){
			answer = false; 
		}
        return answer;
    }
}
/*
실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.02ms, 52.8MB)
테스트 2 〉	통과 (0.02ms, 51.8MB)
테스트 3 〉	통과 (0.02ms, 52.4MB)
테스트 4 〉	통과 (0.02ms, 53.2MB)
테스트 5 〉	통과 (0.03ms, 51.9MB)
테스트 6 〉	통과 (0.02ms, 52.6MB)
테스트 7 〉	통과 (0.03ms, 52.1MB)
테스트 8 〉	통과 (0.02ms, 52MB)
테스트 9 〉	통과 (0.03ms, 52.2MB)
테스트 10 〉	통과 (0.02ms, 52.2MB)
테스트 11 〉	통과 (0.03ms, 52.1MB)
테스트 12 〉	통과 (0.02ms, 52.8MB)
테스트 13 〉	통과 (0.02ms, 53.9MB)
테스트 14 〉	통과 (0.02ms, 52.2MB)
테스트 15 〉	통과 (0.02ms, 51.8MB)
테스트 16 〉	통과 (0.02ms, 53.8MB)
테스트 17 〉	통과 (0.02ms, 52.1MB)
테스트 18 〉	통과 (0.02ms, 52.4MB)
테스트 19 〉	통과 (0.03ms, 52.3MB)
테스트 20 〉	통과 (0.02ms, 52.1MB)
테스트 21 〉	통과 (0.04ms, 52.7MB)
테스트 22 〉	통과 (0.02ms, 52.9MB)
테스트 23 〉	통과 (0.02ms, 52.4MB)
테스트 24 〉	통과 (0.03ms, 52.9MB)
테스트 25 〉	통과 (0.03ms, 52.9MB)
테스트 26 〉	통과 (0.02ms, 52.8MB)
테스트 27 〉	통과 (0.04ms, 52.4MB)
테스트 28 〉	통과 (0.02ms, 52.8MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/