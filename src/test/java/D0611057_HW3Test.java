import static org.junit.Assert.*;
import org.junit.Test;

public class D0611057_HW3Test {
	/* 會拋出錯誤之測試 */
	@Test(expected = WrongValueException.class)
	public void testCheckTriangle1() throws WrongValueException {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("wrong", test.checkTriangle(1, 2, 3));
	}

	@Test(expected = WrongValueException.class)
	public void testCheckTriangle2() throws WrongValueException {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("wrong", test.checkTriangle(3, 1, 2));
	}

	@Test(expected = WrongValueException.class)
	public void testCheckTriangle3() throws WrongValueException {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("wrong", test.checkTriangle(-3, 1, 2));
	}

	@Test(expected = WrongValueException.class)
	public void testCheckTriangle4() throws WrongValueException {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("wrong", test.checkTriangle(-3, 1, -2));
	}

	/* 判斷三角形種類之測試 */
	@Test
	public void testCheckTriangle5() throws Exception {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("正三角形", test.checkTriangle(3, 3, 3));
	}

	@Test
	public void testCheckTriangle6() throws Exception {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("等腰直角三角形", test.checkTriangle(1, 1.414, 1));
	}

	@Test
	public void testCheckTriangle7() throws Exception {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("直角三角形", test.checkTriangle(4, 5, 3));
	}

	@Test
	public void testCheckTriangle8() throws Exception {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("等腰三角形", test.checkTriangle(4, 4, 3));
	}

	@Test
	public void testCheckTriangle9() throws Exception {
		D0611057_HW3 test = new D0611057_HW3();
		assertEquals("一般三角形", test.checkTriangle(2, 8, 9));
	}

	/* 排序之測試 */
	@Test
	public void testSort1() {
		D0611057_HW3 test = new D0611057_HW3();
		double[] unsortedArr = { 4, 5, 3 };
		double[] sortedArr = new double[3];
		sortedArr = test.sort(unsortedArr);
		for (int i = 0; i < sortedArr.length - 1; i++) {
			assertTrue(sortedArr[i] <= sortedArr[i + 1]);
		}
	}

	@Test
	public void testSort2() {
		D0611057_HW3 test = new D0611057_HW3();
		double[] unsortedArr = { 1, 1, 1 };
		double[] sortedArr = new double[3];
		sortedArr = test.sort(unsortedArr);
		for (int i = 0; i < sortedArr.length - 1; i++) {
			assertTrue(sortedArr[i] <= sortedArr[i + 1]);
		}
	}

	@Test
	public void testSort3() {
		D0611057_HW3 test = new D0611057_HW3();
		double[] unsortedArr = { 8, -9, -4 };
		double[] sortedArr = new double[3];
		sortedArr = test.sort(unsortedArr);
		for (int i = 0; i < sortedArr.length - 1; i++) {
			assertTrue(sortedArr[i] <= sortedArr[i + 1]);
		}
	}

	@Test
	public void testSort4() {
		D0611057_HW3 test = new D0611057_HW3();
		double[] unsortedArr = { 5, 0, -6 };
		double[] sortedArr = new double[3];
		sortedArr = test.sort(unsortedArr);
		for (int i = 0; i < sortedArr.length - 1; i++) {
			assertTrue(sortedArr[i] <= sortedArr[i + 1]);
		}
	}

	/* 交換之測試 */
	@Test
	public void testSwap1() {
		D0611057_HW3 test = new D0611057_HW3();
		double[] arr = { 3, 5 };
		assertTrue(test.swap(arr, 0, 1));
	}

	@Test
	public void testSwap2() {
		D0611057_HW3 test = new D0611057_HW3();
		double[] arr = { 3, 3 };
		assertTrue(test.swap(arr, 0, 1));
	}

	@Test
	public void testSwap3() {
		D0611057_HW3 test = new D0611057_HW3();
		double[] arr = { -3, 5 };
		assertTrue(test.swap(arr, 0, 1));
	}

	@Test
	public void testSwap4() {
		D0611057_HW3 test = new D0611057_HW3();
		double[] arr = { -3, -5 };
		assertTrue(test.swap(arr, 0, 1));
	}
}