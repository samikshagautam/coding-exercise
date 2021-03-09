package educative.linkedlist;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6};
        int[] arr2 = {5,7,8,9,10};

        int[] arr3 = new int[arr1.length+arr2.length];

        for(int i = 0 ; i < arr1.length ; i++){
            arr3[i] = arr1[i];
        }

        for(int i = 0 ; i < arr2.length ; i++){
            arr3[i+arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

    }
}
