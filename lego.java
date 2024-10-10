import java.util.Scanner;

public class lego {

    public static void main(String[] args) {
        int a = 5;
        float pi = 3.14f;
        double pi2 = 3.14;
        char g = 'g';
        String nome = "Guilherme";
        boolean teste = false;
        String nomeCompleto = "Guilherme Martinez";
        int idade = 48;

        System.out.println("meu Nome é " + nome);
        
        double n1, n2, n3;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nomeCompleto = entrada.nextLine();

        System.out.println("Digite seu numero");
        n1 = entrada.nextDouble();
        n2 = n1 * 2;
        System.out.println("O dobro de " + n1 + "é " + n2);
        n3 = n2 * n1 / 5;
        n3 = n3 + 6;
        if (n3 > 30) {
            System.out.println("maior");
            
        } else{
    
            System.out.println("menor");

            // Operador ternário (teste) ? se verdedadeiro : se falso
            System.out.println( (n3 > 30) ? "Maior" : "Menor");




    }
}}
