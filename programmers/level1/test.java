package level1;

import java.util.List;

public class test {

	public static void main(String[] args) {
		
		// 모의고사
		/*int[] test = {1,3,5,2,1,2,3,4,1,2,3,5};
		MockExam exam = new MockExam();
		List<Integer> ans = exam.solution(test);
		System.out.println(ans);*/
		
		// 완주하지 못한 선수
		/*Marathon ma = new Marathon();
		String[] p = {"mislav", "stanko", "mislav", "ana"};
		String[] c = {"stanko", "ana", "mislav"};
		System.out.println(ma.solution(p,c));*/
		
		// 체육복
		/*GymSuit suit = new GymSuit();
		int num = 6;
		int[] lost = {1,2,3,4,6};
		int[] reserve = {1,2,3,4,5,6};
		System.out.println(suit.solution(num, lost, reserve));*/
		
		// 가운데 글자 가져오기
		/*MiddleLetter ml = new MiddleLetter();
		String str = "test";
		System.out.println(ml.solution(str));*/
		
		// 2016년
		/*GetDay d = new GetDay();
		System.out.println(d.solution(5,24));*/
		
		// 두 정수 사이의 합
		/*SumBetween s = new SumBetween();
		System.out.println(s.solution(-4,3));*/
		
		// 신규 아이디 추천
		/*RecommendID newID = new RecommendID();
		System.out.println(newID.solution("abcdefghijklmn.p"));*/
		
		// 정수 내림차순으로 배치하기
		/*IntegerDescending sortNum = new IntegerDescending();
		System.out.println(sortNum.solution(1034542333));*/
		
		// 두 개 뽑아서 더하기
		/*int[] numbers = {5,0,2,7};
		SelectAndAdd add = new SelectAndAdd();
		System.out.println(add.solution(numbers));*/
		
		// 크레인 인형뽑기 게임
		/*int[][] board = {{0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}};
		int[] moves = {1, 2, 3, 3, 2, 3, 1};
		ClawCrane game = new ClawCrane();
		System.out.println(game.solution(board,moves));*/
		
		// 예산
		/*Budget b = new Budget();
		int[] request = {1,3,2,5,4};
		System.out.println(b.solution(request,9));*/
		
		// 실패율
		/*FailureRate rate = new FailureRate();
		int[] stages = {2, 1, 10, 6, 2, 4, 3, 3};
		int stage = 11;
		System.out.println(rate.solution(stage, stages));*/
		
		// 키패드 누르기
		/*Keypad btn = new Keypad();
		int[] nums = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		System.out.println(btn.solution(nums, hand));*/
	}

}
