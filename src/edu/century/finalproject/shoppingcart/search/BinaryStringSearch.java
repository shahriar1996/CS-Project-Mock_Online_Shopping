package edu.century.finalproject.shoppingcart.search;

public class BinaryStringSearch {

	public static void bubbleSort(String[] stringArray) {
		int n = stringArray.length;
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (stringArray[j - 1].compareTo(stringArray[j]) > 0) {
					temp = stringArray[j - 1];
					stringArray[j - 1] = stringArray[j];
					stringArray[j] = temp;
				}
			}
		}
	}

	public static int binarySearch(String[] words, String value) {
		bubbleSort(words);
		return binarySearch(words, value, 0, words.length - 1);
	}

	/**
	 * Searches an array of words for a given value using a recursive binary search.
	 * Returns the index that contains the value or -1 if the value is not found.
	 */
	private static int binarySearch(String[] words, String value, int min, int max) {
		if (min > max) {
			return -1;
		}

		int mid = (max + min) / 2;

		if (words[mid].equals(value)) {
			return mid;
		} else if (words[mid].compareTo(value) > 0) {
			return binarySearch(words, value, min, mid - 1);
		} else {
			return binarySearch(words, value, mid + 1, max);
		}
	}
}
