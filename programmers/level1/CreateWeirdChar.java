package level1;

// �̻��� ���� �����
public class CreateWeirdChar {
    public String solution(String s) {
        String answer = "";
        StringBuilder word_builder = new StringBuilder();

        s = s.toLowerCase();
        s += ".";   // split �� �� ���ڿ� ���� ���� ���ڸ� �츮�� ���� ���ڿ� �� �ڿ� ��ħǥ(.)�� �ӽ÷� �߰�
        String[] word = s.split(" ");   // ������ �������� s ���ڿ��� split�Ͽ� word �迭�� ����

        for (int i = 0; i < word.length; i++) {
            word_builder.setLength(0);
            word_builder.append(word[i]);

            for (int j = 0; j < word[i].length(); j+=2) {
                word_builder.setCharAt(j, Character.toUpperCase(word_builder.charAt(j)));
            }
            
            // �ӽ÷� �߰��ߴ� ��ħǥ(.) ����
            if (i == word.length - 1) {
                word_builder.deleteCharAt(word[i].length() - 1);
            }

            word[i] = String.valueOf(word_builder);
        }

        answer = String.join(" ",word); // word �迭�� �� ������ ������ �ΰ� join���� ���ڿ��� ��ȯ

        return answer;
    }
}
