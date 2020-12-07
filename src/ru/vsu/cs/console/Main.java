package ru.vsu.cs.console;

import ru.vsu.cs.common.FindRequiredElementIndex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int digit = FindRequiredElementIndex.findRequiredElementIndex(readArray());
        printResult(digit);
    }

    public static int[] readArray() {
        int n = readInt("number of array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readInt("array digit: ");
        }
        return arr;
    }

    private static int readInt(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s ", name);
        return scanner.nextInt();
    }

    public static void printResult(int digit) {
        System.out.println("Program result: " + digit);
    }
}