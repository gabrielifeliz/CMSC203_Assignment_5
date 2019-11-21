//package assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	public TwoDimRaggedArrayUtility() {

	}

	public static double getAverage(double[][] data) {
		int count = 0;
		double total = 0;
		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				total += data[row][column];
				count++;
			}
		}

		return total/count;
	}

	public static double getColumnTotal(double[][] data, int col) {

		double colTotal = 0;

		for (int row = 0; row < data.length; row++) {

			if (col < data[row].length) {
				colTotal += data[row][col];
			}
		}

		return colTotal;

	}

	public static double getHighestInArray(double[][] data) {

		double highest = data[0][0];

		for (int row = 0; row < data.length; row++) {

			for (int col = 0; col < data[row].length; col++) {

				if (data[row][col] > highest) {

					highest = data[row][col];
				}			
			}
		}

		return highest;

	}

	public static double getHighestInColumn(double[][] data, int col) {

		int rowCheck = 0;
		double highest = data[0][0];
		while (rowCheck < data.length) {

			if (col < data[rowCheck].length) {
				highest = data[rowCheck][col];
				break;
			} else {
				rowCheck++;
			}

		}

		for (int row = 0; row < data.length; row++) {

			if (col < data[row].length)  {
				if (data[row][col] > highest) {
					highest = data[row][col];
				}
			}

		}

		return highest;

	}

	public static int getHighestInColumnIndex(double[][] data, int col) {

		int highest = 0;
		int rowCheck = 0;
		double highestElement = data[0][0];
		while (rowCheck < data.length) {

			if (col < data[rowCheck].length) {
				highestElement = data[rowCheck][col];
				break;
			} else {
				rowCheck++;
			}

		}

		for (int row = 0; row < data.length; row++) {

			if (col < data[row].length) {
				if (data[row][col] > highestElement) {
					highestElement = data[row][col];
					highest = row;
				}
			}

		}

		return highest;

	}

	public static double getHighestInRow(double[][] data, int row) {

		int colCheck = 0;
		double highest = data[0][0];
		while (colCheck < data.length) {

			if (colCheck < data[row].length) {
				highest = data[row][colCheck];
				break;
			} else {
				colCheck++;
			}

		}

		for (int col = 0; col < data[row].length; col++) {

			if (data[row][col] > highest) {
				highest = data[row][col];
			}

		}

		return highest;

	}

	public static int getHighestInRowIndex(double[][] data, int row) {

		int highest = 0;
		int colCheck = 0;
		double highestElement = data[0][0];
		while (colCheck < data.length) {

			if (colCheck < data[row].length) {
				highestElement = data[row][colCheck];
				break;
			} else {
				colCheck++;
			}

		}

		for (int col = 0; col < data[row].length; col++) {

			if (data[row][col] > highestElement) {
				highestElement = data[row][col];
				highest = col;
			}

		}

		return highest;

	}

	public static double getLowestInArray(double[][] data) {

		double lowest = data[0][0];

		for (int row = 0; row < data.length; row++) {

			for (int col = 0; col < data[row].length; col++) {

				if (data[row][col] < lowest) {

					lowest = data[row][col];
				}			
			}
		}

		return lowest;


	}

	public static double getLowestInColumn(double[][] data, int col) {

		int rowCheck = 0;
		double lowest = data[0][0];
		while (rowCheck < data.length) {

			if (col < data[rowCheck].length) {
				lowest = data[rowCheck][col];
				break;
			} else {
				rowCheck++;
			}

		}

		for (int row = 0; row < data.length; row++) {

			if (col < data[row].length) {
				if (data[row][col] < lowest) {
					lowest = data[row][col];
				}
			}
		}

		return lowest;

	}

	public static int getLowestInColumnIndex(double[][] data, int col) {

		int lowest = 0;
		int rowCheck = 0;
		double lowestElement = data[0][0];
		while (rowCheck < data.length) {

			if (col < data[rowCheck].length) {
				lowestElement = data[rowCheck][col];
				break;
			} else {
				rowCheck++;
			}

		}

		for (int row = 0; row < data.length; row++) {

			if (col < data[row].length) {
				if (data[row][col] < lowestElement) {
					lowestElement = data[row][col];
					lowest = row;
				}
			}

		}

		return lowest;

	}

	public static double getLowestInRow(double[][] data, int row) {

		int colCheck = 0;
		double lowest = data[0][0];
		while (colCheck < data.length) {

			if (colCheck < data[row].length) {
				lowest = data[row][colCheck];
				break;
			} else {
				colCheck++;
			}

		}

		for (int col = 0; col < data[row].length; col++) {

			if (data[row][col] < lowest) {
				lowest = data[row][col];
			}

		}

		return lowest;

	}

	public static int getLowestInRowIndex(double[][] data, int row) {

		int lowest = 0;
		int colCheck = 0;
		double lowestElement = data[0][0];
		while (colCheck < data.length) {

			if (colCheck < data[row].length) {
				lowestElement = data[row][colCheck];
				break;
			} else {
				colCheck++;
			}

		}

		for (int col = 0; col < data[row].length; col++) {

			if (data[row][col] < lowestElement) {
				lowestElement = data[row][col];
				lowest = col;
			}
		}

		return lowest;

	}

	public static double getRowTotal(double[][] data, int row) {

		double rowTotal = 0;

		for (int col = 0; col < data[row].length; col++) {

			rowTotal += data[row][col];
		}

		return rowTotal;

	}

	public static double getTotal(double[][] data) {
		double total = 0;
		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				total += data[row][column];
			}
		}
		return total;
	}

	public static double[][] readFile(File file) throws FileNotFoundException {

		String[][] input = new String[10][10];
		Scanner sc = new Scanner(file);
		int row = 0, col = 0;

		while (sc.hasNextLine()) {
			String[] currentRow = sc.nextLine().split(" ");
			for (col = 0; col < currentRow.length; col++) {
				input[row][col] = currentRow[col];
			}
			row++;
		}

		sc.close();

		double[][] sales = new double[row][];

		for (row = 0; row < sales.length; row++) {
			for (col = 0; input[row][col] != null; col++) {	}			
			sales[row] = new double[col];
			for (col = 0; col < sales[row].length; col++) {
				sales[row][col] = Double.parseDouble(input[row][col]);
			}
		}

		return sales;
	}

	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {

		PrintWriter file = new PrintWriter(outputFile);
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				file.print((col != 0) ? " " + data[row][col] : data[row][col]);
			}
			file.println();
		}

		file.close();
	}

}
