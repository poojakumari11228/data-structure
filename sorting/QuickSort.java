package DataStructure.sorting;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int num[] = new int[] { 1, 4, 2, 5, 3 };

		quickSort(num, 0, num.length - 1);

		for (int i : num) {

			System.out.println(i);
		}
	}

	private static void quickSort(int[] num, int lowIdx, int highIdx) {

		if (lowIdx >= highIdx)
			return;

		// 1. pivot
		// choose any random thn swap with lastIndex element
		int pivotIdx = new Random().nextInt(highIdx - lowIdx) + lowIdx;

		int pivot = num[pivotIdx];

		swap(num, pivotIdx, highIdx);

		// 2. partition
		// partition left and right side elements of pivot until correct index of pivot
		// is found (i.e leftPointer==rightPointer)
		int leftPointer = partition(num, lowIdx, highIdx, pivot);

		// 3. QuickSort

		// quick sort left side of pivot index
		quickSort(num, lowIdx, leftPointer - 1);

		// quick sort right side of pivot index
		quickSort(num, leftPointer + 1, highIdx);

	}

	private static int partition(int[] num, int lowIdx, int highIdx, int pivot) {
		int leftPointer = lowIdx;
		int rightPointer = highIdx;

		while (leftPointer < rightPointer) {

			while (num[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (num[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			swap(num, leftPointer, rightPointer);

		}

		swap(num, leftPointer, highIdx);
		return leftPointer;
	}

	private static void swap(int[] num, int indx1, int indx2) {

		int temp = num[indx2];
		num[indx2] = num[indx1];
		num[indx1] = temp;

	}

}
