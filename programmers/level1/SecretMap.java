package level1;

// [1차] 비밀지도
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String line ="";

        answer = FirstSolution(n, arr1, arr2); // 첫 번째 풀이
        // answer = SecondSolution(n, arr1, arr2); // 두 번째 풀이 (시간이 더 오래 걸림)

        return answer;
    }

    // 첫 번째 풀이 (자릿수를 맞출 때 반복문과 StringBuilder의 insert 사용)
    private String[] FirstSolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder line = new StringBuilder();

        for (int i = 0; i < n; i++) {
            line.setLength(0);
            line.append(Integer.toBinaryString(arr1[i]|arr2[i]).replaceAll("1","#").replaceAll("0"," "));
            
            // 자릿수 맞추기
            if (line.length() < n) {
                while (line.length() < n) {
                    line.insert(0," ");
                }
            }
            answer[i] = line.toString();
        }

        return answer;
    }

    // 두 번째 풀이 (자릿수를 맞출 때 String.format 사용)
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