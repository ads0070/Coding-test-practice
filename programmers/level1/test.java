package level1;

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

		// ����
		/*DotProduct dot = new DotProduct();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(dot.solution(a, b));*/
		
		// ���ϸ�
		/*Pokemon poke = new Pokemon();
		int[] nums = {3,1,2,3};
		System.out.println(poke.solution(nums));*/
		
		// ���� ���ϱ�
		/*AddInteger add = new AddInteger();
		int[] abs = {4,7,12};
		boolean[] signs = {true,false,true};
		System.out.println(add.solution(abs, signs));*/
		
		// �ζ��� �ְ� ������ ���� ����
		/*Lotto lotto = new Lotto();
		int[] lottos = {1,2,3,4,5,6};
		int[] winNums = {7,8,9,10,11,12};
		int[] answer = lotto.solution(lottos, winNums);
		System.out.println(answer[0]+", "+answer[1]);*/
		
		// �Ҽ� �����
		/*MakePrimeNumber pnum = new MakePrimeNumber();
		int[] nums = {1,2,7,6,4};
		System.out.println(pnum.solution(nums));*/
		
		// 3���� ������
		/*FlipOver flip = new FlipOver();
		System.out.println(flip.solution(125));*/
		
		// ����� ������ ����
		/*Divisor div = new Divisor();
		System.out.println(div.solution(13, 17));*/
		
		// ���� ���ڿ��� ���ܾ�
		/*ChangeToNumber game = new ChangeToNumber();
		String str = "23four5six7";
		System.out.println(game.solution(str));*/
		
		// ���� ���ڴ� �Ⱦ�
		/*Deduplication deduplication = new Deduplication();
		int[] arr = {1,1,3,3,0,1,1};
		int[] answer = deduplication.solution(arr);
		for (int i : answer) System.out.println(i);*/

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
		/*KthNumber knum = new KthNumber();
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		System.out.println(Arrays.toString(knum.solution(arr, commands)));*/

		// ���￡�� �輭�� ã��
		/*FindKim find = new FindKim();
		String[] seoul = {"Jane", "Kim", "James", "Paul", "Oliver"};
		System.out.println(find.solution(seoul));*/

		// ���ڼ��ڼ��ڼ��ڼ��ڼ�?
		/*Watermelon wm = new Watermelon();
		System.out.println(wm.solution(3));*/

		// x��ŭ ������ �ִ� n���� ����
		/*IncreasingNum plus = new IncreasingNum();
		System.out.println(plus.solution(2, 10));*/

		// �̻��� ���� �����
		/*CreateWeirdChar weird = new CreateWeirdChar();
		System.out.println(weird.solution("try hello world"));*/

		// ���� ���� �� �����ϱ�
		/*RemoveSmallNum small = new RemoveSmallNum();
		int[] arr = {4,5,2,1};
		System.out.println(small.solution(arr));*/

		// ������ �������� ���� �迭
		/*DivisibleNumber divNum = new DivisibleNumber();
		int[] arr = {5, 9, 7, 10};
		System.out.println(divNum.solution(arr, 5));*/
		
		//���簢�� �����
		/*PrintStars star = new PrintStars();
		star.main(args);*/
		
		// �ڿ��� ������ �迭�� �����
		/*IntToArray arr = new IntToArray();
		System.out.println(arr.solution(12345));*/
		
		// [1��] ��Ʈ ����
		/*DartsGame dart = new DartsGame();
		System.out.println(dart.solution("1S2D*3T"));*/
		
		// ��� ���ϱ�
		/*GetAverage avg = new GetAverage();
		int[] arr = {1,2,3,4};
		System.out.println(avg.solution(arr));*/
		
		// ����� ��
		/*SumOfDivisors sumDiv = new SumOfDivisors();
		System.out.println(sumDiv.solution(12));*/

		// ���� ������ �Ǻ�
		/*SquareRoot isSqrt = new SquareRoot();
		System.out.println(isSqrt.solution(121));*/

		// ����� ����
		/*AdditionOfMatrices am = new AdditionOfMatrices();
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		System.out.println(Arrays.deepToString(am.solution(arr1, arr2)));*/

		// �ڸ��� ���ϱ�
		/*AddDigits ad = new AddDigits();
		System.out.println(ad.solution(123));*/

		// �ִ������� �ּҰ����
		/*GreatestAndLeast gl = new GreatestAndLeast();
		System.out.println(Arrays.toString(gl.solution(10, 20)));*/

		// ¦���� Ȧ��
		/*EvenAndOdd ed = new EvenAndOdd();
		System.out.println(ed.solution(3));*/

		// �Ҽ� ã��
		/*PrimeNumber pnum = new PrimeNumber();
		System.out.println(pnum.solution(10));*/

		// [1��] ��Ʈ ����
		/*DartsGame darts = new DartsGame();
		System.out.println(darts.solution("1S*2T*3S"));*/

	}
}
