//package assignment5;

public class HolidayBonus {
	
	public HolidayBonus() {
		
	}
	
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonuses = new double[data.length];
		for (int row = 0; row < bonuses.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				if (data[row][column] >= 0) {
					if (data[row][column] == TwoDimRaggedArrayUtility.getHighestInColumn(data, column)) {
						bonuses[row] += high;
					} else if (data[row][column] == TwoDimRaggedArrayUtility.getLowestInColumn(data, column)) {
						bonuses[row] += low;
					} else {
						bonuses[row] += other;
					}
				}
			}
		}
		return bonuses;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonuses = calculateHolidayBonus(data, high, low, other);
		double holidayBonuses = 0;
		for (int row = 0; row < bonuses.length; row++) {
			holidayBonuses += bonuses[row];
		}
		return holidayBonuses;
	}
}
