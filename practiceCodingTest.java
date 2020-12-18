package com.oopsw.test;


/*코딩테스트 연습
연습문제
가운데 글자 가져오기
도움말
컴파일 옵션
가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
abcde	c
qwer	we
*/

class practiceCodingTest {
    public String solution(String s) {
		String answer = "";
		int sizeCheck = s.length()%2;
		int getIndex = s.length() / 2;
		if (sizeCheck == 1 ){
			answer = s.substring(getIndex, getIndex + 1);
		}else{
			answer = s.substring(getIndex - 1, getIndex + 1);
		}
		return answer;
	}
}
/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.02ms, 51.8MB)
테스트 2 〉	통과 (0.02ms, 51.8MB)
테스트 3 〉	통과 (0.02ms, 52.7MB)
테스트 4 〉	통과 (0.02ms, 51.4MB)
테스트 5 〉	통과 (0.02ms, 54.3MB)
테스트 6 〉	통과 (0.02ms, 52MB)
테스트 7 〉	통과 (0.01ms, 53.6MB)
테스트 8 〉	통과 (0.02ms, 52.5MB)
테스트 9 〉	통과 (0.03ms, 52.4MB)
테스트 10 〉	통과 (0.02ms, 51.7MB)
테스트 11 〉	통과 (0.02ms, 52MB)
테스트 12 〉	통과 (0.02ms, 51.8MB)
테스트 13 〉	통과 (0.02ms, 51.9MB)
테스트 14 〉	통과 (0.03ms, 52.7MB)
테스트 15 〉	통과 (0.02ms, 53MB)
테스트 16 〉	통과 (0.02ms, 52.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/