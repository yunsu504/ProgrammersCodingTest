package com.oopsw.test;
/*
�ڵ��׽�Ʈ ����
2020 īī�� ���Ͻ�
Ű�е� ������
����
������ �ɼ�
[īī�� ����] Ű�е� ������
���� ����
����Ʈ�� ��ȭ Ű�е��� �� ĭ�� ������ ���� ���ڵ��� ���� �ֽ��ϴ�.

kakao_phone1.png

�� ��ȭ Ű�е忡�� �޼հ� �������� �����հ������� �̿��ؼ� ���ڸ��� �Է��Ϸ��� �մϴ�.
�� ó�� �޼� �����հ����� * Ű�е忡 ������ �����հ����� # Ű�е� ��ġ���� �����ϸ�, �����հ����� ����ϴ� ��Ģ�� ������ �����ϴ�.

�����հ����� �����¿� 4���� �������θ� �̵��� �� ������ Ű�е� �̵� �� ĭ�� �Ÿ��� 1�� �ش��մϴ�.
���� ���� 3���� ���� 1, 4, 7�� �Է��� ���� �޼� �����հ����� ����մϴ�.
������ ���� 3���� ���� 3, 6, 9�� �Է��� ���� ������ �����հ����� ����մϴ�.
��� ���� 4���� ���� 2, 5, 8, 0�� �Է��� ���� �� �����հ����� ���� Ű�е��� ��ġ���� �� ����� �����հ����� ����մϴ�.
4-1. ���� �� �����հ����� �Ÿ��� ���ٸ�, ���������̴� ������ �����հ���, �޼����̴� �޼� �����հ����� ����մϴ�.
������� ���� ��ȣ�� ��� �迭 numbers, �޼��������� ������������ ���� ��Ÿ���� ���ڿ� hand�� �Ű������� �־��� ��, �� ��ȣ�� ���� �����հ����� �޼��� �� �������� ���� ��Ÿ���� ���ӵ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ����ּ���.

[���ѻ���]
numbers �迭�� ũ��� 1 �̻� 1,000 �����Դϴ�.
numbers �迭 ������ ���� 0 �̻� 9 ������ �����Դϴ�.
hand�� "left" �Ǵ� "right" �Դϴ�.
"left"�� �޼�����, "right"�� ���������̸� �ǹ��մϴ�.
�޼� �����հ����� ����� ���� L, ������ �����հ����� ����� ���� R�� ������� �̾�ٿ� ���ڿ� ���·� return ���ּ���.
����� ��
numbers	hand	result
[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL"
����� ���� ���� ����
����� �� #1

������� ������ �� ��ȣ�� [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]�̰�, �����������Դϴ�.

�޼� ��ġ	������ ��ġ	������ �� ����	����� ��	����
*	#	1	L	1�� �޼����� �����ϴ�.
1	#	3	R	3�� ���������� �����ϴ�.
1	3	4	L	4�� �޼����� �����ϴ�.
4	3	5	L	�޼� �Ÿ��� 1, ������ �Ÿ��� 2�̹Ƿ� �޼����� 5�� �����ϴ�.
5	3	8	L	�޼� �Ÿ��� 1, ������ �Ÿ��� 3�̹Ƿ� �޼����� 8�� �����ϴ�.
8	3	2	R	�޼� �Ÿ��� 2, ������ �Ÿ��� 1�̹Ƿ� ���������� 2�� �����ϴ�.
8	2	1	L	1�� �޼����� �����ϴ�.
1	2	4	L	4�� �޼����� �����ϴ�.
4	2	5	R	�޼� �Ÿ��� ������ �Ÿ��� 1�� �����Ƿ�, ���������� 5�� �����ϴ�.
4	5	9	R	9�� ���������� �����ϴ�.
4	9	5	L	�޼� �Ÿ��� 1, ������ �Ÿ��� 2�̹Ƿ� �޼����� 5�� �����ϴ�.
5	9	-	-	
���� "LRLLLRLLRRL"�� return �մϴ�.

����� �� #2

�޼����̰� [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]�� ������� ������ ����� ���� "LRLLRRLLLRR"�� �˴ϴ�.

����� �� #3

���������̰� [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]�� ������� ������ ����� ���� "LLRLLRLLRL"�� �˴ϴ�.*/
public class kakaoCodingTest {
	class Solution {
	    public String solution(int[] numbers, String hand) {
	       		String answer = "";
			// ��� ������?
			switch(hand){
			case "right": hand = "R"; break;
			case "left": hand = "L"; break;
			}
			// ���� �ֽ���ġ ���
			int beforeL = 10; //10 = * 
			int beforeR = 12; //12 = #
			
			//numbers�� � ���ڸ� �Է��ؾ� �ϴ���  number
			for (int i = 0; i < numbers.length ; i++){
				int number = numbers[i];
			//	System.out.println("�޼���ġ :" +beforeL + ", ��������ġ :" + beforeR + ", number : " + number);
				
				int countL = 0;
				int countR = 0;
				switch (number){
				case 1:
				case 4:
				case 7:
					answer += "L";
					beforeL = number;
					break;
				case 3:
				case 6:
				case 9:
					answer += "R";
					beforeR = number;
					break;
				default:
				
					if (number == 0) {
						number = 11;
					}
					//�޼�check
					if (number > beforeL){
						for (int j = beforeL+1; j <= number; j++){
							countL ++;
						}
			
		        //  System.out.println("�޼�ī����1: " +countL);
					}else if(number < beforeL){
						for (int j = beforeL-1; j >= number; j--){
								countL ++;
						}
						
			    //  System.out.println("�޼�ī����2: " +countL);
					}
					//������check				
					if (number > beforeR){
						for (int j = beforeR+1; j <= number; j++){
							countR ++;
						}
				//	System.out.println("������ī����1: " +countR);
					}else if(number < beforeR){
						for (int j = beforeR-1; j >= number; j--){
								countR ++;
						}
				//	System.out.println("����ī����2: " +countR);
					}
				//	System.out.println(countL/3+countL%3);
				//	System.out.println(countR/3+countR%3);
					if (countL/3+countL%3 > countR/3+countR%3){
						answer += "R";
						beforeR = number;
						
					}else if (countL/3+countL%3 < countR/3+countR%3){
						answer += "L";
						beforeL = number;
					}else {
						answer += hand;
	                    switch(hand){
						case "R": beforeR = number; break;
						case "L": beforeL = number; break;
						}
					}		
				}//switch
			}//for	
			return answer;		
		}//main
	}//class
}
	/*���� ���
	ä���� �����մϴ�.
	��Ȯ��  �׽�Ʈ
	�׽�Ʈ 1 ��	��� (2.40ms, 52.6MB)
	�׽�Ʈ 2 ��	��� (1.36ms, 51.6MB)
	�׽�Ʈ 3 ��	��� (1.75ms, 52.3MB)
	�׽�Ʈ 4 ��	��� (2.28ms, 52.2MB)
	�׽�Ʈ 5 ��	��� (1.44ms, 52.3MB)
	�׽�Ʈ 6 ��	��� (2.17ms, 53.9MB)
	�׽�Ʈ 7 ��	��� (2.54ms, 52.1MB)
	�׽�Ʈ 8 ��	��� (2.62ms, 52.8MB)
	�׽�Ʈ 9 ��	��� (2.78ms, 53.2MB)
	�׽�Ʈ 10 ��	��� (2.90ms, 52.3MB)
	�׽�Ʈ 11 ��	��� (2.61ms, 52.9MB)
	�׽�Ʈ 12 ��	��� (2.42ms, 53MB)
	�׽�Ʈ 13 ��	��� (4.83ms, 52.3MB)
	�׽�Ʈ 14 ��	��� (2.93ms, 51.7MB)
	�׽�Ʈ 15 ��	��� (3.46ms, 53.1MB)
	�׽�Ʈ 16 ��	��� (3.23ms, 53.7MB)
	�׽�Ʈ 17 ��	��� (4.20ms, 53.5MB)
	�׽�Ʈ 18 ��	��� (4.33ms, 53.6MB)
	�׽�Ʈ 19 ��	��� (4.28ms, 54.8MB)
	�׽�Ʈ 20 ��	��� (6.18ms, 53.5MB)
	ä�� ���
	��Ȯ��: 100.0
	�հ�: 100.0 / 100.0*/