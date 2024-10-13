package com.org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CellFlagTest {
	public List<int[]> getThem(List<int[]> theList) {
		List<int[]> list1 = new ArrayList<int[]>();
		for(int [] x : theList)
			if(x[0] == 4)
				list1.add(x);
		return list1;

	}

	private static final int STATUS_VALUE = 0;
	private static final int FLAGGED = 4;

	public List<int[]> getFlaggedCells(List<int[]> gameBoard) {
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for(int[] cell : gameBoard)
			if(cell[STATUS_VALUE] == FLAGGED)
				flaggedCells.add(cell);
		return flaggedCells;
	}

	public static List<Cell> getFlaggedCells2(List<Cell> gameBoard) {
		List<Cell> flaggedCells = new ArrayList<Cell>();
		for(Cell cell : gameBoard)
			if(cell.isFlagged())
				flaggedCells.add(cell);
		return flaggedCells;
	}

	public static void main(String[] args) {
		Cell cell1 = new Cell(new int[] {1, 100, 11, 123});
		Cell cell2 = new Cell(new int[] {2, 200, 22, 234});
		Cell cell3 = new Cell(new int[] {3, 300, 33, 345});
		Cell cell4 = new Cell(new int[] {4, 400, 44, 456});
		Cell cell5 = new Cell(new int[] {4, 500, 55, 567});

		List<Cell> gameBoard = Arrays.asList(cell1, cell2, cell3, cell4, cell5);
		for(Cell flaggedCell : getFlaggedCells2(gameBoard)) {
			System.out.println(flaggedCell.getCelIndexOne());
		}
	}
}
