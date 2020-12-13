/*코딩테스트 연습
해시
전화번호 목록
도움말
컴파일 옵션
전화번호 목록
문제 설명
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

제한 사항
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
입출력 예제
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false
입출력 예 설명
입출력 예 #1
앞에서 설명한 예와 같습니다.

입출력 예 #2
한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.

입출력 예 #3
첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.

알림

2019년 5월 13일, 테스트 케이스가 변경되었습니다. 이로 인해 이전에 통과하던 코드가 더 이상 통과하지 않을 수 있습니다.
*/

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int numberSize = 0;
        for(int i=0;i<phone_book.length;i++){
            numberSize = phone_book[i].length();
            for(int j=0; j<phone_book.length; j++){
                String cutted = phone_book[j].substring(0,numberSize);
                if(!phone_book[i].equals(phone_book[j]) && phone_book[i].equals(cutted)){
                answer = false;
                    return answer;
            }
        }
    } return answer;
}
}

/*
실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	실패 (런타임 에러)
테스트 2 〉	통과 (0.03ms, 51.9MB)
테스트 3 〉	통과 (0.02ms, 52.9MB)
테스트 4 〉	통과 (0.02ms, 52.5MB)
테스트 5 〉	실패 (런타임 에러)
테스트 6 〉	실패 (런타임 에러)
테스트 7 〉	실패 (런타임 에러)
테스트 8 〉	실패 (런타임 에러)
테스트 9 〉	실패 (런타임 에러)
테스트 10 〉	통과 (0.04ms, 52.4MB)
테스트 11 〉	실패 (런타임 에러)
효율성  테스트
테스트 1 〉	실패 (런타임 에러)
테스트 2 〉	실패 (런타임 에러)
채점 결과
정확성: 30.8
효율성: 0.0
합계: 30.8 / 100.0 
*/
-------------------------------------------------------------------------------------

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int numberSize = 0;
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length;i++){
            numberSize = phone_book[i].length();
            for(int j=0; j<phone_book.length; j++){
                String cutted = phone_book[j].substring(0,numberSize);
                if(!phone_book[i].equals(phone_book[j]) && phone_book[i].equals(cutted)){
                answer = false;
                    return answer;
            }
        }
    } return answer;
}
}
실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	실패 (런타임 에러)
테스트 2 〉	통과 (0.55ms, 52.9MB)
테스트 3 〉	통과 (0.23ms, 52.4MB)
테스트 4 〉	통과 (0.24ms, 52.3MB)
테스트 5 〉	실패 (런타임 에러)
테스트 6 〉	실패 (런타임 에러)
테스트 7 〉	실패 (런타임 에러)
테스트 8 〉	통과 (0.20ms, 52.9MB)
테스트 9 〉	통과 (0.22ms, 52.6MB)
테스트 10 〉	통과 (0.23ms, 52.1MB)
테스트 11 〉	실패 (런타임 에러)
효율성  테스트
테스트 1 〉	통과 (21.57ms, 56.5MB)
테스트 2 〉	통과 (27.17ms, 59.9MB)
채점 결과
정확성: 46.2
효율성: 15.4
합계: 61.5 / 100.0