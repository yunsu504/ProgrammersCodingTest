/*�ڵ��׽�Ʈ ����
�ؽ�
�������� ���� ����

���� ����
������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
����� ��
participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
����� �� ����
���� #1
leo�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #2
vinko�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #3
mislav�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
*/

import java.util.*;

class Solution {

    public String solution(String[] participant, String[] completion) {
        String answer = "";        
        ArrayList<String> all = new ArrayList<String>();
        for(int i = 0 ; i < participant.length ; i++){
        all.add(participant[i]);
        }
        for(int i = 0 ; i < completion.length ; i++){
            if(all.contains(completion[i])){
                all.remove(completion[i]);
            }
        }
        answer = all.get(0);
        return answer;
  }
}
/*���� ���
���� �ڵ�� ä���� ����� �ֽ��ϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (0.06ms, 53.1MB)
�׽�Ʈ 2 ��	��� (0.06ms, 52.9MB)
�׽�Ʈ 3 ��	��� (4.95ms, 53.3MB)
�׽�Ʈ 4 ��	��� (17.03ms, 53MB)
�׽�Ʈ 5 ��	��� (17.15ms, 54.1MB)
ȿ����  �׽�Ʈ
�׽�Ʈ 1 ��	���� (�ð� �ʰ�)
�׽�Ʈ 2 ��	���� (�ð� �ʰ�)
�׽�Ʈ 3 ��	���� (�ð� �ʰ�)
�׽�Ʈ 4 ��	���� (�ð� �ʰ�)
�׽�Ʈ 5 ��	���� (�ð� �ʰ�)
ä�� ���
��Ȯ��: 50.0
ȿ����: 0.0
�հ�: 50.0 / 100.0*/

------------------------------------------------------------------------------------------