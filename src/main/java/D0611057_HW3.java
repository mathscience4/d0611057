import java.util.Scanner;

public class D0611057_HW3 {

	/* 判斷三邊長副程式 */
	public static String checkTriangle(double a, double b, double c) throws WrongValueException {
		double[] unsortedArr = { a, b, c };
		double[] sortedArr = new double[3];
		System.arraycopy(sort(unsortedArr), 0, sortedArr, 0, sortedArr.length);
		double error = 1;
		/* 判斷各條件(更加簡潔) */
		boolean wrongInput = (sortedArr[0] <= 0) && (sortedArr[1] <= 0) && (sortedArr[2] <= 0);
		boolean wrongTriCondition = sortedArr[0] + sortedArr[1] <= sortedArr[2];
		boolean equilateralTriCondition = (sortedArr[0] == sortedArr[1]) && (sortedArr[1] == sortedArr[2]);
		boolean isoscelesTriConditon = (sortedArr[0] == sortedArr[1]) || (sortedArr[1] == sortedArr[2]);
		boolean rightTriCondition = Math.abs(
				(sortedArr[0] * sortedArr[0]) + (sortedArr[1] * sortedArr[1]) - (sortedArr[2] * sortedArr[2])) < error;
		if (wrongTriCondition || wrongInput) {
			throw new WrongValueException();
		} else {
			if (equilateralTriCondition) {
				return "正三角形";
			} else if (isoscelesTriConditon && rightTriCondition) {
				return "等腰直角三角形";
			} else if (rightTriCondition) {
				return "直角三角形";
			} else if (isoscelesTriConditon) {
				return "等腰三角形";
			} else {
				return "一般三角形";
			}
		}
	}

	/* 排序副程式 */
	public static double[] sort(double[] arr) {
		double[] copyArr = new double[3];
		System.arraycopy(arr, 0, copyArr, 0, arr.length);
		for (int i = 0; i < copyArr.length - 1; i++) {
			for (int j = 0; j < copyArr.length - i - 1; j++) {
				if (copyArr[j] > copyArr[j + 1]) {
					swap(copyArr, j, j + 1);
				}
			}
		}
		return copyArr;
	}

	/* 交換副程式 */
	public static boolean swap(double[] arr, int i, int j) {
		double beforeSortedDiff = arr[i] - arr[j], afterSortedDiff = 0;
		double temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		afterSortedDiff = arr[i] - arr[j];
		if (beforeSortedDiff + afterSortedDiff == 0) {
			return true;
		} else {
			return false;
		}
	}
}

/* 創建自定義例外 */
class WrongValueException extends Exception {
	public WrongValueException(String name) {
		super(name);
	}

	public WrongValueException() {
		super("輸入錯誤!!!");
	}
}
