package com.org.example;

public class Cell {
	private static final int STATUS_VALUE = 0;
	private static final int FLAGGED = 4;

	private final int[] cell;

	public Cell(int[] cell) {
		this.cell = cell;
	}

	public boolean isFlagged() {
		return cell[STATUS_VALUE] == FLAGGED;
	}

	public int getCelIndexOne() {
		return cell[1];
	}
}
