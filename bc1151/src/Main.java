import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 1, n2 = 0;

        int parada = sc.nextInt();
        int verdadeiraParada = parada - 2;

        System.out.println(n2);
        System.out.println(n1);


        for(int i = 0; i < verdadeiraParada; i++){
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println(n1);
        }

        sc.close();

    }
}