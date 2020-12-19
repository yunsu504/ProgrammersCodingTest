package com.oopsw.test;
/*코딩테스트 연습
연습문제
문자열 내 마음대로 정렬하기
도움말
컴파일 옵션
문자열 내 마음대로 정렬하기
문제 설명
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예
strings	n	return
[sun, bed, car]	1	[car, bed, sun]
[abce, abcd, cdx]	2	[abcd, abce, cdx]
입출력 예 설명
입출력 예 1
sun, bed, car의 1번째 인덱스 값은 각각 u, e, a 입니다. 이를 기준으로 strings를 정렬하면 [car, bed, sun] 입니다.

입출력 예 2
abce와 abcd, cdx의 2번째 인덱스 값은 c, c, x입니다. 따라서 정렬 후에는 cdx가 가장 뒤에 위치합니다. abce와 abcd는 사전순으로 정렬하면 abcd가 우선하므로, 답은 [abcd, abce, cdx] 입니다.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class practiceCodingTest04 {

	   public ArrayList solution(String[] strings, int n) {
	        ArrayList<String> answer = new ArrayList <String> (); //정답을 담을 변수
	        String[] chars = new String [strings.length];  //strings의 원소에서 char값을 모아놓을 배열
			HashSet <String> set = new HashSet <String> (); //중복검사를 위한 set
			
	        for (int i = 0; i < strings.length; i++){ 
				String getChar = strings[i].substring(n,n + 1); //strings 원소에서 자릿수의 char 추출
				chars[i] = getChar; //chars[]에 추출 char을 넣어줌
	        }//for
	        
			Arrays.sort(chars); //원소들을 사전순으로
			
	        for (int i = 0; i < chars.length; i++){
			    ArrayList <String> list = new ArrayList <String> (); //strings 원소들중 n자릿수 알파벳이 동일한 원소들만 담을 배열
			
	            for (int j = 0; j < strings.length; j++){
			        boolean b = strings[j].substring(n,n + 1).equals(chars[i]); //n번째 자릿수가 같은지 비교
			        if (b){ //원소의 n번째 자릿수가 동일하다면
					   if (!list.contains(strings[j])) {  //원소를 list에 넣기전에 들어있는지 확인
					        list.add(strings[j]); 
							}//if
	                    
						    Collections.sort(list);
						    }//if
					}//for j
				
	            for (int k = 0; k < list.size(); k++){
					boolean b = set.add(list.get(k));
				    if (b){
						answer.add(list.get(k));
					}//if
					
					}//for k
					list.clear();
				
			}//for i
	        return answer;
	    }
	}
/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.31ms, 53.5MB)
테스트 2 〉	통과 (0.34ms, 52.5MB)
테스트 3 〉	통과 (0.95ms, 52.2MB)
테스트 4 〉	통과 (0.96ms, 53.3MB)
테스트 5 〉	통과 (0.39ms, 52.2MB)
테스트 6 〉	통과 (1.08ms, 52MB)
테스트 7 〉	통과 (0.51ms, 52MB)
테스트 8 〉	통과 (0.44ms, 55.8MB)
테스트 9 〉	통과 (1.37ms, 52.1MB)
테스트 10 〉	통과 (1.61ms, 53MB)
테스트 11 〉	통과 (0.35ms, 52MB)
테스트 12 〉	통과 (2.04ms, 54.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/