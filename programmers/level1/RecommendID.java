package level1;

//�ű� ���̵� ��õ
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;

public class RecommendID {
	public String solution(String new_id) {
        String answer = "";
        int[] Special_Char = {45,46,95};
        
        // 1�ܰ�. new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ 
        new_id = new_id.toLowerCase();
        //System.out.println("1�ܰ�: "+new_id);
        
        // 2�ܰ�. new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
        byte bytes[] = new_id.getBytes(StandardCharsets.US_ASCII);	// new_id�� �ƽ�Ű�ڵ�� ��ȯ
        
        new_id = "";
        for (byte letter : bytes) {
        	// ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ��츸 new_id�� �߰�
        	if ((letter >= 97 && letter <= 122) || (letter >= 48 && letter <= 57) || IntStream.of(Special_Char).anyMatch(x -> x == letter)) {
        		new_id += (char)letter;	// �ƽ�Ű�ڵ��� letter�� char������ ��ȯ
        	}
        }
        //System.out.println("2�ܰ�: "+new_id);
        
        // 3�ܰ�. new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
        char[] chars = new_id.toCharArray();	// new_id�� ���ں��� �ɰ��� chars �迭�� ����
        char previous_letter = 'a';
        new_id = "";
           
        for (char letter : chars) {
        	if (letter == '.') {
        		if (letter == previous_letter) {
        			continue; // ��ħǥ(.)�� ���ӵǴ� ��� continue�Ͽ� new_id�� �߰����� �ʵ��� ��.
        		}
        	}
        	new_id += letter;
        	previous_letter = letter;
        }
        //System.out.println("3�ܰ�: "+new_id);
        
        // 4�ܰ�. new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
           
        if (new_id.charAt(0) == '.') {
        	new_id = new_id.substring(1); // �� �� ��ħǥ ����
        }
           
        if (!new_id.isEmpty() && new_id.charAt(new_id.length()-1) == '.') {
        	new_id = new_id.substring(0, new_id.length()-1); // �� �� ��ħǥ ����
        }
        //System.out.println("4�ܰ�: "+new_id);
        
        // 5�ܰ�. new_id�� �� ���ڿ��̶��, new_id�� "a"�� ����
        if (new_id.isEmpty()) {
        	new_id += 'a';
        }
        //System.out.println("5�ܰ�: "+new_id);
        
        // 6�ܰ�. new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� ����
        //		 ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� ����
        if (new_id.length() >= 16) {
        	new_id = new_id.substring(0, 15);
        	if (new_id.charAt(14) == '.') {
        		new_id = new_id.substring(0, 14);
        	}
        }
        //System.out.println("6�ܰ�: "+new_id);
        
        // 7�ܰ�. new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ����
        int len = new_id.length();
        char letter = new_id.charAt(new_id.length()-1);
        
        if (len <= 2) {
        	while (len <= 2) {
        		new_id += letter;
        		len++;
        	}
        }
        //System.out.println("7�ܰ�: "+new_id);
        
        answer = new_id;
        return answer;
    }
}
