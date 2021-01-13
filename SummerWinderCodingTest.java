package com.oopsw.test;
/*logo
�ڵ��׽�Ʈ ����
Summer/Winter Coding(~2018)
����
����
������ �ɼ�
����
���� ����
S�翡���� �� �μ��� �ʿ��� ��ǰ�� ������ �ֱ� ���� �μ����� ��ǰ�� �����ϴµ� �ʿ��� �ݾ��� �����߽��ϴ�. �׷���, ��ü ������ ������ �ֱ� ������ ��� �μ��� ��ǰ�� ������ �� ���� �����ϴ�. �׷��� �ִ��� ���� �μ��� ��ǰ�� ������ �� �� �ֵ��� �Ϸ��� �մϴ�.

��ǰ�� ������ �� ���� �� �μ��� ��û�� �ݾ׸�ŭ�� ��� ������ ��� �մϴ�. ���� ��� 1,000���� ��û�� �μ����� ��Ȯ�� 1,000���� �����ؾ� �ϸ�, 1,000������ ���� �ݾ��� ������ �� ���� �����ϴ�.

�μ����� ��û�� �ݾ��� ����ִ� �迭 d�� ���� budget�� �Ű������� �־��� ��, �ִ� �� ���� �μ��� ��ǰ�� ������ �� �ִ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
d�� �μ����� ��û�� �ݾ��� ����ִ� �迭�̸�, ����(��ü �μ��� ����)�� 1 �̻� 100 �����Դϴ�.
d�� �� ���Ҵ� �μ����� ��û�� �ݾ��� ��Ÿ����, �μ��� ��û �ݾ��� 1 �̻� 100,000 ������ �ڿ����Դϴ�.
budget�� ������ ��Ÿ����, 1 �̻� 10,000,000 ������ �ڿ����Դϴ�.
����� ��
d	budget	result
[1,3,2,5,4]	9	3
[2,2,3,3]	10	4
����� �� ����
����� �� #1
�� �μ����� [1��, 3��, 2��, 5��, 4��]��ŭ�� �ݾ��� ��û�߽��ϴ�. ���࿡, 1��, 2��, 4���� ��û�� �μ��� ��ǰ�� �������ָ� ���� 9������ 7���� �Һ�Ǿ� 2���� �����ϴ�. �׻� ��Ȯ�� ��û�� �ݾ׸�ŭ ������ ��� �ϹǷ� ���� 2������ ������ �μ��� ������ ���� �ʽ��ϴ�. �� ��� �ܿ� 3�� �μ��� ������ �� ������� ������ �����ϴ�.

1��, 2��, 3���� ��û�� �μ��� ��ǰ�� �������ַ��� 6���� �ʿ��մϴ�.
1��, 2��, 5���� ��û�� �μ��� ��ǰ�� �������ַ��� 8���� �ʿ��մϴ�.
1��, 3��, 4���� ��û�� �μ��� ��ǰ�� �������ַ��� 8���� �ʿ��մϴ�.
1��, 3��, 5���� ��û�� �μ��� ��ǰ�� �������ַ��� 9���� �ʿ��մϴ�.
3�� �μ����� �� ���� �μ��� ��ǰ�� ������ �� ���� �����Ƿ� �ִ� 3�� �μ��� ��ǰ�� ������ �� �� �ֽ��ϴ�.

����� �� #2
��� �μ��� ��ǰ�� �������ָ� 10���� �˴ϴ�. ���� �ִ� 4�� �μ��� ��ǰ�� ������ �� �� �ֽ��ϴ�.*/
import java.util.Arrays;

public class SummerWinderCodingTest {

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
            for (int i = 0; i < d.length; i++){
                if (budget - d[i] >= 0){
                        budget -= d[i];
                        answer ++;
                 }else{
                    break;
                }
             }
        return answer;
    }
}
/*���� ���
ä���� �����մϴ�.
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (3.22ms, 52.5MB)
�׽�Ʈ 2 ��	��� (0.46ms, 51.8MB)
�׽�Ʈ 3 ��	��� (0.45ms, 52.3MB)
�׽�Ʈ 4 ��	��� (0.52ms, 52.6MB)
�׽�Ʈ 5 ��	��� (0.46ms, 52.9MB)
�׽�Ʈ 6 ��	��� (0.46ms, 53.1MB)
�׽�Ʈ 7 ��	��� (0.47ms, 52.6MB)
�׽�Ʈ 8 ��	��� (0.48ms, 52.2MB)
�׽�Ʈ 9 ��	��� (0.48ms, 52.6MB)
�׽�Ʈ 10 ��	��� (0.47ms, 52.5MB)
�׽�Ʈ 11 ��	��� (0.53ms, 52.8MB)
�׽�Ʈ 12 ��	��� (0.48ms, 53.1MB)
�׽�Ʈ 13 ��	��� (0.47ms, 53MB)
�׽�Ʈ 14 ��	��� (0.54ms, 54.4MB)
�׽�Ʈ 15 ��	��� (3.81ms, 52.9MB)
�׽�Ʈ 16 ��	��� (0.50ms, 51.9MB)
�׽�Ʈ 17 ��	��� (0.52ms, 52.5MB)
�׽�Ʈ 18 ��	��� (0.53ms, 52MB)
�׽�Ʈ 19 ��	��� (0.49ms, 52.5MB)
�׽�Ʈ 20 ��	��� (0.46ms, 52.6MB)
�׽�Ʈ 21 ��	��� (0.44ms, 52.9MB)
�׽�Ʈ 22 ��	��� (0.46ms, 52.3MB)
�׽�Ʈ 23 ��	��� (0.50ms, 52.5MB)
ä�� ���
��Ȯ��: 100.0
�հ�: 100.0 / 100.0*/