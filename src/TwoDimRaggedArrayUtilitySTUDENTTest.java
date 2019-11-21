//package assignment5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENTTest {
	//create several (more than 2) data sets for testing. These data sets must be different
	//then the data sets in TwoDimRaggedArrayUtilityTest
	private double[][] dataset1 = {{-1.5, -98.0, -2.7}, {92.2}, {73.4, 13.1, -19.0}, {-0.7, 10.2}};
	private double[][] dataset2 = {{-9.7, 83.2}, {31.5, -16.7, 40.7}, {-16.0, -92.7}, {71.5, 5.6, 54.0}};
	private double[][] dataset3 = {{80.2}, {91.3, -24.4}, {-96.1, -25.8, 1.5}, {42.5}, {12.1, 11.3}, {-7.5}};

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		//set your data sets to null
		dataset1 = dataset2 = dataset3 = null;
	}

	/**
	 * Test getTotal method
	 * Returns the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotalSTUDENT() {
		//Test for all your data sets
		assertEquals(67.0,TwoDimRaggedArrayUtility.getTotal(dataset1),.001);
		assertEquals(151.399,TwoDimRaggedArrayUtility.getTotal(dataset2),.001);
		assertEquals(85.1,TwoDimRaggedArrayUtility.getTotal(dataset3),.001);
	}

	/**
	 * Test getAverage method
	 * Returns the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverageSTUDENT() {
		//Test for all your data sets
		assertEquals(7.444,TwoDimRaggedArrayUtility.getAverage(dataset1),.001);
		assertEquals(15.139,TwoDimRaggedArrayUtility.getAverage(dataset2),.001);
		assertEquals(8.51,TwoDimRaggedArrayUtility.getAverage(dataset3),.001);
	}

	
	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotalSTUDENT() {
		//Test for at least 2 rows within each data set
		assertEquals(92.2,TwoDimRaggedArrayUtility.getRowTotal(dataset1,1),.001);
		assertEquals(-102.2,TwoDimRaggedArrayUtility.getRowTotal(dataset1,0),.001);
		assertEquals(55.5,TwoDimRaggedArrayUtility.getRowTotal(dataset2,1),.001);
		assertEquals(73.5,TwoDimRaggedArrayUtility.getRowTotal(dataset2,0),.001);
		assertEquals(42.5,TwoDimRaggedArrayUtility.getRowTotal(dataset3,3),.001);
		assertEquals(66.9,TwoDimRaggedArrayUtility.getRowTotal(dataset3,1),.001);
		
	}
	

	/**
	 * Test getColumnTotal method
	 * Returns the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotalSTUDENT() {
		//Test for at least 2 columns in each data set
		assertEquals(163.400,TwoDimRaggedArrayUtility.getColumnTotal(dataset1,0),.001);
		assertEquals(-74.7,TwoDimRaggedArrayUtility.getColumnTotal(dataset1,1),.001);
		assertEquals(94.7,TwoDimRaggedArrayUtility.getColumnTotal(dataset2,2),.001);
		assertEquals(-20.6,TwoDimRaggedArrayUtility.getColumnTotal(dataset2,1),.001);
		assertEquals(122.5,TwoDimRaggedArrayUtility.getColumnTotal(dataset3,0),.001);
		assertEquals(-38.900,TwoDimRaggedArrayUtility.getColumnTotal(dataset3,1),.001);
	}
	

	/**
	 * Test getHighestInRow method
	 * Returns the largest of all the elements in the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetHighestInRowSTUDENT() {
		//Test for at least 2 rows within each data set
		assertEquals(-1.5,TwoDimRaggedArrayUtility.getHighestInRow(dataset1,0),.001);
		assertEquals(73.4,TwoDimRaggedArrayUtility.getHighestInRow(dataset1,2),.001);
		assertEquals(40.7,TwoDimRaggedArrayUtility.getHighestInRow(dataset2,1),.001);
		assertEquals(-16.0,TwoDimRaggedArrayUtility.getHighestInRow(dataset2,2),.001);
		assertEquals(80.2,TwoDimRaggedArrayUtility.getHighestInRow(dataset3,0),.001);
		assertEquals(91.3,TwoDimRaggedArrayUtility.getHighestInRow(dataset3,1),.001);	
		
	}

	/**
	 * Test getHighestInRowIndex method
	 * Returns the index of the largest of all the elements in the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetHighestInRowIndexSTUDENT() {
		//Test for at least 2 rows within each data set
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataset1,0),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataset1,2),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataset2,1),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataset2,2),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataset3,0),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataset3,1),.001);		
		
	}
	
	
	/**
	 * Test getLowestInColumn method
	 * Returns the smallest of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */

	@Test
	public void testGetLowestInColumnSTUDENT() {
		//Test for at least 2 columns in each data set
		assertEquals(-98.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataset1,1),.001);
		assertEquals(-1.5,TwoDimRaggedArrayUtility.getLowestInColumn(dataset1,0),.001);
		assertEquals(-92.7,TwoDimRaggedArrayUtility.getLowestInColumn(dataset2,1),.001);
		assertEquals(-16.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataset2,0),.001);
		assertEquals(-25.8,TwoDimRaggedArrayUtility.getLowestInColumn(dataset3,1),.001);
		assertEquals(-96.1,TwoDimRaggedArrayUtility.getLowestInColumn(dataset3,0),.001);
	}

	/**
	 * Test getLowestInColumnIndex method
	 * Returns the index of the smallest of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */

	@Test
	public void testGetLowestInColumnIndexSTUDENT() {
		//Test for at least 2 columns in each data set
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataset1,1),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataset1,0),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataset2,1),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataset2,0),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataset3,1),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataset3,0),.001);
	}
	

	/**
	 * Test getLowestInArray method
	 * Returns the smallest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetLowestInArraySTUDENT() {
		//Test for each data set
		assertEquals(-98.0,TwoDimRaggedArrayUtility.getLowestInArray(dataset1),.001);
		assertEquals(-92.7,TwoDimRaggedArrayUtility.getLowestInArray(dataset2),.001);
		assertEquals(-96.1,TwoDimRaggedArrayUtility.getLowestInArray(dataset3),.001);
	}
	
	
	
}
