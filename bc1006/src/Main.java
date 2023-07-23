import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A,B,C;

        A = Double.parseDouble(sc.nextLine());
        B = Double.parseDouble(sc.nextLine());
        C = Double.parseDouble(sc.nextLine());

        double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f", MEDIA);

    }
}

// a com peso 2, b com peso 3, c com peso 5, soma tudo e divide pela soma dos pesos