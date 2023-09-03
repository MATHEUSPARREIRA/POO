import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Adicao somando = new Adicao();

        System.out.println("Digite o primeiro número: ");
        int n1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = ler.nextInt();

        int resultado = somando.soma(n1, n2);

        System.out.println("A soma dos números é " + resultado);
    }
}