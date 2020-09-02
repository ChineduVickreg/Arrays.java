package Examples;
//An Application that initialises an array variable and calculates the even numbers from 2-20.

public class ArrayInitialization3 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declare a constant
        int[]array = new int[ARRAY_LENGTH];//create the array object

        //calculate value for each array element
        for (int counter =0; counter<array.length; counter++) {
            array[counter] = 2 + (2 * counter);
        }
        System.out.printf("%5s%8s%n", "Index", "Values");
            for (int counter = 0; counter< array.length;counter++){
                System.out.printf("%5d%8s%n", counter, array[counter]);
            }
    }
}
