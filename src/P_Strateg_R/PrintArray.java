package P_Strateg_R;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int[] aa = getArray();}

    public static int[] getArray() {
        String nums;
        int numint = 0;
        int xx;
        System.out.print("enter ints: ");
        Scanner in = new Scanner(System.in);
        nums = in.nextLine();
        in.close();

        Scanner scan = new Scanner(nums);
        while (scan.hasNextInt()) {
            xx = scan.nextInt();
            numint++;
        }
        scan.close();

        int[] intArray = new int[numint];
        scan = new Scanner(nums);
        for (int i = 0; i < numint; i++) {
            intArray[i] = scan.nextInt();
        }
        scan.close();
        return intArray;
    }

}

