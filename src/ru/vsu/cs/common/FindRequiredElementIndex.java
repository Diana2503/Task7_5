package ru.vsu.cs.common;

public class FindRequiredElementIndex {
    public static int findRequiredElementIndex(int[] arr) {
        int firstElement = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && i % 2 == 0) {
                return i;
            }
        }
        return firstElement;
    }
}
