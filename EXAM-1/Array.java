
import java.util.Scanner;

public class Array {
    private static Scanner sc;

    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, square1, square2, square3, square4, square5;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter any five Number : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();

        square1 = calsquare(n1);
        square2 = calsquare(n2);
        square3 = calsquare(n3);
        square4 = calsquare(n4);
        square5 = calsquare(n5);

        System.out.println(
                "\n The Square of a Given Number  " + n1 + n2 + n3 + n4 + n5 + "  =  " + square1 + " " + square2
                        + " " + square3 + " " + square4 + " " + square5);
    }

    public static int calsquare(int num) {
        return num * num;
    }
}
