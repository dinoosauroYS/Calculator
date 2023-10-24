import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Qual o primeiro numero que voce quer dividir?");
        int x = sc.nextInt();
        System.out.println("Qual o segundo numero que voce quer dividir?");
        int y = sc.nextInt();
        System.out.println("resultado:");
        System.out.println(x / y);
        
        }while(true);
        
    }
}
