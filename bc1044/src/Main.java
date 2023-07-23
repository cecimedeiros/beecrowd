import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v1, v2;

        v1 = Integer.parseInt(sc.nextLine());
        v2 = Integer.parseInt(sc.nextLine());

        if ((v1 % v2 == 0) || (v2 % v1 == 0)){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();

    }
}