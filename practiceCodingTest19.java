package com.oopsw.test;
/*logo
�ڵ��׽�Ʈ ����
��������
���� ���� �� �����ϱ�
����
������ �ɼ�
���� ���� �� �����ϱ�
���� ����
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
����� ��
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]*/
import java.util.Arrays;

public class practiceCodingTest19 {

	public static void main(String[] args) {
		
		int[] arr  = {1,5,7,3,2,6};
		int[] answer = new int[arr.length-1];
		
		int arr1 = arr[0];
		if (arr.length == 1){
			answer = new int[]{-1};
		}else{
			int tmp = arr[0];//4
			for (int i = 1, j = 0 ; i < arr.length && j <arr.length-1 ; i++, j++){
				if( arr[i] > tmp ){//3>4
					answer[j] = arr[i];
				}else{
					answer[j] = tmp;
					tmp = arr[i]; 
									
				}
				
			}
		for (int i = 0 ; i < answer.length; i++){
			System.out.println(answer[i]);
		}
			
		
		}
	}
}
/*
���� ���
���� �ڵ�� ä���� ����� �ֽ��ϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	���� (1.56ms, 61.1MB)
�׽�Ʈ 2 ��	���� (0.03ms, 52.5MB)
�׽�Ʈ 3 ��	���� (0.05ms, 53.2MB)
�׽�Ʈ 4 ��	���� (0.03ms, 53.1MB)
�׽�Ʈ 5 ��	���� (0.02ms, 52.2MB)
�׽�Ʈ 6 ��	���� (0.05ms, 52.4MB)
�׽�Ʈ 7 ��	���� (0.08ms, 52.3MB)
�׽�Ʈ 8 ��	��� (0.01ms, 52MB)
�׽�Ʈ 9 ��	���� (0.02ms, 51.8MB)
�׽�Ʈ 10 ��	���� (0.02ms, 52.6MB)
�׽�Ʈ 11 ��	��� (0.03ms, 52.3MB)
�׽�Ʈ 12 ��	���� (0.02ms, 51.8MB)
�׽�Ʈ 13 ��	���� (0.03ms, 53MB)
�׽�Ʈ 14 ��	���� (0.06ms, 52.5MB)
�׽�Ʈ 15 ��	���� (0.03ms, 51.6MB)
�׽�Ʈ 16 ��	���� (0.05ms, 52.6MB)
ä�� ���
��Ȯ��: 12.5
�հ�: 12.5 / 100.0*/