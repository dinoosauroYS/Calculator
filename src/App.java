import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o primeiro numero que voce quer multiplicar?");
        int x = sc.nextInt();
        System.out.println("Qual o segundo numero que voce quer multiplicar?");
        int y = sc.nextInt();
        System.out.println(x * y);
        
        sc.close();

    }
}
