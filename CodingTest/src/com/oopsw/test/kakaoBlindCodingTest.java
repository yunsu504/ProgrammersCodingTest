package com.oopsw.test;

import java.util.Arrays;

/*코딩테스트 연습
2018 KAKAO BLIND RECRUITMENT
[1차] 비밀지도
도움말
컴파일 옵션
[1차] 비밀지도
문제 설명
비밀지도
네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백(" ) 또는벽(#") 두 종류로 이루어져 있다.
전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 지도 1과 지도 2라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
secret map

네오가 프로도의 비상금을 손에 넣을 수 있도록, 비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.

입력 형식
입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.

1 ≦ n ≦ 16
arr1, arr2는 길이 n인 정수 배열로 주어진다.
정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 ≦ x ≦ 2n - 1을 만족한다.
출력 형식
원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.

입출력 예제
매개변수	값
n	5
arr1	[9, 20, 28, 18, 11]
arr2	[30, 1, 21, 17, 28]
출력	["#####","# # #", "### #", "# ##", "#####"]
매개변수	값
n	6
arr1	[46, 33, 33 ,22, 31, 50]
arr2	[27 ,56, 19, 14, 14, 10]
출력	["######", "### #", "## ##", " #### ", " #####", "### # "]*/

public class kakaoBlindCodingTest {
	/*
	 * toBinaryString 과 replaceAll을 사용해보았다
	 * 
	 */
	  public String[] tenToString (int a, int n){
			String[] output = new String[n]; 
			for (int i = n-1; i >= 0; i--){
				if (a % 2 == 1){
					output[i] = "#";
				}else{
					output[i] = " ";
				}
				a = a / 2;
			}
			return output;
		}	
	    
	    public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
			String[][] ar1 = new String[n][n];
			String[][] ar2 = new String[n][n];
			kakaoBlindCodingTest k = new kakaoBlindCodingTest();
			for (int i = 0; i < n ; i++){
				ar1[i] = k.tenToString(arr1[i],n);
				ar2[i] = k.tenToString(arr2[i],n);
				answer[i] = "";
				for (int j = 0; j < n; j++){
		
					if (ar1[i][j].equals("#")||ar2[i][j].equals("#")){
						answer[i] += "#"; 
					}else{
						answer[i] += " ";
					}
				}
			}
			
	        return answer;
	    }
	}
/*실행 결과
같은 코드로 채점한 결과가 있습니다.
정확성  테스트
테스트 1 〉	통과 (2.67ms, 52.4MB)
테스트 2 〉	통과 (2.77ms, 52.4MB)
테스트 3 〉	통과 (2.55ms, 52.6MB)
테스트 4 〉	통과 (3.64ms, 55.8MB)
테스트 5 〉	통과 (2.84ms, 52.3MB)
테스트 6 〉	통과 (2.55ms, 52.8MB)
테스트 7 〉	통과 (2.47ms, 52.5MB)
테스트 8 〉	통과 (4.65ms, 52.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/