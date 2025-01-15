/* Code by Don M. Curtis */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        displayOutput();

    }
    /**
     * Prompt user to enter numbers and add them to an arrayList
     * 
     * @param no argument is required
     * @return an ArrrayList
     */
    public static ArrayList<Double> arrayListBuilder() {
        ArrayList<Double> numList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        final int EXIT = -1;
        double input;

        do {
            System.out.println("Enter number or -1 to Exit: ");
            input = scan.nextInt();
            if (input != EXIT) {
                numList.add(input);
            }
        } while (input != EXIT);
        scan.close();
        return numList;
    }
    /**
     * Compute the average of the element of an arraylist
     * 
     * @param ArrayList type double
     * @return the average of the sum of the element
     */
    public static double average(ArrayList<Double> arrLst) {
        double sum = 0.0;
        double avg = 0.0;
        int len = arrLst.size();
        if (len > 0) {
            for (int i = 0; i < len; i++) {
                sum += arrLst.get(i);
            }
        }
        avg = sum / len;
        return avg;
    }
    /**
     * Compute the sum of the odd numbers of the arraylist
     * 
     * @param ArrayList type double
     * @return the sum of the odd numbers
     */
    public static int sumOfOddNumber(ArrayList<Double> arrLst){
        int total = 0;
        for (int i = 0; i < arrLst.size(); i++){
            if (arrLst.get(i) % 2 != 0 ) {
                total += arrLst.get(i);
            }
        }
        return total;
    }
    /** Display the ouput of some computation
     * 
     * @param takes no argument
     * @return nothing only print on screen 
     */
    public static void displayOutput() {
        ArrayList<Double> numList = new ArrayList<>();
        numList = arrayListBuilder();
        // Standard deviation = square of the variance
        System.out.println("# of items: " + numList.size());
        System.out.println(String.format("Average: %.2f", average(numList)));
        System.out.println(String.format("Standard Deviation: %.2f", Math.sqrt(average(numList))));
        System.out.println(String.format("Sum of Odd numbers: %d", sumOfOddNumber(numList)));
    }

}