package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();
		int[][] board = new int[5][5];

		for (int i = 0; set.size() < 25; i++) { // set이라는 hashset에 5x5 랜덤숫자 넣어줌
			set.add(new Random().nextInt(50) + 1);
		}

		Iterator<Integer> it = set.iterator(); // set을 iterator로 ,,?

		for (int i = 0; i < board.length; i++) { // board라는 5x5 배열방에 hashset 넣어줌
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (int) it.next();
				System.out.printf("%2d ", board[i][j]);
			}
			System.out.println();
		}

	}

}