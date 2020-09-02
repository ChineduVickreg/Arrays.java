package Examples;
//An Application that shows the initialization of an Array.

import sun.awt.SunHints;

public class ArrayInitialization {
    public static void main(String[] args) {
      //Declaring an array variable and initializing it.
       // int[]array = new int[10];
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.printf("%5s%8s%n ", "Index", "Value");

        //output each array element's value
        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n ", counter,array[counter]);
        }
    }
}
