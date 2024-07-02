package com.Test;

import java.util.HashSet;

public class FindUniqueElementSet {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 2, 3 };

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!hashSet.contains(num)) {
                hashSet.add(num);
            } else {
                duplicates.add(num);
            }
        }
        

        hashSet.removeAll(duplicates);

        System.out.println("Unique elements:");
        for (int num : hashSet) {
            System.out.println(num);
        }
    }
}
