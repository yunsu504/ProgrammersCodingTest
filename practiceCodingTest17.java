package com.oopsw.test;
/*logo
�ڵ��׽�Ʈ ����
��������
���� ������������ ��ġ�ϱ�
����
������ �ɼ�
���� ������������ ��ġ�ϱ�
���� ����
�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
����� ��
n	return
118372	873211*/
import java.util.ArrayList;
import java.util.Collections;

public class practiceCodingTest17 {
	 public long solution(long n) {
	     String s = String.valueOf(n);
			int size = (int)Math.log10(n)+1;
			String b  = "A";
			
			ArrayList<Character> list =  new ArrayList<Character>();
			
			for (int i = 0 ; i < size ; i ++){
				list.add(s.charAt(i));
			}
			Collections.sort(list);
			Collections.reverse(list);
			for (int i = 0 ; i < size ; i ++){
			b += Character.toString(list.get(i));
			}
			long answer = Long.parseLong(b.substring(1));
			return answer;
		}
	}

/*���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (2.00ms, 52.2MB)
�׽�Ʈ 2 ��	��� (1.78ms, 52.3MB)
�׽�Ʈ 3 ��	��� (1.74ms, 52.7MB)
�׽�Ʈ 4 ��	��� (1.84ms, 53MB)
�׽�Ʈ 5 ��	��� (1.85ms, 52.4MB)
�׽�Ʈ 6 ��	��� (1.85ms, 53.3MB)
�׽�Ʈ 7 ��	��� (1.73ms, 53.1MB)
�׽�Ʈ 8 ��	��� (1.83ms, 53.9MB)
�׽�Ʈ 9 ��	��� (2.34ms, 54.1MB)
�׽�Ʈ 10 ��	��� (1.85ms, 52.7MB)
�׽�Ʈ 11 ��	��� (1.99ms, 52.5MB)
�׽�Ʈ 12 ��	��� (1.91ms, 53.4MB)
�׽�Ʈ 13 ��	��� (2.01ms, 52.7MB)
�׽�Ʈ 14 ��	��� (1.91ms, 52.4MB)
�׽�Ʈ 15 ��	��� (1.90ms, 52.5MB)
�׽�Ʈ 16 ��	��� (2.00ms, 52.9MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0*/