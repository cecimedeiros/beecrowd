import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 1, n2 = 0;
        ArrayList <Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0); fibonacci.add(1);

        for(int i = 0; i < 61; i++){
            n1 = n1 + n2;
            n2 = n1 - n2;
            fibonacci.add(n1);
        }

        int numeroLeituras = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < numeroLeituras; i++){
            int numeroInformado = Integer.parseInt(sc.nextLine());
            System.out.printf("Fib(%d) = %d\n", numeroInformado, fibonacci.get(numeroInformado));
        }

        sc.close();

    }
}
