package com.oopsw.test;
/*
 * logo
�ڵ��׽�Ʈ ����
��������
���ڿ� ������������ ��ġ�ϱ�
����
������ �ɼ�
���ڿ� ������������ ��ġ�ϱ�
���� ����
���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
����� ��
s	return
Zbcdefg	gfedcbZ
 */
import java.util.ArrayList;
import java.util.Collections;

public class practiceCodingTest06 {

	public static void main(String[] args) {
		String s = "afAsGhtHfh";
		String answer = "";
		ArrayList<Character> upper = new ArrayList<Character>();
		ArrayList<Character> lower = new ArrayList<Character>();
		for(int i = 0 ; i < s.length() ; i ++){
		char getChar = s.charAt(i);
		boolean checkCase = Character.isUpperCase(getChar);
			if (!checkCase) {
				lower.add(getChar);
			}else{
				upper.add(getChar);
			}//if
		}//for
		Collections.sort(lower);
		Collections.sort(upper);
		Collections.reverse(lower);
		Collections.reverse(upper);	
		for(int i = 0 ; i < lower.size(); i++){
			//answer += lower.get(i).toString();
			System.out.println(lower.get(i).toString());
		}//for 
		for(int i = 0 ; i < upper.size(); i++){
			answer += upper.get(i).toString();
		}
		System.out.println(answer);
	}

}
/*
 * ���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (2.31ms, 52.7MB)
�׽�Ʈ 2 ��	��� (1.90ms, 53.2MB)
�׽�Ʈ 3 ��	��� (3.08ms, 53.5MB)
�׽�Ʈ 4 ��	��� (2.14ms, 54.5MB)
�׽�Ʈ 5 ��	��� (4.28ms, 52.2MB)
�׽�Ʈ 6 ��	��� (4.36ms, 53.9MB)
�׽�Ʈ 7 ��	��� (2.33ms, 51.9MB)
�׽�Ʈ 8 ��	��� (2.12ms, 52.7MB)
�׽�Ʈ 9 ��	��� (2.57ms, 52.6MB)
�׽�Ʈ 10 ��	��� (2.57ms, 54.1MB)
�׽�Ʈ 11 ��	��� (2.26ms, 52.1MB)
�׽�Ʈ 12 ��	��� (2.21ms, 52.5MB)
�׽�Ʈ 13 ��	��� (5.67ms, 52.2MB)
�׽�Ʈ 14 ��	��� (1.92ms, 52.3MB)
�׽�Ʈ 15 ��	��� (1.87ms, 53.2MB)
�׽�Ʈ 16 ��	��� (1.89ms, 53MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0
 * */
