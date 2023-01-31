package org.korobchukas.checkbalance;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 1};
        boolean result = CheckBalance.checkBalance(arr1);
        System.out.println(result);

        int[] arr2 = {1, 1, 1, 8, 1};
        result = CheckBalance.checkBalance(arr2);
        System.out.println(result);
    }
}