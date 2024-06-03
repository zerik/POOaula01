import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Booleano: ");
        boolean b = scanner.nextBoolean();
        System.out.println("Double: ");
        double d = scanner.nextDouble();
        System.out.println("String: ");
        scanner.nextLine();
        String s = scanner.nextLine();

        scanner.close();

        System.out.printf("Inteiro lido: %d \n", numero);
        System.out.printf("Booleano lido: %b \n", b);
        System.out.printf("Double lido: %.4f \n", d);
        System.out.printf("String lido: %s \n", s);
    }
}
