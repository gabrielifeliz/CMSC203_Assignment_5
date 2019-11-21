//package assignment5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusSTUDENTTest {
	//create several (more than 2) data sets for testing. These data sets must be different
	//then the data sets in HolidayBonusTest
	private double[][] dataset1 = {{-1.5, -98.0, -2.7}, {92.2}, {73.4, 13.1, -19.0}, {-0.7, 10.2}};
	private double[][] dataset2 = {{-9.7, 83.2}, {31.5, -16.7, 40.7}, {-16.0, -92.7}, {71.5, 5.6, 54.0}};
	private double[][] dataset3 = {{80.2}, {91.3, -24.4}, {-96.1, -25.8, 1.5}, {42.5}, {12.1, 11.3}, {-7.5}};

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	/**
	 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
	 */

	@Test
	public void testCalculateHolidayBonusSTUDENTA() {
		//test for each of your data sets
		double[] result = HolidayBonus.calculateHolidayBonus(dataset1,5000,1000,2000);
		assertEquals(0.0,result[0],.001);
		assertEquals(5000.0,result[1],.001);
		assertEquals(7000.0,result[2],.001);
		assertEquals(2000.0,result[3],.001);

		result = HolidayBonus.calculateHolidayBonus(dataset2,5000,1000,2000);
		assertEquals(5000.0,result[0],.001);
		assertEquals(3000.0,result[1],.001);
		assertEquals(0.0,result[2],.001);
		assertEquals(12000.0,result[3],.001);

		result = HolidayBonus.calculateHolidayBonus(dataset3,5000,1000,2000);
		assertEquals(2000.0,result[0],.001);
		assertEquals(5000.0,result[1],.001);
		assertEquals(5000.0,result[2],.001);
		assertEquals(2000.0,result[3],.001);
	}


	/**
	 * Test calculateHolidayBonus method with a high of 1000, low of 250 and 500 as other
	 */

	@Test
	public void testCalculateHolidayBonusSTUDENTB() {
		//test for each of your data sets
		try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataset1,1000,250,500);
			assertEquals(0.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(1500.0,result[2],.001);
			assertEquals(500.0,result[3],.001);

			result = HolidayBonus.calculateHolidayBonus(dataset2,1000,250,500);
			assertEquals(1000.0,result[0],.001);
			assertEquals(750.0,result[1],.001);
			assertEquals(0.0,result[2],.001);
			assertEquals(2500.0,result[3],.001);

			result = HolidayBonus.calculateHolidayBonus(dataset3,1000,250,500);
			assertEquals(500.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(1000.0,result[2],.001);
			assertEquals(500.0,result[3],.001);
			
		}
		catch (Exception e) {
			fail("This should not have caused an Exception");
		} 
	}

	/**
	 * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		//test for each of your data sets
		assertEquals(14000.0,HolidayBonus.calculateTotalHolidayBonus(dataset1, 5000, 1000, 2000),.001);
		assertEquals(20000.0,HolidayBonus.calculateTotalHolidayBonus(dataset2, 5000, 1000, 2000),.001);
		assertEquals(21000.0,HolidayBonus.calculateTotalHolidayBonus(dataset3, 5000, 1000, 2000),.001);

	}

	/** 
	 * Test calculateTotalHolidayBonus method with a high of 1000, low of 250 and 500 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {
		//test for each of your data sets
		assertEquals(3000.0,HolidayBonus.calculateTotalHolidayBonus(dataset1, 1000,250,500),.001);
		assertEquals(4250.0,HolidayBonus.calculateTotalHolidayBonus(dataset2, 1000,250,500),.001);
		assertEquals(4500.0,HolidayBonus.calculateTotalHolidayBonus(dataset3, 1000,250,500),.001);
		
	}

}
