package level1;

// [1��] �������
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String line ="";

        answer = FirstSolution(n, arr1, arr2); // ù ��° Ǯ��
        // answer = SecondSolution(n, arr1, arr2); // �� ��° Ǯ�� (�ð��� �� ���� �ɸ�)

        return answer;
    }

    // ù ��° Ǯ�� (�ڸ����� ���� �� �ݺ����� StringBuilder�� insert ���)
    private String[] FirstSolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder line = new StringBuilder();

        for (int i = 0; i < n; i++) {
            line.setLength(0);
            line.append(Integer.toBinaryString(arr1[i]|arr2[i]).replaceAll("1","#").replaceAll("0"," "));
            
            // �ڸ��� ���߱�
            if (line.length() < n) {
                while (line.length() < n) {
                    line.insert(0," ");
                }
            }
            answer[i] = line.toString();
        }

        return answer;
    }

    // �� ��° Ǯ�� (�ڸ����� ���� �� String.format ���)
    private String[] SecondSolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String line = "";

        for (int i = 0; i < n; i++) {
            line = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]|arr2[i])).replaceAll("1","#").replaceAll("0"," ");
            answer[i] = line;
        }

        return answer;
    }
}