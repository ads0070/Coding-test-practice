package level1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		// ���ǰ��
		/*int[] test = {1,3,5,2,1,2,3,4,1,2,3,5};
		MockExam exam = new MockExam();
		List<Integer> ans = exam.solution(test);
		System.out.println(ans);*/
		
		// �������� ���� ����
		/*Marathon ma = new Marathon();
		String[] p = {"mislav", "stanko", "mislav", "ana"};
		String[] c = {"stanko", "ana", "mislav"};
		System.out.println(ma.solution(p,c));*/
		
		// ü����
		/*GymSuit suit = new GymSuit();
		int num = 6;
		int[] lost = {1,2,3,4,6};
		int[] reserve = {1,2,3,4,5,6};
		System.out.println(suit.solution(num, lost, reserve));*/
		
		// ��� ���� ��������
		/*MiddleLetter ml = new MiddleLetter();
		String str = "test";
		System.out.println(ml.solution(str));*/
		
		// 2016��
		/*GetDay d = new GetDay();
		System.out.println(d.solution(5,24));*/
		
		// �� ���� ������ ��
		/*SumBetween s = new SumBetween();
		System.out.println(s.solution(-4,3));*/
		
		// �ű� ���̵� ��õ
		/*RecommendID newID = new RecommendID();
		System.out.println(newID.solution("abcdefghijklmn.p"));*/
		
		// ���� ������������ ��ġ�ϱ�
		/*IntegerDescending sortNum = new IntegerDescending();
		System.out.println(sortNum.solution(1034542333));*/
		
		// �� �� �̾Ƽ� ���ϱ�
		/*int[] numbers = {5,0,2,7};
		SelectAndAdd add = new SelectAndAdd();
		System.out.println(add.solution(numbers));*/
		
		// ũ���� �����̱� ����
		/*int[][] board = {{0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}};
		int[] moves = {1, 2, 3, 3, 2, 3, 1};
		ClawCrane game = new ClawCrane();
		System.out.println(game.solution(board,moves));*/
		
		// ����
		/*Budget b = new Budget();
		int[] request = {1,3,2,5,4};
		System.out.println(b.solution(request,9));*/
		
		// ������
		/*FailureRate rate = new FailureRate();
		int[] stages = {2, 1, 10, 6, 2, 4, 3, 3};
		int stage = 11;
		System.out.println(rate.solution(stage, stages));*/
		
		// Ű�е� ������
		/*Keypad btn = new Keypad();
		int[] nums = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		System.out.println(btn.solution(nums, hand));*/

		// [1��] �������
		/*SecretMap map = new SecretMap();
		int n = 6;
		int[] map1 = {46, 33, 33 ,22, 31, 50};
		int[] map2 = {27 ,56, 19, 14, 14, 10};
		System.out.println(Arrays.toString(map.solution(n, map1, map2)));*/

		// ���ڿ� �� p�� y�� ����
		/*CountPY py = new CountPY();
		String s = "pPoooyY";
		System.out.println(py.solution(s));*/

		// ���ڿ� �ٷ�� �⺻
		/*ValidatingStrings vs = new ValidatingStrings();
		System.out.println(vs.solution("1256"));*/

		// ���ڿ� ������������ ��ġ�ϱ�
		/*SortDescending sortStr = new SortDescending();
		System.out.println(sortStr.solution("Zcdgeab"));*/

		// ���ڿ��� ������ �ٲٱ�
		/*StringToInteger convert = new StringToInteger();
		System.out.println(convert.solution("-1234"));*/

		// ���ڿ� �� ������� �����ϱ�
		/*SortAtWill atwill = new SortAtWill();
		String[] str = {"abce", "abcd", "cdx"};
		System.out.println(Arrays.toString(atwill.solution(str, 2)));*/

		// �ڵ��� ��ȣ ������
		/*HideNumber hn = new HideNumber();��ȣȭ
		System.out.println(hn.solution("01033334444"));*/

		// ���� ��ȣ
		/*CaesarCipher encryption = new CaesarCipher();
		String s = "a B z";
		int n = 4;
		System.out.println(encryption.solution(s, n));*/

		// �ݶ��� ����
		/*CollatzGuess guess = new CollatzGuess();
		System.out.println(guess.solution(626331));*/

		// �ϻ��� ��
		/*HarshadNumber harshadNum = new HarshadNumber();
		System.out.println(harshadNum.solution(13));*/

		// K��°��
		KthNumber knum = new KthNumber();
		int[] arr = {1, 5, 10, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		System.out.println(Arrays.toString(knum.solution(arr, commands)));

	}

}
