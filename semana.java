import java.util.Scanner;

public class semana {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("digite o numero do dia da semana de 0 a 6: ");
        int diasemana = scanner.nextInt();


        if (diasemana==0) {
        System.out.println("domingo");

        } else if (diasemana==5) {
            System.out.println("sextou");
            
        }else if (diasemana==6) {
            System.out.println("sabadou");
            
        }else if (diasemana >= 1 && diasemana <= 4) {
            System.out.println("trabalhar");
        } else {
            System.out.println("digite apenas numero de 0 a 6");
        }
    }
}
    


