package com.oopsw.test;
/*logo
�ڵ��׽�Ʈ ����
��������
�̻��� ���� �����
����
������ �ɼ�
�̻��� ���� �����
���� ����
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
����� ��
s	return
try hello world	TrY HeLlO WoRlD
����� �� ����
try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. ���� TrY HeLlO WoRlD �� �����մϴ�.*/
class Converter{
	public char converter(char c1, int index){
		//char = 2(�ҹ��ڿ���), 1(�빮��) 5(�ѱ���)  int= 15 special = 26  ' '=12
		if (Character.getType(c1) == 1 || Character.getType(c1) == 2){
			switch (index % 2){
			case 0: //¦��
				practiceCodingTest14.answer += Character.toUpperCase(c1);
				practiceCodingTest14.index ++;
				break;
			case 1: //Ȧ��
				practiceCodingTest14.answer += Character.toLowerCase(c1);
				practiceCodingTest14.index ++;
				break;
			}
		}else if(Character.getType(c1) == 12){
			practiceCodingTest14.index = 0;
			practiceCodingTest14.answer += ' ';
		}else{
			practiceCodingTest14.answer += c1;
		}
		return c1;
	
}
}

class practiceCodingTest14 {
    static String answer = "";
	static int index = 0;
    public String solution(String s) {
       for (int i = 0; i < s.length(); i++){
				
				char c1 = s.charAt(i);
				Converter cvt = new Converter();
				cvt.converter(c1, index);		
		}	
        return answer;
	}
}
/*���� ���
���� �ڵ�� ä���� ����� �ֽ��ϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (14.18ms, 53.3MB)
�׽�Ʈ 2 ��	��� (13.06ms, 52.6MB)
�׽�Ʈ 3 ��	��� (14.43ms, 55.4MB)
�׽�Ʈ 4 ��	��� (13.27ms, 52.4MB)
�׽�Ʈ 5 ��	��� (15.96ms, 53.7MB)
�׽�Ʈ 6 ��	��� (17.10ms, 54.4MB)
�׽�Ʈ 7 ��	��� (14.44ms, 53.3MB)
�׽�Ʈ 8 ��	��� (14.95ms, 52.2MB)
�׽�Ʈ 9 ��	��� (15.61ms, 53.6MB)
�׽�Ʈ 10 ��	��� (19.30ms, 53.1MB)
�׽�Ʈ 11 ��	��� (14.01ms, 54.2MB)
�׽�Ʈ 12 ��	��� (14.97ms, 53.7MB)
�׽�Ʈ 13 ��	��� (14.32ms, 53.9MB)
�׽�Ʈ 14 ��	��� (15.96ms, 53.6MB)
�׽�Ʈ 15 ��	��� (16.27ms, 52.1MB)
�׽�Ʈ 16 ��	��� (23.21ms, 53.4MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0*/