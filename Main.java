import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();
        if (nota >= 0.0 && nota < 3.0){
            System.out.print("II");
        }
        else if (nota > 2.0 && nota < 5.0){
            System.out.print("MI");
        }
        else if (nota >= 4.0 && nota < 8.0){
            System.out.print("MM");
        }
        else if (nota >= 7.0 && nota < 9.5){
            System.out.print("MS");
        }
        else if (nota >= 9.4 && nota <= 10.0){
            System.out.print("SS");
        }
        else{
            System.out.print("Nota inválida");
        }
    }
}