/*�ڵ��׽�Ʈ ����
�ؽ�
��ȭ��ȣ ���
����
������ �ɼ�
��ȭ��ȣ ���
���� ����
��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

������ : 119
���ؿ� : 97 674 223
������ : 11 9552 4421
��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
����� ����
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false
����� �� ����
����� �� #1
�տ��� ������ ���� �����ϴ�.

����� �� #2
�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 �����Ƿ�, ���� true�Դϴ�.

����� �� #3
ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�.

�˸�

2019�� 5�� 13��, �׽�Ʈ ���̽��� ����Ǿ����ϴ�. �̷� ���� ������ ����ϴ� �ڵ尡 �� �̻� ������� ���� �� �ֽ��ϴ�.
*/

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int numberSize = 0;
        for(int i=0;i<phone_book.length;i++){
            numberSize = phone_book[i].length();
            for(int j=0; j<phone_book.length; j++){
                String cutted = phone_book[j].substring(0,numberSize);
                if(!phone_book[i].equals(phone_book[j]) && phone_book[i].equals(cutted)){
                answer = false;
                    return answer;
            }
        }
    } return answer;
}
}

/*
���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	���� (��Ÿ�� ����)
�׽�Ʈ 2 ��	��� (0.03ms, 51.9MB)
�׽�Ʈ 3 ��	��� (0.02ms, 52.9MB)
�׽�Ʈ 4 ��	��� (0.02ms, 52.5MB)
�׽�Ʈ 5 ��	���� (��Ÿ�� ����)
�׽�Ʈ 6 ��	���� (��Ÿ�� ����)
�׽�Ʈ 7 ��	���� (��Ÿ�� ����)
�׽�Ʈ 8 ��	���� (��Ÿ�� ����)
�׽�Ʈ 9 ��	���� (��Ÿ�� ����)
�׽�Ʈ 10 ��	��� (0.04ms, 52.4MB)
�׽�Ʈ 11 ��	���� (��Ÿ�� ����)
ȿ����  �׽�Ʈ
�׽�Ʈ 1 ��	���� (��Ÿ�� ����)
�׽�Ʈ 2 ��	���� (��Ÿ�� ����)
ä�� ���
��Ȯ��: 30.8
ȿ����: 0.0
�հ�: 30.8 / 100.0 
*/
-------------------------------------------------------------------------------------

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int numberSize = 0;
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length;i++){
            numberSize = phone_book[i].length();
            for(int j=0; j<phone_book.length; j++){
                String cutted = phone_book[j].substring(0,numberSize);
                if(!phone_book[i].equals(phone_book[j]) && phone_book[i].equals(cutted)){
                answer = false;
                    return answer;
            }
        }
    } return answer;
}
}
���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	���� (��Ÿ�� ����)
�׽�Ʈ 2 ��	��� (0.55ms, 52.9MB)
�׽�Ʈ 3 ��	��� (0.23ms, 52.4MB)
�׽�Ʈ 4 ��	��� (0.24ms, 52.3MB)
�׽�Ʈ 5 ��	���� (��Ÿ�� ����)
�׽�Ʈ 6 ��	���� (��Ÿ�� ����)
�׽�Ʈ 7 ��	���� (��Ÿ�� ����)
�׽�Ʈ 8 ��	��� (0.20ms, 52.9MB)
�׽�Ʈ 9 ��	��� (0.22ms, 52.6MB)
�׽�Ʈ 10 ��	��� (0.23ms, 52.1MB)
�׽�Ʈ 11 ��	���� (��Ÿ�� ����)
ȿ����  �׽�Ʈ
�׽�Ʈ 1 ��	��� (21.57ms, 56.5MB)
�׽�Ʈ 2 ��	��� (27.17ms, 59.9MB)
ä�� ���
��Ȯ��: 46.2
ȿ����: 15.4
�հ�: 61.5 / 100.0