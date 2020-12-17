/*
코딩테스트 연습
월간 코드 챌린지 시즌1
3진법 뒤집기
도움말
컴파일 옵션
3진법 뒤집기
문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
입출력 예
n	result
45	7
125	229
입출력 예 설명
입출력 예 #1

답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
45	1200	0021	7
따라서 7을 return 해야 합니다.
입출력 예 #2

답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
125	11122	22111	229
따라서 229를 return 해야 합니다.*/

import java.util.*;

public class VariablesTest {
   public int divide(int n){
       int answer = n/3;
       return answer;  
   }
   public int remain(int n){
       int answer = n%3;
       return answer;
   }}

class Solution {
   public int solution(int n) {
    int i =0;
    int answer = 0;
    ArrayList<Integer> list = new ArrayList<Integer>(); 
    while(n>0){
        VariablesTest lets = new VariablesTest();
        list.add(lets.remain(n));
        n = lets.divide(n);
        i++;
        }
    for(int j=0; j<list.size();j++){
       int pow = list.size()-j-1;
        answer += list.get(j)*Math.pow(3, pow);
    }
   return answer;

}
}

/*
실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.31ms, 53.3MB)
테스트 2 〉	통과 (0.29ms, 52.1MB)
테스트 3 〉	통과 (0.27ms, 52.3MB)
테스트 4 〉	통과 (0.28ms, 51.7MB)
테스트 5 〉	통과 (0.29ms, 54.1MB)
테스트 6 〉	통과 (0.28ms, 53.2MB)
테스트 7 〉	통과 (0.27ms, 51.9MB)
테스트 8 〉	통과 (0.29ms, 52.4MB)
테스트 9 〉	통과 (0.31ms, 52.1MB)
테스트 10 〉	통과 (0.25ms, 52.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
  */