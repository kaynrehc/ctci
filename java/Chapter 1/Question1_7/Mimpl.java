package Question1_7;

import CtCILibrary.AssortedMethods;

import java.util.HashSet;
import java.util.Set;
import java.lang.instrument.Instrumentation;

/**
 * User: mchernyak
 * Date: 1/27/14
 * Time: 9:32 PM
 */
public class Mimpl {
	private static Instrumentation instrumentation;

	public static void printMatrix(int[][] matrix) {
		System.out.println("");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void enrich(int[][] matrix) {
		Set<Integer> rowIndexSet = new HashSet<Integer>();
		Set<Integer> colIndexSet = new HashSet<Integer>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rowIndexSet.add(i);
					colIndexSet.add(j);
				}
			}
		}

		for (Integer n : rowIndexSet) {
			for (int j = 0; j < matrix[n].length; j++) {
				matrix[n][j] = 0;
			}
		}

		for (Integer n : colIndexSet) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][n] = 0;
			}
		}

		System.out.println("***** size of matrix:" + instrumentation.getObjectSize(matrix));
		System.out.println("***** size of rowIndexSet:" + instrumentation.getObjectSize(rowIndexSet));
		System.out.println("***** size of colIndexSet:" + instrumentation.getObjectSize(colIndexSet));

	}

	public static void main(String[] args) {
		int[][] matrix1 = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}, {10, 11, 0}};
		int[][] matrix2 = {{0, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 0}};
		AssortedMethods.printMatrix(matrix1);
		enrich(matrix1);
		AssortedMethods.printMatrix(matrix1);

		AssortedMethods.printMatrix(matrix2);
		enrich(matrix2);
		AssortedMethods.printMatrix(matrix2);
	}
}
