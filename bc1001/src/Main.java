import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, X;
        A = Integer.parseInt(sc.nextLine());
        B = Integer.parseInt(sc.nextLine());

        X = A + B;
        System.out.println("X = " + X);

    }
}