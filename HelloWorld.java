import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Olá " + nome + "!");

        input.close();
        System.exit(0);
    }
}