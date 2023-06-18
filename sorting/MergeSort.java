package DataStructure.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int num[] = new int[] {1,4,2,5,3};

		mergeSort(num);
		
		for(int i : num) {

			System.out.println(i);
		}

	}

	private static void mergeSort(int[] num) {

		int arrLength = num.length;
		int midIndx = arrLength / 2;
		
		if(arrLength<2)
			return;

		int leftArray[] = new int[midIndx];
		int rightArray[] = new int[arrLength - midIndx];

		for (int i = 0; i < midIndx; i++) {
			leftArray[i] = num[i];
		}

		for (int i = midIndx; i < arrLength; i++) {
			rightArray[i-midIndx] = num[i];
		}
		
		// divide
		mergeSort(leftArray);
		mergeSort(rightArray);

		// sort and merge
		merge(num, leftArray, rightArray);

	}

	private static void merge(int[] num, int[] leftArray, int[] rightArray) {

		int i = 0, j = 0, k = 0;

		while (i < leftArray.length && j < rightArray.length) {

			if (leftArray[i] <= rightArray[j]) {
				num[k] = leftArray[i];
				i++;
			} else {
				num[k] = rightArray[j];
				j++;
			}

			k++;

		}

		while (i < leftArray.length) {

			num[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < rightArray.length) {

			num[k] = rightArray[j];
			j++;
			k++;
		}

	}

}
