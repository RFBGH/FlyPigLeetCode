package com.flypig.leet_code;

import java.util.ArrayList;
import java.util.List;

public class MaxRainGet {

    public static int getTopest(int height[], int start){
        int top = -1;
        for(int i = start, size = height.length; i < size; i++){

            int curr = height[i];
            if(top <= curr){
                top = curr;
                continue;
            }

            return i-1;
        }

        return -1;
    }

    public static int getLowest(int height[], int start){

        int low = Integer.MAX_VALUE;
        for(int i = start, size = height.length; i < size; i++){

            int curr = height[i];
            if(low >= curr){
                low = curr;
                continue;
            }

            return i-1;
        }

        return -1;
    }

    public static int trap(int[] height) {


        List<Integer> tops = new ArrayList<Integer>();

        int index = 0;
        int size = height.length;
        while(index < size){

            index = getTopest(height, index);
            if(index == -1){
                break;
            }
            tops.add(index);

            index = getLowest(height, index);
            if(index == -1){
                break;
            }
        }

        for(int i:tops){
            System.out.println(i);
        }

        int sum = 0;
        return sum;
    }

    public static void main(String[] args){

        int array[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(array));
    }

}
