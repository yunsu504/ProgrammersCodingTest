package com.oopsw.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*logo
코딩테스트 연습
2019 KAKAO BLIND RECRUITMENT
실패율
도움말
컴파일 옵션
실패율
문제 설명
실패율
failture_rate1.png

슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다. 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.

이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 오렐리를 위해 실패율을 구하는 코드를 완성하라.

실패율은 다음과 같이 정의한다.
스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.

제한사항
스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
stages의 길이는 1 이상 200,000 이하이다.
stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
입출력 예
N	stages	result
5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
4	[4,4,4,4,4]	[4,1,2,3]
입출력 예 설명
입출력 예 #1
1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다. 따라서 1번 스테이지의 실패율은 다음과 같다.

1 번 스테이지 실패율 : 1/8
2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서 2번 스테이지의 실패율은 다음과 같다.

2 번 스테이지 실패율 : 3/7
마찬가지로 나머지 스테이지의 실패율은 다음과 같다.

3 번 스테이지 실패율 : 2/4
4번 스테이지 실패율 : 1/2
5번 스테이지 실패율 : 0/1
각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.

[3,4,2,1,5]
입출력 예 #2

모든 사용자가 마지막 스테이지에 있으므로 4번 스테이지의 실패율은 1이며 나머지 스테이지의 실패율은 0이다.

[4,1,2,3]*/

public class kakaoBlindCodingTest01 {

		 public int[] solution(int N, int[] stages) {
		        int[] answer = new int[N];
		        int onStageNotClear = stages.length;
				int onStage = 0;
				int countDropout = 0;
				Map<Integer, Double> map = new HashMap<>();
				for (int i = 0; i < N; i++ ){
					for (int j = 0; j < stages.length; j++){
						if(stages[j] >= i+1){
							onStage ++;
						}
						if(stages[j] > i+1){
							onStageNotClear --;
						}
					} //for j
		            if (onStageNotClear != 0){
					map.put(i+1, (double)onStageNotClear / onStage );			
					countDropout += onStageNotClear; 
					
					} else{
					map.put(i+1, (double) 0 );	
					}
					onStageNotClear = stages.length - countDropout;
					onStage = 0;
				}// for i 
				List<Integer> keySetList = new ArrayList<>(map.keySet());
				Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
				int index = 0;
				for(Integer key : keySetList) {
					answer[index] = key;
					index++;
				}
				return answer;
				
			}

			}
		//System.out.println("------value 내림차순------");
				//https://daily-life-of-bsh.tistory.com/99
/*실행 결과
같은 코드로 채점한 결과가 있습니다.
정확성  테스트
테스트 1 〉	통과 (0.97ms, 52.3MB)
테스트 2 〉	통과 (0.91ms, 52.8MB)
테스트 3 〉	통과 (62.66ms, 57MB)
테스트 4 〉	통과 (129.03ms, 59.6MB)
테스트 5 〉	통과 (488.38ms, 61.7MB)
테스트 6 〉	통과 (4.54ms, 52.1MB)
테스트 7 〉	통과 (15.59ms, 52.7MB)
테스트 8 〉	통과 (129.62ms, 56.6MB)
테스트 9 〉	통과 (474.64ms, 64MB)
테스트 10 〉	통과 (53.53ms, 55.6MB)
테스트 11 〉	통과 (102.37ms, 57.4MB)
테스트 12 〉	통과 (73.28ms, 57MB)
테스트 13 〉	통과 (119.35ms, 60MB)
테스트 14 〉	통과 (2.24ms, 52.1MB)
테스트 15 〉	통과 (19.74ms, 54.9MB)
테스트 16 〉	통과 (11.17ms, 54MB)
테스트 17 〉	통과 (15.33ms, 54.6MB)
테스트 18 〉	통과 (11.86ms, 54MB)
테스트 19 〉	통과 (5.50ms, 52.3MB)
테스트 20 〉	통과 (11.26ms, 53.8MB)
테스트 21 〉	통과 (13.07ms, 56.6MB)
테스트 22 〉	통과 (171.15ms, 61.8MB)
테스트 23 〉	통과 (27.56ms, 59.4MB)
테스트 24 〉	통과 (35.03ms, 58.2MB)
테스트 25 〉	통과 (0.78ms, 51.7MB)
테스트 26 〉	통과 (0.72ms, 52.9MB)
테스트 27 〉	통과 (0.78ms, 51.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/