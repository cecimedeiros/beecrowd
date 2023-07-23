import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nFunc, valH;
        double horasTrab, salario;

        nFunc = Integer.parseInt(sc.nextLine());
        valH = Integer.parseInt(sc.nextLine());
        horasTrab = Double.parseDouble(sc.nextLine());

        salario = valH * horasTrab;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", nFunc, salario);

    }
}