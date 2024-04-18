import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
        Scanner in = new Scanner(System.in);

        int input1 = in.nextInt();

        ArrayList<Integer> data = new ArrayList<>();

        for (int i = 0; i < input1; i++) {
            int input2 = in.nextInt();
            data.add(input2);
        }

        Collections.sort(data);

        ArrayList<Integer> data1 = new ArrayList<>(); //0,1,2,3
        ArrayList<Integer> data2 = new ArrayList<>(); //2,3,4,1
        
        int n1 = data.get(0);
        int count1 = 1; 

        for (int n = 1; n < data.size(); n++) {
            if (n1 == data.get(n)) {
                count1++;
            } else {
                data1.add(n1);
                data2.add(count1);
                n1 = data.get(n);
                count1 = 1; // Reset count for the new number
            }
        }
        
        // Add the last number and its count
        data1.add(n1);
        data2.add(count1);

        int bignum = data2.get(0);
        int pos = 0;
        for (int m = 1; m < data2.size(); m++) {
            if (data2.get(m) > bignum) {
                bignum = data2.get(m);
                pos = m;
            }
        }

        int mode = data1.get(pos);
        System.out.println(mode);

  }
}
