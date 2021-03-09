package coding.exercise;

import java.util.Arrays;

public  class SecondLargestElement {

    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7,8};
        System.out.println(Arrays.asList(findSecondMax(arr)));
    }
    }

