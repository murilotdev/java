import java.util.Scanner;
public class Nota {
    public static int num(int x, int y) {
        return (x + y)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.print(num(nota1, nota2));
        
    }
}