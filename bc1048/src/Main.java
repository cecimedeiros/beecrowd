import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double novoSalario, reajuste;
        double salarioEntrada = Double.parseDouble(sc.nextLine());

        if ((salarioEntrada >= 0) && (salarioEntrada <= 400.00)){

            reajuste = salarioEntrada * 0.15;
            novoSalario = salarioEntrada + reajuste;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.println();
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.println();
            System.out.printf("Em percentual: 15");


        } else if ((salarioEntrada >= 400.01) && (salarioEntrada <= 800.00)){

            reajuste = salarioEntrada * 0.12;
            novoSalario = salarioEntrada + reajuste;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.println();
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.println();
            System.out.printf("Em percentual: 12");

        } else if ((salarioEntrada >= 800.01) && (salarioEntrada <= 1200.00)){

            reajuste = salarioEntrada * 0.1;
            novoSalario = salarioEntrada + reajuste;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.println();
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.println();
            System.out.printf("Em percentual: 10");

        } else if ((salarioEntrada >= 1200.01) && (salarioEntrada <= 2000.00)){

            reajuste = salarioEntrada * 0.07;
            novoSalario = salarioEntrada + reajuste;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.println();
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.println();
            System.out.printf("Em percentual: 7");

        } else if (salarioEntrada > 2000.00){

            reajuste = salarioEntrada * 0.04;
            novoSalario = salarioEntrada + reajuste;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.println();
            System.out.printf("Reajuste ganho: %.2f", reajuste);
            System.out.println();
            System.out.printf("Em percentual: 4");

        }

        sc.close();

    }
}