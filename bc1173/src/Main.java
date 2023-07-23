import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroLido = Integer.parseInt(sc.nextLine());

        System.out.printf("N[%d] = %d\n", 0, numeroLido);
        for (int i = 0; i < 10; i++){
            int numero2 = numeroLido + numeroLido;
            System.out.printf("N[%d] = %d\n", i + 1, numero2);
            numeroLido = numero2;
        }

        sc.close();

    }
}