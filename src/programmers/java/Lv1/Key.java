package programmers.java.Lv1;

class Key {
	int[][] board = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 }, { 2, 2 },
			{ 3, 0 }, { 3, 1 }, { 3, 2 } };

	public int distance(int numbers, int Pos) {
		int xx = Math.abs((board[Pos - 1][0]) - (board[numbers - 1][0]));
		int yy = Math.abs((board[Pos - 1][1]) - (board[numbers - 1][1]));
		return (xx + yy);
	}

	public String solution(int[] numbers, String hand) {
		String answer = "";

		int leftPos = 10; // *
		int rightPos = 12; // #
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) { // 1, 4, 7
				answer += "L";
				leftPos = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) { // 3, 6, 9
				answer += "R";
				rightPos = numbers[i];
			} else {
				if (numbers[i] == 0)
					numbers[i] = 11;

				int ll = distance(numbers[i], leftPos);
				int rr = distance(numbers[i], rightPos);

				if (ll > rr) {
					answer += "R";
					rightPos = numbers[i];
				} else if (ll < rr) {
					answer += "L";
					leftPos = numbers[i];
				} else {
					if (hand.equals("right")) {
						answer += "R";
						rightPos = numbers[i];
					} else {
						answer += "L";
						leftPos = numbers[i];
					}
				}
			}
		}
		return answer;
	}
}
