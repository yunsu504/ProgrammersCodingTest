package com.oopsw.test;


/*�ڵ��׽�Ʈ ����
��������
��� ���� ��������
����
������ �ɼ�
��� ���� ��������
���� ����
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
����� ��
s	return
abcde	c
qwer	we
*/

class practiceCodingTest {
    public String solution(String s) {
		String answer = "";
		int sizeCheck = s.length()%2;
		int getIndex = s.length() / 2;
		if (sizeCheck == 1 ){
			answer = s.substring(getIndex, getIndex + 1);
		}else{
			answer = s.substring(getIndex - 1, getIndex + 1);
		}
		return answer;
	}
}
/*���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (0.02ms, 51.8MB)
�׽�Ʈ 2 ��	��� (0.02ms, 51.8MB)
�׽�Ʈ 3 ��	��� (0.02ms, 52.7MB)
�׽�Ʈ 4 ��	��� (0.02ms, 51.4MB)
�׽�Ʈ 5 ��	��� (0.02ms, 54.3MB)
�׽�Ʈ 6 ��	��� (0.02ms, 52MB)
�׽�Ʈ 7 ��	��� (0.01ms, 53.6MB)
�׽�Ʈ 8 ��	��� (0.02ms, 52.5MB)
�׽�Ʈ 9 ��	��� (0.03ms, 52.4MB)
�׽�Ʈ 10 ��	��� (0.02ms, 51.7MB)
�׽�Ʈ 11 ��	��� (0.02ms, 52MB)
�׽�Ʈ 12 ��	��� (0.02ms, 51.8MB)
�׽�Ʈ 13 ��	��� (0.02ms, 51.9MB)
�׽�Ʈ 14 ��	��� (0.03ms, 52.7MB)
�׽�Ʈ 15 ��	��� (0.02ms, 53MB)
�׽�Ʈ 16 ��	��� (0.02ms, 52.6MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0*/