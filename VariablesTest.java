/*
�ڵ��׽�Ʈ ����
���� �ڵ� ç���� ����1
3���� ������
����
������ �ɼ�
3���� ������
���� ����
�ڿ��� n�� �Ű������� �־����ϴ�. n�� 3���� �󿡼� �յڷ� ������ ��, �̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
n�� 1 �̻� 100,000,000 ������ �ڿ����Դϴ�.
����� ��
n	result
45	7
125	229
����� �� ����
����� �� #1

���� �����ϴ� ������ ������ �����ϴ�.
n (10����)	n (3����)	�յ� ����(3����)	10�������� ǥ��
45	1200	0021	7
���� 7�� return �ؾ� �մϴ�.
����� �� #2

���� �����ϴ� ������ ������ �����ϴ�.
n (10����)	n (3����)	�յ� ����(3����)	10�������� ǥ��
125	11122	22111	229
���� 229�� return �ؾ� �մϴ�.*/

import java.util.*;

public class VariablesTest {
   public int divide(int n){
       int answer = n/3;
       return answer;  
   }
   public int remain(int n){
       int answer = n%3;
       return answer;
   }}

class Solution {
   public int solution(int n) {
    int i =0;
    int answer = 0;
    ArrayList<Integer> list = new ArrayList<Integer>(); 
    while(n>0){
        VariablesTest lets = new VariablesTest();
        list.add(lets.remain(n));
        n = lets.divide(n);
        i++;
        }
    for(int j=0; j<list.size();j++){
       int pow = list.size()-j-1;
        answer += list.get(j)*Math.pow(3, pow);
    }
   return answer;

}
}

/*
���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (0.31ms, 53.3MB)
�׽�Ʈ 2 ��	��� (0.29ms, 52.1MB)
�׽�Ʈ 3 ��	��� (0.27ms, 52.3MB)
�׽�Ʈ 4 ��	��� (0.28ms, 51.7MB)
�׽�Ʈ 5 ��	��� (0.29ms, 54.1MB)
�׽�Ʈ 6 ��	��� (0.28ms, 53.2MB)
�׽�Ʈ 7 ��	��� (0.27ms, 51.9MB)
�׽�Ʈ 8 ��	��� (0.29ms, 52.4MB)
�׽�Ʈ 9 ��	��� (0.31ms, 52.1MB)
�׽�Ʈ 10 ��	��� (0.25ms, 52.7MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0
  */