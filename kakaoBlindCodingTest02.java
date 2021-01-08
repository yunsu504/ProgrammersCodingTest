package com.oopsw.test;

import java.util.Arrays;
/*logo
코딩테스트 연습
2018 KAKAO BLIND RECRUITMENT
[1차] 다트 게임
도움말
컴파일 옵션
[1차] 다트 게임
문제 설명
다트 게임
카카오톡에 뜬 네 번째 별! 심심할 땐? 카카오톡 게임별~

Game Star

카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로, 모두가 간단히 즐길 수 있다.
갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다. 다트 게임의 점수 계산 로직은 아래와 같다.

다트 게임은 총 3번의 기회로 구성된다.
각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.

입력 형식
점수|보너스|[옵션]으로 이루어진 문자열 3세트.
예) 1S2D*3T

점수는 0에서 10 사이의 정수이다.
보너스는 S, D, T 중 하나이다.
옵선은 *이나 # 중 하나이며, 없을 수도 있다.
출력 형식
3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력한다.
예) 37

입출력 예제
예제	dartResult	answer	설명
1	1S2D*3T	37	11 * 2 + 22 * 2 + 33
2	1D2S#10S	9	12 + 21 * (-1) + 101
3	1D2S0T	3	12 + 21 + 03
4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
6	1T2D3D#	-4	13 + 22 + 32 * (-1)
7	1D2S3T*	59	12 + 21 * 2 + 33 * 2*/
public class kakaoBlindCodingTest02 {

	   public int solution(String dartResult) {
     		int answer = 0;
		int j = 0;
		int[] numberLoop = new int[6];
       for (int i = 0; i < dartResult.length(); i++){
           char splitInput = dartResult.charAt(i);
           //숫자 = 9, 대문자 = 1, 특수문자 = 24
           int getType = Character.getType(splitInput);
           switch (getType){
           case 9:
           if (Character.compare(dartResult.charAt(i+1), '0') == 0){
           		numberLoop[j] = 10;
           	}else if (splitInput == '0'){
                   
           	}else{
           		numberLoop[j] = Character.getNumericValue(splitInput);
           	}
           	j++;
           	break;
           case 1:
           	if (splitInput == 'S'){
           		numberLoop[j-1] = (int) Math.pow(numberLoop[j-1], 1);
           		break;
           	}else if (splitInput == 'D'){
           		numberLoop[j-1] = (int)Math.pow(numberLoop[j-1], 2);
           		break;
           	}else if (splitInput == 'T'){
           		numberLoop[j-1] = (int)Math.pow(numberLoop[j-1], 3);
           		break;
           	}
           case 24:
           	if (splitInput == '*'){
           		if ( j > 1 ){
           			numberLoop[j-2] = numberLoop[j-2] *2;
           			numberLoop[j-1] = numberLoop[j-1] *2;
           		}else{
           			numberLoop[j-1] = numberLoop[j-1] *2;
           		}
           		break;
           	}else if (splitInput == '#'){
           		numberLoop[j-1] = numberLoop[j-1] * (-1);
           		break;
           	}
           }//switch end
       }//for end
       for (int e : numberLoop){
       	answer += e ;
       }
       return answer;
	}
}
//10조건 체크를 수정해보자
/*
실행 결과
같은 코드로 채점한 결과가 있습니다.
정확성  테스트
테스트 1 〉	통과 (0.07ms, 52.8MB)
테스트 2 〉	통과 (0.06ms, 52.3MB)
테스트 3 〉	통과 (0.06ms, 52.6MB)
테스트 4 〉	실패 (0.07ms, 52.9MB)
테스트 5 〉	실패 (0.06ms, 53.2MB)
테스트 6 〉	실패 (0.08ms, 54.1MB)
테스트 7 〉	실패 (0.08ms, 52.3MB)
테스트 8 〉	통과 (0.08ms, 52.9MB)
테스트 9 〉	통과 (0.07ms, 53MB)
테스트 10 〉	통과 (0.08ms, 53.4MB)
테스트 11 〉	통과 (0.07ms, 52.5MB)
테스트 12 〉	통과 (0.08ms, 52.2MB)
테스트 13 〉	통과 (0.09ms, 52.6MB)
테스트 14 〉	통과 (0.09ms, 51.8MB)
테스트 15 〉	통과 (0.09ms, 52.1MB)
테스트 16 〉	통과 (0.08ms, 52.7MB)
테스트 17 〉	통과 (0.07ms, 52.3MB)
테스트 18 〉	통과 (0.07ms, 52.1MB)
테스트 19 〉	통과 (0.07ms, 53.1MB)
테스트 20 〉	통과 (0.11ms, 51.9MB)
테스트 21 〉	통과 (0.08ms, 54.1MB)
테스트 22 〉	통과 (0.08ms, 52.4MB)
테스트 23 〉	통과 (0.07ms, 52.8MB)
테스트 24 〉	통과 (0.07ms, 53.1MB)
테스트 25 〉	통과 (0.06ms, 52MB)
테스트 26 〉	통과 (0.07ms, 51.7MB)
테스트 27 〉	통과 (0.07ms, 52.3MB)
테스트 28 〉	통과 (0.09ms, 52.4MB)
테스트 29 〉	통과 (0.06ms, 52.4MB)
테스트 30 〉	통과 (0.12ms, 52.7MB)
테스트 31 〉	통과 (0.08ms, 52.9MB)
테스트 32 〉	통과 (0.08ms, 52.6MB)
채점 결과
정확성: 87.5
합계: 87.5 / 100.0*/