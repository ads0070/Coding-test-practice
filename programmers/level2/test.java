package level2;

public class test {

    public static void main(String[] args) {

        // 프린터
        /*Printer p = new Printer();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int loc = 0;
        System.out.println(p.solution(priorities, loc));*/

        // 더 맵게
        MoreSpicy spicy = new MoreSpicy();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(spicy.solution(scoville, k));


    }

}
