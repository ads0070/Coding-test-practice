package level1;

// ���￡�� �輭�� ã��
public class FindKim {
    public String solution(String[] seoul) {
        String answer = "";
        int loc = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                loc = i;
                break;
            }
        }
        answer = "�輭���� " + loc + "�� �ִ�";

        return answer;
    }
}