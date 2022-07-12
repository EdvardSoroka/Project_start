package java_se.Arrays;

import java.util.Arrays;

public class arrchetnechet {
    public static void main(String[] args) {
        int[] array_nums = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        int[] arr_chet = new int[10];
        int[] arr_nechet = new int[10];

        for(int i = 0; i < array_nums.length; i++){
            if(array_nums[i]%2 == 0){
                arr_chet[i] = array_nums[i];
        for(int j = 0; j < array_nums.length; j++)
            if(array_nums[j] != 0){
                arr_nechet[j] = array_nums[j];
                }
            }
        }
        System.out.println(Arrays.toString(array_nums));
        System.out.println(Arrays.toString(arr_chet));
        System.out.println(Arrays.toString(arr_nechet));
    }
}

