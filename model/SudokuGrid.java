package com.mayank.sudokuvalidator.model;

import java.util.Scanner;

public class SudokuGrid {
	private int[][] grid;

	public SudokuGrid() {
		grid = new int[9][9];
	}

	public SudokuGrid(int[][] grid) {
		setGrid(grid);
	}

	public int[][] getGrid() {
		return grid;
	}

	public void setGrid(int[][] grid) {
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				this.grid[i][j] = grid[i][j];
	}

	public void playGame(Scanner scanner) {
		boolean chk = true;
		while (chk) {
			System.out.println("Press 1 for Easy Level.");
			System.out.println("Press 2 for Medium Level.");
			System.out.println("Press 3 for Hard Level.");
			System.out.println("Press 4 for Exit.");

			int key = UtilityFunction.getIntInput(scanner, "Enter  1, 2, 3 or 4: ");
			switch (key) {

			case 1:
				grid = new int[9][9];
				System.out.println("Generated Sudoku:\n");
				RandomGenerate.fillBoard(grid);
				RandomGenerate.removeElementFromGrid(grid, 6);
				UtilityFunction.printGrid(grid);
				InputFromUser.takingInputFromUser(grid, scanner);
				System.out.println("You Won The Game!!!");
				break;

			case 2:
				grid = new int[9][9];
				System.out.println("Generated Sudoku:\n");
				RandomGenerate.fillBoard(grid);
				RandomGenerate.removeElementFromGrid(grid, 15);
				UtilityFunction.printGrid(grid);
				InputFromUser.takingInputFromUser(grid, scanner);
				System.out.println("You Won The Game!!!");
				break;

			case 3:
				grid = new int[9][9];
				System.out.println("Generated Sudoku:\n");
				RandomGenerate.fillBoard(grid);
				RandomGenerate.removeElementFromGrid(grid, 25);
				UtilityFunction.printGrid(grid);
				InputFromUser.takingInputFromUser(grid, scanner);
				System.out.println("You Won The Game!!!");
				break;

			case 4:
				System.out.println("Exiting!!!");
				chk = false;
				break;

			default:
				System.out.println("Enter 1,2,3 or 4");
			}
		}
	}
}