package com.Test;

public class FindUniqueElements {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 2, 3 };
		int count=0;


		System.out.println("Unique elements:");
		for (int i = 0; i < arr.length; i++) {
			count = 0;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				int uniqueCount = 0;
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						uniqueCount++;
						break;
					}
				}
				if (uniqueCount == 0) {
					System.out.println(arr[i]);
				}
			}

		}
	}
}
