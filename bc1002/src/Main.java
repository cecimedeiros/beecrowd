import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double area, raio;
        double n = 3.14159;

        raio = Double.parseDouble(sc.nextLine());

        area = n * (raio * raio);

        System.out.printf("A = %.4f", area);

        sc.close();

    }
}


// area = 3,14(pi) * raio2(raio * raio)