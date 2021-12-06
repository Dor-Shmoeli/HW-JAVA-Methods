package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 696, 9, 8, 52, 74, 8896, 5};
        int[] hasA = {6, 7, 3, 1, 4, 6};
        int[] hasB = {6, 7, 3, 1, 4, 2};
        int[] hasC = {6, 7, 3, 2, 1, 2};

        System.out.println(has12(hasA)+" A");

        System.out.println(has12(hasB)+" B");

        System.out.println(has12(hasC)+" C");

//        createArray(4,200);
//        createArray(3,365);
    }



/*
    public static boolean firstLast3(int[] nums) {
        int length = nums.length - 1;
        int last = nums[length];
        int first = nums[0];
        System.out.println((last ==3) & (first == 3));
        return false;
        // return true if the first value in the array is 3 and the last value in the array.
        // length -1 (LAST) i = 0 (first)

    }*/

/*
    public static int[] createArray(int arrayLength, int lastValue){  // (4, 200)

        int[] arr = new int[arrayLength];
        arr[arr.length -1] = lastValue;
        for (int i : arr) {
       System.out.println(i);
        }
        return new int[arrayLength];

        // return new int[]{0,0,0,200}
        // (LAST) arr.length -1
         }
*/

    public static boolean has12(int[] numbers){


            for (int i = 0; i< numbers.length; i++){
            if(numbers[i] == 1){
               break;
               int j;
               j++;
               continue;
            }


            }
        System.out.println(counter);
        return counter > 1 ;
    }
    // return true if there is value=1 in the array and somewhere later value=2
    // [6,7,3,1,4,6] =>false
    // [6,7,3,1,4,2] =>true
    // [6,7,3,2,1,2] =>true

/*
    // complex
    public static int[] x(int[] arr){ // [4,5,6,7,3,6,4,2]
        // split into groups the array where there is an odd number.
        // create a new array where every group is an item that the value is the sum of the group =>[]
    }



*/
}