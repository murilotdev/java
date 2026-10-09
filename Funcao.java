import java.util.Scanner;
public class Funcao {
    public static int num(int x) {
        return x * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int nota = sc.nextInt();
        System.out.print(num(nota));
        
    }
}