package com.oopsw.test;
/*logo
�ڵ��׽�Ʈ ����
��������
���￡�� �輭�� ã��
����
������ �ɼ�
���￡�� �輭�� ã��
���� ����
String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
����� ��
seoul	return
[Jane, Kim]	�輭���� 1�� �ִ�*/

public class practiceCodingTest08 {

	class Solution {
	    public String solution(String[] seoul) {
	    	String answer = "";
	        int number = 0;
			for (int i = 0 ; i < seoul.length ; i++){
	            
	            boolean b = seoul[i].equals("Kim");
	            if (b){
	                number = i;                
	            }
	        }
	        answer = "�輭���� " + number + "�� �ִ�";
			return answer;
	    }
	}
}
/*
���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (8.31ms, 52.3MB)
�׽�Ʈ 2 ��	��� (10.27ms, 52.4MB)
�׽�Ʈ 3 ��	��� (7.62ms, 52.8MB)
�׽�Ʈ 4 ��	��� (7.67ms, 53.1MB)
�׽�Ʈ 5 ��	��� (8.28ms, 52.8MB)
�׽�Ʈ 6 ��	��� (8.50ms, 52.1MB)
�׽�Ʈ 7 ��	��� (8.12ms, 52.3MB)
�׽�Ʈ 8 ��	��� (10.69ms, 53.4MB)
�׽�Ʈ 9 ��	��� (8.37ms, 52.4MB)
�׽�Ʈ 10 ��	��� (11.07ms, 52.4MB)
�׽�Ʈ 11 ��	��� (7.92ms, 52.8MB)
�׽�Ʈ 12 ��	��� (9.30ms, 52.4MB)
�׽�Ʈ 13 ��	��� (8.23ms, 55.2MB)
�׽�Ʈ 14 ��	��� (7.80ms, 53.1MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0*/