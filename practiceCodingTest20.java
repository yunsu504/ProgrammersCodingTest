package com.oopsw.test;
/*������ �ɼ�
¦���� Ȧ��
���� ����
���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
num�� int ������ �����Դϴ�.
0�� ¦���Դϴ�.
����� ��
num	return
3	Odd
4	Even*/
public class practiceCodingTest20 {
    public String solution(int num) {
        String answer = "";
        switch (num % 2){
		case 0: answer = "Even"; break;
		default: answer = "Odd"; break;
                
			}
        return answer;
    }
}
/*���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (0.02ms, 53MB)
�׽�Ʈ 2 ��	��� (0.02ms, 51.9MB)
�׽�Ʈ 3 ��	��� (0.02ms, 52.6MB)
�׽�Ʈ 4 ��	��� (0.01ms, 53.8MB)
�׽�Ʈ 5 ��	��� (0.02ms, 52.6MB)
�׽�Ʈ 6 ��	��� (0.02ms, 52.7MB)
�׽�Ʈ 7 ��	��� (0.03ms, 52.5MB)
�׽�Ʈ 8 ��	��� (0.02ms, 52.8MB)
�׽�Ʈ 9 ��	��� (0.01ms, 52.2MB)
�׽�Ʈ 10 ��	��� (0.03ms, 52MB)
�׽�Ʈ 11 ��	��� (0.02ms, 52MB)
�׽�Ʈ 12 ��	��� (0.02ms, 52.4MB)
�׽�Ʈ 13 ��	��� (0.02ms, 53.1MB)
�׽�Ʈ 14 ��	��� (0.02ms, 52.1MB)
�׽�Ʈ 15 ��	��� (0.01ms, 52.9MB)
�׽�Ʈ 16 ��	��� (0.02ms, 52.1MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0*/