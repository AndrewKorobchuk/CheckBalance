package org.korobchukas.checkbalance;

public class CheckBalance {
    public static boolean checkBalance(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        int sum_begin = arr[0];
        int sum_end = arr[arr.length-1];
        boolean result = false;
        while (true){
            if(sum_begin == sum_end && (i==j-1)){
                result = true;
                break;
            }

            if(sum_begin>sum_end){
                j = j - 1;
            }else{
                i = i + 1;
            }
            if(i>=j){
                break;
            }
            if(sum_begin>sum_end) {
                sum_end = sum_end + arr[j];
            }else {
                sum_begin = sum_begin + arr[i];
            }
        }

        return result;
    }
}
