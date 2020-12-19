package com.oopsw.test;
/*�ڵ��׽�Ʈ ����
��������
���ڿ� �� ������� �����ϱ�
����
������ �ɼ�
���ڿ� �� ������� �����ϱ�
���� ����
���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. ���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.

���� ����
strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
��� strings�� ������ ���̴� n���� Ů�ϴ�.
�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
����� ��
strings	n	return
[sun, bed, car]	1	[car, bed, sun]
[abce, abcd, cdx]	2	[abcd, abce, cdx]
����� �� ����
����� �� 1
sun, bed, car�� 1��° �ε��� ���� ���� u, e, a �Դϴ�. �̸� �������� strings�� �����ϸ� [car, bed, sun] �Դϴ�.

����� �� 2
abce�� abcd, cdx�� 2��° �ε��� ���� c, c, x�Դϴ�. ���� ���� �Ŀ��� cdx�� ���� �ڿ� ��ġ�մϴ�. abce�� abcd�� ���������� �����ϸ� abcd�� �켱�ϹǷ�, ���� [abcd, abce, cdx] �Դϴ�.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class practiceCodingTest04 {

	   public ArrayList solution(String[] strings, int n) {
	        ArrayList<String> answer = new ArrayList <String> (); //������ ���� ����
	        String[] chars = new String [strings.length];  //strings�� ���ҿ��� char���� ��Ƴ��� �迭
			HashSet <String> set = new HashSet <String> (); //�ߺ��˻縦 ���� set
			
	        for (int i = 0; i < strings.length; i++){ 
				String getChar = strings[i].substring(n,n + 1); //strings ���ҿ��� �ڸ����� char ����
				chars[i] = getChar; //chars[]�� ���� char�� �־���
	        }//for
	        
			Arrays.sort(chars); //���ҵ��� ����������
			
	        for (int i = 0; i < chars.length; i++){
			    ArrayList <String> list = new ArrayList <String> (); //strings ���ҵ��� n�ڸ��� ���ĺ��� ������ ���ҵ鸸 ���� �迭
			
	            for (int j = 0; j < strings.length; j++){
			        boolean b = strings[j].substring(n,n + 1).equals(chars[i]); //n��° �ڸ����� ������ ��
			        if (b){ //������ n��° �ڸ����� �����ϴٸ�
					   if (!list.contains(strings[j])) {  //���Ҹ� list�� �ֱ����� ����ִ��� Ȯ��
					        list.add(strings[j]); 
							}//if
	                    
						    Collections.sort(list);
						    }//if
					}//for j
				
	            for (int k = 0; k < list.size(); k++){
					boolean b = set.add(list.get(k));
				    if (b){
						answer.add(list.get(k));
					}//if
					
					}//for k
					list.clear();
				
			}//for i
	        return answer;
	    }
	}
/*���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (0.31ms, 53.5MB)
�׽�Ʈ 2 ��	��� (0.34ms, 52.5MB)
�׽�Ʈ 3 ��	��� (0.95ms, 52.2MB)
�׽�Ʈ 4 ��	��� (0.96ms, 53.3MB)
�׽�Ʈ 5 ��	��� (0.39ms, 52.2MB)
�׽�Ʈ 6 ��	��� (1.08ms, 52MB)
�׽�Ʈ 7 ��	��� (0.51ms, 52MB)
�׽�Ʈ 8 ��	��� (0.44ms, 55.8MB)
�׽�Ʈ 9 ��	��� (1.37ms, 52.1MB)
�׽�Ʈ 10 ��	��� (1.61ms, 53MB)
�׽�Ʈ 11 ��	��� (0.35ms, 52MB)
�׽�Ʈ 12 ��	��� (2.04ms, 54.1MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0*/