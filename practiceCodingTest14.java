package com.oopsw.test;
/*logo
코딩테스트 연습
연습문제
이상한 문자 만들기
도움말
컴파일 옵션
이상한 문자 만들기
문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
입출력 예
s	return
try hello world	TrY HeLlO WoRlD
입출력 예 설명
try hello world는 세 단어 try, hello, world로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다. 따라서 TrY HeLlO WoRlD 를 리턴합니다.*/
class Converter{
	public char converter(char c1, int index){
		//char = 2(소문자영어), 1(대문자) 5(한국어)  int= 15 special = 26  ' '=12
		if (Character.getType(c1) == 1 || Character.getType(c1) == 2){
			switch (index % 2){
			case 0: //짝수
				practiceCodingTest14.answer += Character.toUpperCase(c1);
				practiceCodingTest14.index ++;
				break;
			case 1: //홀수
				practiceCodingTest14.answer += Character.toLowerCase(c1);
				practiceCodingTest14.index ++;
				break;
			}
		}else if(Character.getType(c1) == 12){
			practiceCodingTest14.index = 0;
			practiceCodingTest14.answer += ' ';
		}else{
			practiceCodingTest14.answer += c1;
		}
		return c1;
	
}
}

class practiceCodingTest14 {
    static String answer = "";
	static int index = 0;
    public String solution(String s) {
       for (int i = 0; i < s.length(); i++){
				
				char c1 = s.charAt(i);
				Converter cvt = new Converter();
				cvt.converter(c1, index);		
		}	
        return answer;
	}
}
/*실행 결과
같은 코드로 채점한 결과가 있습니다.
정확성  테스트
테스트 1 〉	통과 (14.18ms, 53.3MB)
테스트 2 〉	통과 (13.06ms, 52.6MB)
테스트 3 〉	통과 (14.43ms, 55.4MB)
테스트 4 〉	통과 (13.27ms, 52.4MB)
테스트 5 〉	통과 (15.96ms, 53.7MB)
테스트 6 〉	통과 (17.10ms, 54.4MB)
테스트 7 〉	통과 (14.44ms, 53.3MB)
테스트 8 〉	통과 (14.95ms, 52.2MB)
테스트 9 〉	통과 (15.61ms, 53.6MB)
테스트 10 〉	통과 (19.30ms, 53.1MB)
테스트 11 〉	통과 (14.01ms, 54.2MB)
테스트 12 〉	통과 (14.97ms, 53.7MB)
테스트 13 〉	통과 (14.32ms, 53.9MB)
테스트 14 〉	통과 (15.96ms, 53.6MB)
테스트 15 〉	통과 (16.27ms, 52.1MB)
테스트 16 〉	통과 (23.21ms, 53.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/