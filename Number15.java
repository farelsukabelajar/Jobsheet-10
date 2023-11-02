import java.util.Arrays;

public class Number15 {
    public static void main(String[] args) {

        int[][] myNumber = new int[3][];

        myNumber[0] = new int[5];
        myNumber[1] = new int[3];
        myNumber[2] = new int[1];

        for (int i = 0; i < myNumber.length; i++) {
            System.out.println(Arrays.toString(myNumber[i]));
        }

        for (int i = 0; i < myNumber.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + " : " + myNumber[i].length);
        }

    }
}
