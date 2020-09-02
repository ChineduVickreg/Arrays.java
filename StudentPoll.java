package Examples;
//An Application that records the ratings of students
// from a scale of 1-5 on the quality of food in the
// student's cafeteria

public class StudentPoll {
    public static void main(String[] args) {
      //students response array (more typically inputs at runtime)
      int[] response = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
      int[] frequency =new int[6]; //array of frequency counters

        //for each answer, select responses element and use that value
        //as frequency index to determine element to increments
        for (int answer = 0; answer < response.length; answer++) {
            try {
                ++frequency[response[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); //invokes toString method
                System.out.printf("response[%d] = ", answer, frequency[answer]);
            }
        }
        System.out.printf("%s%10s%n ", "Rating", "Frequency");

        //Output each array elements value
        for (int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d%n ", rating, frequency[rating]);
        }
    }
}
