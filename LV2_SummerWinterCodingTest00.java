package com.oopsw.test2;
/*코딩테스트 연습
Summer/Winter Coding(~2018)
스킬트리
도움말
컴파일 옵션
스킬트리
문제 설명
선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.

예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.

위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.

선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.

제한 조건
스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있습니다.
스킬 순서와 스킬트리는 문자열로 표기합니다.
예를 들어, C → B → D 라면 CBD로 표기합니다
선행 스킬 순서 skill의 길이는 1 이상 26 이하이며, 스킬은 중복해 주어지지 않습니다.
skill_trees는 길이 1 이상 20 이하인 배열입니다.
skill_trees의 원소는 스킬을 나타내는 문자열입니다.
skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않습니다.
입출력 예
skill	skill_trees	return
"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	2
입출력 예 설명
BACDE: B 스킬을 배우기 전에 C 스킬을 먼저 배워야 합니다. 불가능한 스킬트립니다.
CBADF: 가능한 스킬트리입니다.
AECB: 가능한 스킬트리입니다.
BDA: B 스킬을 배우기 전에 C 스킬을 먼저 배워야 합니다. 불가능한 스킬트리입니다.
스킬 트리: 유저가 스킬을 배울 순서 ↩*/

import java.util.Arrays;

public class LV2_SummerWinterCodingTest00 {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		int skill_trees_size = skill_trees.length;
		String oneOfSkill; 
		boolean[] check_skill_trees = new boolean [skill_trees_size]; //default False
		int[] indexSave = new int [skill_trees_size];
		
		for (int i = 0; i < skill.length(); i++){
			oneOfSkill = skill.substring(i,i + 1);
			System.out.println(i + "원소:"+oneOfSkill);
			for (int j = 0 ; j < skill_trees.length; j++){
				if ( check_skill_trees[j] == false && //스킬트리가 가능하고
						(indexSave[j] <= skill_trees[j].indexOf(oneOfSkill) || //이전에 저장된 index가 다음 index보다 크거나 같거나
								skill_trees[j].indexOf(oneOfSkill) == -1)){ //스킼트리에 없다.
					try {
						if (skill_trees[j].indexOf(oneOfSkill) == -1 && skill_trees[j].indexOf(skill.substring(i + 1, i + 2)) >= 0){
							check_skill_trees[j] = true;
						}
					} catch (Exception e) {
						
						e.printStackTrace();
					}if (skill_trees[j].indexOf(oneOfSkill) != -1){
						indexSave[j] = skill_trees[j].indexOf(oneOfSkill);
					}	
					
					System.out.println(j+"번째 : " +skill_trees[j].indexOf(oneOfSkill));
				}else{
					check_skill_trees[j] = true;
				}
			}
			System.out.println(oneOfSkill + " check "+Arrays.toString(check_skill_trees));
		}
		for (int i = 0; i < check_skill_trees.length; i++){
			if (check_skill_trees[i] == false){
				answer ++;
			}
		}
		System.out.println(answer);

	}

}

/*실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (23.86ms, 54MB)
테스트 2 〉	통과 (23.59ms, 54.2MB)
테스트 3 〉	통과 (26.95ms, 54.1MB)
테스트 4 〉	통과 (26.34ms, 53.7MB)
테스트 5 〉	통과 (25.46ms, 54.2MB)
테스트 6 〉	통과 (25.79ms, 54.3MB)
테스트 7 〉	통과 (29.25ms, 54.1MB)
테스트 8 〉	통과 (24.34ms, 53.8MB)
테스트 9 〉	통과 (26.84ms, 54.7MB)
테스트 10 〉	통과 (27.15ms, 53.9MB)
테스트 11 〉	통과 (27.05ms, 53.7MB)
테스트 12 〉	통과 (29.47ms, 53.9MB)
테스트 13 〉	통과 (26.53ms, 54.1MB)
테스트 14 〉	통과 (25.78ms, 54.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/
