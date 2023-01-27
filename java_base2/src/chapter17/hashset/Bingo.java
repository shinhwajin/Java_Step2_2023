package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();
		int[][] board = new int[5][5];

		for (int i = 0; set.size() < 25; i++) { // set�̶�� hashset�� 5x5 �������� �־���
			set.add(new Random().nextInt(50) + 1);
		}

		Iterator<Integer> it = set.iterator(); // set�� iterator�� ,,?

		for (int i = 0; i < board.length; i++) { // board��� 5x5 �迭�濡 hashset �־���
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (int) it.next();
				System.out.printf("%2d ", board[i][j]);
			}
			System.out.println();
		}

	}

}